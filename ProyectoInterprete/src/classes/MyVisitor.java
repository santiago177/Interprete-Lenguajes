package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

import classes.PSeintParser.ExprContext;
import misc.Array;
import misc.Function;
import misc.Symbol;

class Pair<J, K> {
	public J first;
	public K second;
	public Pair(J first, K second) {
		this.first = first;
		this.second = second;
	}
	public Pair() {			
	}
}

public class MyVisitor<T> extends PSeintBaseVisitor<T> {	
	
	static final double precision = 1e-9;
	static HashMap<String, String> typeName = new HashMap<>();
	static HashMap<String, Symbol> functions = new HashMap<>();
	//static HashMap<String, HashMap<String, Symbol>> tables = new HashMap<>();
	static Stack<HashMap<String, Symbol>> tables = new Stack<>();
	//static Stack<String> currentContext = new Stack<>();
	static boolean isVoid = true;
	static String currentType;
	
	static {
		typeName.put("string", "cadena");
		typeName.put("int", "entero");
		typeName.put("real", "real");
		typeName.put("boolean", "logico");
		typeName.put("char", "caracter");
	}
	
	static void semanticError(int line, int col, String info) {
		System.err.println(String.format("<%d:%d> Error semantico:%s\n", line, col, info));
		System.exit(-1);
	}
	
	static void runtimeError(int line, int col, String info) {
		System.err.println(String.format("<%d:%d> Error en tiempo de ejecucion:%s\n", line, col, info));
		System.exit(-1);
	}
	
	static Pair<Object, String> getArrayValue(Array array, ArrayList<Integer> indexes, ArrayList<Integer> dimensions, String type, ExprContext ctx) {
		Pair<Object, String> ans = new Pair<>();
		int idx = 0;
		int dim = 1;
		for(int i = indexes.size()-1; i >= 0; i--) {
			int index = indexes.get(i);				
			int dimension = array.dimensions.get(i);
			if(index < 0 || index >= dimension) {
				int line = ctx.expr().start.getLine();
				int col = ctx.expr().start.getCharPositionInLine()+1;
				runtimeError(line, col, String.format(" Se accedio a una posicion no valida del arreglo: %s", index));
			}
			idx += index*dim;
			dim *= dimension;
		}
		ans.first = array.array[idx];
		ans.second = type;
		return ans;
	}
	
	static void putArrayValue(Array array, ArrayList<Integer> indexes, ArrayList<Integer> dimensions, String type, ExprContext ctx, Object value) {
		int idx = 0;
		int dim = 1;
		for(int i = indexes.size()-1; i >= 0; i--) {
			int index = indexes.get(i);				
			int dimension = array.dimensions.get(i);
			if(index < 0 || index >= dimension) {
				int line = ctx.start.getLine();
				int col = ctx.start.getCharPositionInLine()+1;
				runtimeError(line, col, String.format(" Se accedio a una posicion no valida del arreglo: %s", index));
			}
			idx += index*dim;
			dim *= dimension;
		}
		array.array[idx] = value;
	}
	
	static boolean isQuote(char c) {
		return c == '\'' || c == '"';
	}
	
	@Override
	public T visitArgs(PSeintParser.ArgsContext ctx) {
		ArrayList<Symbol> args = (ArrayList<Symbol>) visitArgl(ctx.argl());
		return (T)args;
	}
	
	@Override
	public T visitArgl(PSeintParser.ArglContext ctx) {
		ArrayList<Symbol> args = new ArrayList<>();
		if(ctx != null) {
			Symbol sy = new Symbol(ctx.ID().getText(), null);
			args = (ArrayList<Symbol>)visitL10(ctx.l10());
			args.add(sy);
		}
		return (T)args;
	}
	
	@Override
	public T visitL10(PSeintParser.L10Context ctx) {
		ArrayList<Symbol> args = new ArrayList<>();
		if(ctx.ID() != null) {
			Symbol sy = new Symbol(ctx.ID().getText(), null);
			args = (ArrayList<Symbol>)visitL10(ctx.l10());
			args.add(sy);
		}
		return (T)args;
	}
	
	@Override
	public T visitEndsubproc(PSeintParser.EndsubprocContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	public T visitSubpr(PSeintParser.SubprContext ctx) {
		String name;
		if (ctx.ID().size() == 1) {
			name = ctx.ID(0).getText();
			if (functions.containsKey(name)) {
				int line = ctx.ID(0).getSymbol().getLine();
				int col = ctx.ID(0).getSymbol().getCharPositionInLine() + 1;
				semanticError(line, col, String.format(" el simbolo con nombre %s ya ha sido declarado.", name));
			} else {
				Function func = new Function(name, "function");
				func.block = ctx.block();
				func.args = (ArrayList<Symbol>)visitArgs(ctx.args());
				functions.put(name, func);
				//tables.put(name, null);
				//HashMap<String, Symbol> table = tables.get(name);
			}
		} else {
			name = ctx.ID(1).getText();
			if (functions.containsKey(name)) {
				int line = ctx.ID(1).getSymbol().getLine();
				int col = ctx.ID(1).getSymbol().getCharPositionInLine() + 1;
				semanticError(line, col, String.format(" el simbolo con nombre %s ya ha sido declarado.", name));
			} else {
				Function func = new Function(name, "function");
				func.returnId = ctx.ID(0).getText();
				func.block = ctx.block();
				func.args = (ArrayList<Symbol>)visitArgs(ctx.args());
				functions.put(name, func);
				//tables.put(name, new HashMap<>());
				//HashMap<String, Symbol> table = tables.get(name);
			}
		}
		return null;
	}
	
	@Override
	public T visitSubprl(PSeintParser.SubprlContext ctx) {
		if(ctx.subpr() != null) {
			visitSubpr(ctx.subpr());
			visitSubprl(ctx.subprl());
		}
		return null;
	}
	
	@Override
	public T visitS(PSeintParser.SContext ctx) {
		//System.out.println("in proc");
		visitSubprl(ctx.subprl());
		String name = ctx.ID().getText();
		if(functions.containsKey(name)) {
			int line = ctx.ID().getSymbol().getLine();
			int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
			semanticError(line, col, String.format(" el simbolo con nombre \"%s\" ya ha sido declarado.", name));
		}
		tables.push(new HashMap<>());
		Symbol func = new Symbol(name, "function");
		func.value = ctx.block();		
		functions.put(name, func);
		//currentContext.push(name);		
		visitBlock(ctx.block());
		return null;
	}
	
	@Override
	public T visitExpr(PSeintParser.ExprContext ctx) {
		Pair<Object, String> ans = new Pair<>();
		if(ctx.TOKEN_O() != null) {
			Pair<Object, String> left = (Pair)visitExpr(ctx.expr());
			Pair<Object, String> right = (Pair)visitEA(ctx.eA());
			if(!left.second.equals("boolean")) {
				int line = ctx.expr().start.getLine();
				int col = ctx.expr().start.getCharPositionInLine()+1;
				semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba %s; se encontro: %s", "logico", typeName.get(left.second)));
			}
			if( !right.second.equals("boolean")) {
				int line = ctx.eA().start.getLine();
				int col = ctx.eA().start.getCharPositionInLine()+1;
				semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba %s; se encontro: %s", "logico", typeName.get(right.second)));
			}
			else {
				boolean l = (boolean)left.first;
				boolean r = (boolean)right.first;
				ans.first = l||r;
				ans.second = "boolean";
			}
		}
		else {
			ans = (Pair)visitEA(ctx.eA());
		}
		return (T)ans;
	}
	
	@Override
	public T visitEA(PSeintParser.EAContext ctx) {
		Pair<Object, String> ans = new Pair<>();
		if(ctx.TOKEN_Y() != null) {
			Pair<Object, String> left = (Pair)visitEA(ctx.eA());
			Pair<Object, String> right = (Pair)visitEB(ctx.eB());
			if(!left.second.equals("boolean")) {
				int line = ctx.eA().start.getLine();
				int col = ctx.eA().start.getCharPositionInLine()+1;
				semanticError(line, col, String.format("tipos de datos incompatibles. Se esperaba %s; se encontro: %s", "logico", typeName.get(left.second)));
			}
			if(!right.second.equals("boolean")) {
				int line = ctx.eB().start.getLine();
				int col = ctx.eB().start.getCharPositionInLine()+1;
				semanticError(line, col, String.format("tipos de datos incompatibles. Se esperaba %s; se encontro: %s", "logico", typeName.get(right.second)));
			}
			else {
				boolean l = (boolean)left.first;
				boolean r = (boolean)right.first;
				ans.first = l&&r;
				ans.second = "boolean";
			}
		}
		else {
			ans = (Pair)visitEB(ctx.eB());
		}
		return (T)ans;
	}
	
	@Override
	public T visitEB(PSeintParser.EBContext ctx) {
		Pair<Object, String> ans = new Pair<>();
		if(ctx.TOKEN_IGUAL() != null) {
			Pair<Object, String> left = (Pair)visitEB(ctx.eB());
			Pair<Object, String> right = (Pair)visitEC(ctx.eC());			
			if(left.second.equals("string") || right.second.equals("string")) {
				if(!left.second.equals("string")){
					int line = ctx.eB().start.getLine();
					int col = ctx.eB().start.getCharPositionInLine()+1;
					semanticError(line, col, String.format("tipos de datos incompatibles. Se esperaba %s; se encontro: %s", "cadena", typeName.get(left.second)));
				}
				else if(!right.second.equals("string")) {
					int line = ctx.eC().start.getLine();
					int col = ctx.eC().start.getCharPositionInLine()+1;
					semanticError(line, col, String.format("tipos de datos incompatibles. Se esperaba %s; se encontro: %s", "cadena", typeName.get(right.second)));
				}
				else {
					ans.first = ((String)left.first).equals((String)right.first);
					ans.second = "boolean";
				}
			}
			else if(left.second.equals("boolean") || right.second.equals("boolean")) {
				if(!left.second.equals("boolean")){
					int line = ctx.eB().start.getLine();
					int col = ctx.eB().start.getCharPositionInLine()+1;
					semanticError(line, col, String.format("tipos de datos incompatibles. Se esperaba %s; se encontro: %s", "logico", typeName.get(left.second)));
				}
				else if(!right.second.equals("boolean")) {
					int line = ctx.eC().start.getLine();
					int col = ctx.eC().start.getCharPositionInLine()+1;
					semanticError(line, col, String.format("tipos de datos incompatibles. Se esperaba %s; se encontro: %s", "logico", typeName.get(right.second)));
				}
				else {
					boolean l = (boolean)left.first;
					boolean r = (boolean)right.first;
					ans.first = l==r;
					ans.second = "boolean";
				}
			}
			else {
				if(left.second.equals("real") || right.second.equals("real")) {
					double l = left.first instanceof Integer?((Integer)left.first).doubleValue() : (double)left.first;
					double r = right.first instanceof Integer?((Integer)right.first).doubleValue() : (double)right.first;;
					ans.first = Math.abs(l-r) < precision;
					ans.second = "boolean";
				}
				else {
					int l = (int)left.first;
					int r = (int)right.first;
					ans.first = l==r;
					ans.second = "boolean";
				}
			}
		}
		else if(ctx.TOKEN_DIF() != null) {
			Pair<Object, String> left = (Pair)visitEB(ctx.eB());
			Pair<Object, String> right = (Pair)visitEC(ctx.eC());
			if(left.second.equals("string") || right.second.equals("string")) {
				if(!left.second.equals("string")){
					int line = ctx.eB().start.getLine();
					int col = ctx.eB().start.getCharPositionInLine()+1;
					semanticError(line, col, String.format("tipos de datos incompatibles. Se esperaba %s; se encontro: %s", "cadena", typeName.get(left.second)));
				}
				else if(!right.second.equals("string")) {
					int line = ctx.eC().start.getLine();
					int col = ctx.eC().start.getCharPositionInLine()+1;
					semanticError(line, col, String.format("tipos de datos incompatibles. Se esperaba %s; se encontro: %s", "cadena", typeName.get(right.second)));
				}
				else {
					ans.first = !((String)left.first).equals((String)right.first);
					ans.second = "boolean";
				}
			}
			else if(left.second.equals("boolean") || right.second.equals("boolean")) {
				if(!left.second.equals("boolean")){
					int line = ctx.eB().start.getLine();
					int col = ctx.eB().start.getCharPositionInLine()+1;
					semanticError(line, col, String.format("tipos de datos incompatibles. Se esperaba %s; se encontro: %s", "logico", typeName.get(left.second)));
				}
				else if(!right.second.equals("boolean")) {
					int line = ctx.eC().start.getLine();
					int col = ctx.eC().start.getCharPositionInLine()+1;
					semanticError(line, col, String.format("tipos de datos incompatibles. Se esperaba %s; se encontro: %s", "logico", typeName.get(right.second)));
				}
				else {
					boolean l = (boolean)left.first;
					boolean r = (boolean)right.first;
					ans.first = l!=r;
					ans.second = "boolean";
				}
			}
			else {
				if(left.second.equals("real") || right.second.equals("real")) {
					double l = left.first instanceof Integer?((Integer)left.first).doubleValue() : (double)left.first;
					double r = right.first instanceof Integer?((Integer)right.first).doubleValue() : (double)right.first;;
					ans.first = Math.abs(l-r) > precision;
					ans.second = "boolean";
				}
				else {
					int l = (int)left.first;
					int r = (int)right.first;
					ans.first = l!=r;
					ans.second = "boolean";
				}
			}			
		}
		else {
			ans = (Pair)visitEC(ctx.eC());
		}
		return (T)ans;
	}

	@Override
	public T visitEC(PSeintParser.ECContext ctx) {
		Pair<Object, String> ans = new Pair<>();
		if(ctx.TOKEN_MENOR() != null) {
			Pair<Object, String> left = (Pair)visitEC(ctx.eC());
			Pair<Object, String> right = (Pair)visitED(ctx.eD());
			if(left.second.equals("boolean") || right.second.equals("boolean")) {
				if(left.second.equals("boolean")){
					int line = ctx.eC().start.getLine();
					int col = ctx.eC().start.getCharPositionInLine()+1;
					semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba entero o real o cadena; se encontro: %s", left.second));
				}
				if(right.second.equals("boolean")){
					int line = ctx.eD().start.getLine();
					int col = ctx.eD().start.getCharPositionInLine()+1;
					semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba entero o real o cadena; se encontro: %s", right.second));
				}
			}
			else {				
				if(left.second.equals("string") || right.second.equals("string")) {
					if(!left.second.equals("string")){
						int line = ctx.eC().start.getLine();
						int col = ctx.eC().start.getCharPositionInLine()+1;
						semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba cadena; se encontro: %s", left.second));
					}
					else if(!right.second.equals("string")){
						int line = ctx.eD().start.getLine();
						int col = ctx.eD().start.getCharPositionInLine()+1;
						semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba cadena; se encontro: %s", right.second));
					}
					else {
						ans.first = ((String)left.first).compareTo((String)right.first) > 0;
						ans.second = "boolean";
					}
				}
				else {
					double l = left.first instanceof Integer?((Integer)left.first).doubleValue() : (double)left.first;
					double r = right.first instanceof Integer?((Integer)right.first).doubleValue() : (double)right.first;;
					ans.first = l<r;
					ans.second = "boolean";
				}
			}
		}
		else if(ctx.TOKEN_MENOR_IGUAL() != null) {
			Pair<Object, String> left = (Pair)visitEC(ctx.eC());
			Pair<Object, String> right = (Pair)visitED(ctx.eD());
			if(left.second.equals("boolean") || right.second.equals("boolean")) {
				if(left.second.equals("boolean")){
					int line = ctx.eC().start.getLine();
					int col = ctx.eC().start.getCharPositionInLine()+1;
					semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba entero o real o cadena; se encontro: %s", left.second));
				}
				if(right.second.equals("boolean")){
					int line = ctx.eD().start.getLine();
					int col = ctx.eD().start.getCharPositionInLine()+1;
					semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba entero o real o cadena; se encontro: %s", right.second));
				}
			}
			else {		
				if(left.second.equals("string") || right.second.equals("string")) {
					if(!left.second.equals("string")){
						int line = ctx.eC().start.getLine();
						int col = ctx.eC().start.getCharPositionInLine()+1;
						semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba cadena; se encontro: %s", left.second));
					}
					else if(!right.second.equals("string")){
						int line = ctx.eD().start.getLine();
						int col = ctx.eD().start.getCharPositionInLine()+1;
						semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba cadena; se encontro: %s", right.second));
					}
					else {
						ans.first = ((String)left.first).compareTo((String)right.first) > 0;
						ans.second = "boolean";
					}
				}
				else {
					double l = left.first instanceof Integer?((Integer)left.first).doubleValue() : (double)left.first;
					double r = right.first instanceof Integer?((Integer)right.first).doubleValue() : (double)right.first;;
					ans.first = l<=r;
					ans.second = "boolean";
				}
			}
		}
		else if(ctx.TOKEN_MAYOR()!= null) {
			Pair<Object, String> left = (Pair)visitEC(ctx.eC());
			Pair<Object, String> right = (Pair)visitED(ctx.eD());
			if(left.second.equals("boolean") || right.second.equals("boolean")) {
				if(left.second.equals("boolean")){
					int line = ctx.eC().start.getLine();
					int col = ctx.eC().start.getCharPositionInLine()+1;
					semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba entero o real o cadena; se encontro: %s", left.second));
				}
				if(right.second.equals("boolean")){
					int line = ctx.eD().start.getLine();
					int col = ctx.eD().start.getCharPositionInLine()+1;
					semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba entero o real o cadena; se encontro: %s", right.second));
				}
			}
			else {				
				if(left.second.equals("string") || right.second.equals("string")) {
					if(!left.second.equals("string")){
						int line = ctx.eC().start.getLine();
						int col = ctx.eC().start.getCharPositionInLine()+1;
						semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba cadena; se encontro: %s", left.second));
					}
					else if(!right.second.equals("string")){
						int line = ctx.eD().start.getLine();
						int col = ctx.eD().start.getCharPositionInLine()+1;
						semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba cadena; se encontro: %s", right.second));
					}
					else {
						ans.first = ((String)left.first).compareTo((String)right.first) > 0;
						ans.second = "boolean";
					}
				}
				else {
					double l = left.first instanceof Integer?((Integer)left.first).doubleValue() : (double)left.first;
					double r = right.first instanceof Integer?((Integer)right.first).doubleValue() : (double)right.first;;
					ans.first = l>r;
					ans.second = "boolean";
				}
			}
		}
		else if(ctx.TOKEN_MAYOR_IGUAL() != null) {
			Pair<Object, String> left = (Pair)visitEC(ctx.eC());
			Pair<Object, String> right = (Pair)visitED(ctx.eD());
			if(left.second.equals("boolean") || right.second.equals("boolean")) {
				if(left.second.equals("boolean")){
					int line = ctx.eC().start.getLine();
					int col = ctx.eC().start.getCharPositionInLine()+1;
					semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba entero o real o cadena; se encontro: %s", typeName.get(left.second)));
				}
				if(right.second.equals("boolean")){
					int line = ctx.eD().start.getLine();
					int col = ctx.eD().start.getCharPositionInLine()+1;
					semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba entero o real o cadena; se encontro: %s", typeName.get(right.second)));
				}
			}
			else {				
				if(left.second.equals("string") || right.second.equals("string")) {
					if(!left.second.equals("string")){
						int line = ctx.eC().start.getLine();
						int col = ctx.eC().start.getCharPositionInLine()+1;
						semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba cadena; se encontro: %s", typeName.get(left.second)));
					}
					else if(!right.second.equals("string")){
						int line = ctx.eD().start.getLine();
						int col = ctx.eD().start.getCharPositionInLine()+1;
						semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba cadena; se encontro: %s", typeName.get(right.second)));
					}
					else {
						ans.first = ((String)left.first).compareTo((String)right.first) > 0 || ((String)left.first).equals((String)right.first);
						ans.second = "boolean";
					}
				}
				else {
					double l = left.first instanceof Integer?((Integer)left.first).doubleValue() : (double)left.first;
					double r = right.first instanceof Integer?((Integer)right.first).doubleValue() : (double)right.first;;
					ans.first = l>=r;
					ans.second = "boolean";
				}
			}
		}
		else {
			ans = (Pair)visitED(ctx.eD());
		}		
		return (T)ans;
	}

	@Override
	public T visitED(PSeintParser.EDContext ctx) {
		Pair<Object, String> ans = new Pair<>();
		if(ctx.TOKEN_MAS() != null) {
			Pair<Object, String> left = (Pair)visitED(ctx.eD());
			Pair<Object, String> right = (Pair)visitEE(ctx.eE());
			//System.out.printf("in sum %s %s\n", left.second, right.second);
			if(!isNumeric(left.second)) {
				int line = ctx.eD().start.getLine();
				int col = ctx.eD().start.getCharPositionInLine()+1;
				semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba entero o real; se encontro: %s", typeName.get(left.second)));
			}
			else if(!isNumeric(right.second)) {
				int line = ctx.eD().start.getLine();
				int col = ctx.eD().start.getCharPositionInLine()+1;
				semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba entero o real; se encontro: %s", typeName.get(right.second)));
			}
			else {
				double l = left.first instanceof Integer?((Integer)left.first).doubleValue() : (double)left.first;
				double r = right.first instanceof Integer?((Integer)right.first).doubleValue() : (double)right.first;
				double t = l+r;
				if(Math.abs(t - (int)t) < precision) {
					ans.first = (int)t;
					ans.second = "int";
				}
				else {
					ans.first = t;
					ans.second = "real";
				}				
			}
		}
		else if(ctx.TOKEN_MENOS() != null) {
			Pair<Object, String> left = (Pair)visitED(ctx.eD());
			Pair<Object, String> right = (Pair)visitEE(ctx.eE());
			if(!(left.second.equals("int") || left.second.equals("real")) || !(right.second.equals("int") || right.second.equals("real"))) {
				//semanticError();
			}
			else {
				double l = left.second.equals("int")?((Integer)left.first).doubleValue() : (double)left.first;
				double r = right.second.equals("int")?((Integer)right.first).doubleValue() : (double)right.first;
				double t = l-r;
				if(Math.abs(t - (int)t) < precision) {
					ans.first = (int)t;
					ans.second = "int";
				}
				else {
					ans.first = t;
					ans.second = "real";
				}				
			}
		}
		else {
			ans = (Pair)visitEE(ctx.eE());			
		}
		return (T)ans;
	}

	@Override
	public T visitEE(PSeintParser.EEContext ctx) {
		Pair<Object, String> ans = new Pair<>();
		if(ctx.TOKEN_MUL() != null) {
			Pair<Object, String> left = (Pair)visitEE(ctx.eE());
			Pair<Object, String> right = (Pair)visitEF(ctx.eF());
			if(!(left.second.equals("int") || left.second.equals("real")) || !(right.second.equals("int") || right.second.equals("real"))) {
				//semanticError();
			}
			else {
				double l = left.first instanceof Integer?((Integer)left.first).doubleValue() : (double)left.first;
				double r = right.first instanceof Integer?((Integer)right.first).doubleValue() : (double)right.first;
				double t = l*r;
				if(Math.abs(t - (int)t) < precision) {
					ans.first = (int)t;
					ans.second = "int";
				}
				else {
					ans.first = t;
					ans.second = "real";
				}				
			}
		}
		else if(ctx.TOKEN_DIV() != null) {
			Pair<Object, String> left = (Pair)visitEE(ctx.eE());
			Pair<Object, String> right = (Pair)visitEF(ctx.eF());
			if(!(left.second.equals("int") || left.second.equals("real")) || !(right.second.equals("int") || right.second.equals("real"))) {
				//semanticError();
			}
			else {
				double l = left.first instanceof Integer?((Integer)left.first).doubleValue() : (double)left.first;
				double r = right.first instanceof Integer?((Integer)right.first).doubleValue() : (double)left.first;
				double t = l/r;
				if(Math.abs(t - (int)t) < precision) {
					ans.first = (int)t;
					ans.second = "int";
				}
				else {
					ans.first = t;
					ans.second = "real";
				}				
			}
		}
		else if(ctx.TOKEN_MOD() != null) {
			Pair<Object, String> left = (Pair)visitEE(ctx.eE());
			Pair<Object, String> right = (Pair)visitEF(ctx.eF());
			if(!left.second.equals("int") || !right.second.equals("int")) {
				//semanticError();
			}
			else {
				int l = (int)left.first;
				int r = (int)right.first;
				ans.first = l%r;
				ans.second = "int";
			}
		}
		else {
			ans = (Pair)visitEF(ctx.eF());
		}		
		return (T)ans;
	}

	@Override
	public T visitEF(PSeintParser.EFContext ctx) {
		Pair<Object, String> ans = new Pair<>();
		if(ctx.TOKEN_POT() != null) {
			Pair<Object, String> left = (Pair)visitEF(ctx.eF());
			Pair<Object, String> right = (Pair)visitEG(ctx.eG());
			if(!(left.second.equals("int") || left.second.equals("real")) || !(right.second.equals("int") || right.second.equals("real"))) {
				//semanticError();
			}
			else {
				double l = left.first instanceof Integer?((Integer)left.first).doubleValue() : (double)left.first;
				double r = right.first instanceof Integer?((Integer)right.first).doubleValue() : (double)right.first;				
				double t = Math.pow(l, r);
				if(Math.abs(t - (int)t) < precision) {
					ans.first = (int)t;
					ans.second = "int";
				}
				else {
					ans.first = t;
					ans.second = "real";
				}				
			}
		}
		else {
			ans = (Pair)visitEG(ctx.eG());
		}
		return (T)ans;
	}

	@Override
	public T visitEG(PSeintParser.EGContext ctx) {
		Pair<Object, String> ans = new Pair<>();
		if(ctx.TOKEN_NEG() != null) {
			Pair<Object, String> elem = (Pair)visitEG(ctx.eG());
			if(!elem.second.equals("boolean") ) {
				//semanticError();
			}
			else {				
				boolean e = (boolean)elem.first;
				ans.first = !e;
				ans.second = "boolean";
			}
		}
		else {
			ans = (Pair)visitEH(ctx.eH());
		}
		return (T)ans;
	}

	@Override
	public T visitEH(PSeintParser.EHContext ctx) {
		Pair<Object, String> ans = new Pair<>();
		if(ctx.tok() != null) {
			ans = (Pair)visitTok(ctx.tok());
		}
		else {
			ans = (Pair)visitExpr(ctx.expr());
		}
		return (T)ans;
	}		
	
	@Override
	public T visitIdl(PSeintParser.IdlContext ctx) {
		ArrayList<Symbol> list = new ArrayList<>();
		if(ctx != null && ctx.ID() != null) {
			list = (ArrayList<Symbol>)visitIdl(ctx.idl());
			list.add(new Symbol(ctx.ID().getText(), currentType));
		}
		return (T)list;
	}
		
	@Override
	public T visitTipo(PSeintParser.TipoContext ctx) {
		String ans = "";
		if(ctx.TEXTO() != null || ctx.CARACTER() != null || ctx.CADENA() != null)
			ans = "string";
		else if(ctx.NUMERO() != null || ctx.ENTERO() != null || ctx.NUMERICO() != null)
			ans = "int";
		else if(ctx.REAL() != null)
			ans = "real";
		else if(ctx.LOGICO() != null)
			ans = "boolean";
		return (T)ans;
	}	
	
	@Override
	public T visitDef(PSeintParser.DefContext ctx) {
		String id = ctx.ID().getText();
		String type = (String)visitTipo(ctx.tipo());
		currentType = type;
		//System.out.printf("in def type = %s\n", currentType);
		//System.out.println(currentContext.isEmpty();
		//String funcname = currentContext.peek();
		HashMap<String, Symbol> table = tables.peek();
		ArrayList<Symbol> variables = (ArrayList<Symbol>)visitIdl(ctx.idl());
		variables.add(new Symbol(id, type));
		for(Symbol s: variables) {
			//System.out.printf("var %s\n", s.id);
			if(table.containsKey(s.id)) {
				int line = ctx.ID().getSymbol().getLine();
				int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
				semanticError(line, col, String.format(" el simbolo con nombre \"%s\" ya ha sido declarado.", s.id));
			}
			else {
				table.put(s.id, new Symbol(s.id, s.type));
			}
		}
		return null;
	}
	 
	static boolean isNumeric(String type) {
		return type.equals("int") | type.equals("real");
	}
	
	@Override
	public T visitCor(PSeintParser.CorContext ctx) {
		ArrayList<Integer> indexes;
		Pair<Object, String> p = (Pair)visitExpr(ctx.expr());
		indexes = (ArrayList<Integer>)visitExprl(ctx.exprl());
		if(!p.second.equals("int") && !p.second.equals("real")) {
			int line = ctx.expr().start.getLine();
			int col = ctx.expr().start.getCharPositionInLine()+1;
			semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba %s; se encontro: %s", "entero", typeName.get(p.second)));
		}
		if(p.second.equals("real")) {
			double val = (double)p.first;
			int t = (int)val;
			if(Math.abs(t - val) < precision) {
				p.first = t;
				p.second = "int";					
			}
			else {			
				int line = ctx.expr().start.getLine();
				int col = ctx.expr().start.getCharPositionInLine()+1;
				semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba %s; se encontro: %s", "entero", "real"));
			}
		}
		indexes.add((int)p.first);
		return (T)indexes;
	}
	
	@Override
	public T visitAsig(PSeintParser.AsigContext ctx) {
		//System.out.println("in asig");
		String id = ctx.ID().getText();
		HashMap<String, Symbol> table = tables.peek();	
		if(ctx.cor() == null) {
			if(table.containsKey(id)) {
				Symbol sy = table.get(id);
				//System.out.printf("symbol from table id %s type %s\n", sy.id, sy.type);
				Pair<Object, String> res = (Pair)visitExpr(ctx.expr());
				if(res.second.equals(sy.type) || (isNumeric(res.second) && isNumeric(sy.type))) {
					if(sy.type.equals("int") && res.second.equals("real")) {
						int line = ctx.expr().start.getLine();
						int col = ctx.expr().start.getCharPositionInLine()+1;
						semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba: %s; se encontro:%s.", "entero", "real"));
					}
					else
						sy.value = res.first;
				}
				else {
					int line = ctx.expr().start.getLine();
					int col = ctx.expr().start.getCharPositionInLine()+1;
					semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba: %s; se encontro:%s.", typeName.get(sy.type), typeName.get(res.second)));
				}
			}
			else {
				int line = ctx.expr().start.getLine();
				int col = ctx.expr().start.getCharPositionInLine()+1;
				semanticError(line, col, String.format(" la variable con nombre \"%s\" no ha sido declarada.", id));
			}
		}
		else {
			if(table.containsKey(id)) {				
				ArrayList<Integer> indexes = (ArrayList<Integer>)visitCor(ctx.cor());
				Pair<Object, String> res = (Pair)visitExpr(ctx.expr());
				Symbol sy = table.get(id);
				Array array = sy.arrayValue;			
				Object putValue = res.first;
				if(!sy.arrayType.equals(res.second)) {
					if(sy.arrayType.equals("real") && res.second.equals("int")) 
						putValue = ((Integer)putValue).doubleValue();					
					else if(sy.arrayType.equals("int") && res.second.equals("real")) {
						double r = (double)putValue;
						int t = (int)r;
						if(Math.abs(r-t) < precision) 
							putValue = t;
						else {
							int line = ctx.expr().start.getLine();
							int col = ctx.expr().start.getCharPositionInLine()+1;
							semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba: %s; se encontro:%s.", typeName.get(sy.arrayType), typeName.get(res.second)));
						}
					}
					else {
						int line = ctx.expr().start.getLine();
						int col = ctx.expr().start.getCharPositionInLine()+1;
						semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba: %s; se encontro:%s.", typeName.get(sy.arrayType), typeName.get(res.second)));
					}
				}
				putArrayValue(array, indexes, array.dimensions, sy.arrayType, ctx.cor().expr(), putValue);	
			}
			else {
				int line = ctx.expr().start.getLine();
				int col = ctx.expr().start.getCharPositionInLine()+1;
				semanticError(line, col, String.format(" la variable con nombre \"%s\" no ha sido declarada.", id));
			}						
		}
		return null;
	}
	

	@Override
	public T visitRead(PSeintParser.ReadContext ctx) {
		
		return null;
	}
	
	@Override
	public T visitArray(PSeintParser.ArrayContext ctx) {
		String name = ctx.ID().getText();
		HashMap<String, Symbol> table = tables.peek();
		if(table.containsKey(name)) {
			Symbol sy = table.get(name);			
			Pair<Object, String> p = (Pair)visitExpr(ctx.expr());
			if(!p.second.equals("int") && !p.second.equals("real")) {
				int line = ctx.expr().start.getLine();
				int col = ctx.expr().start.getCharPositionInLine()+1;
				semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba %s; se encontro: %s", "entero", typeName.get(p.second)));
			}
			if(p.second.equals("real")) {
				double val = (double)p.first;
				int t = (int)val;
				if(Math.abs(t - val) < precision) {
					p.first = t;
					p.second = "int";					
				}
				else {			
					int line = ctx.expr().start.getLine();
					int col = ctx.expr().start.getCharPositionInLine()+1;
					semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba %s; se encontro: %s", "entero", "real"));
				}
			}
			sy.array = true;
			sy.arrayType = sy.type;
			sy.type = "array";
			ArrayList<Integer> arrayList = (ArrayList<Integer>)visitExprl(ctx.exprl());
			arrayList.add((int)p.first);
			int size = 1;
			for(int elem: arrayList) 
				size *= elem;
			Array array = new Array();
			array.dimensions = arrayList;
			array.array = new Object[size];
			sy.arrayValue = array;
		}
		else {
			int line = ctx.ID().getSymbol().getLine();
			int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
			semanticError(line, col, String.format(" la variable con nombre \"%s\" no ha sido declarada.", name));
		}
		return null;
	}
	
	@Override
	public T visitCls(PSeintParser.ClsContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	public T visitSpwait(PSeintParser.SpwaitContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	public T visitComid(PSeintParser.ComidContext ctx) {
		if(ctx.def() != null) {
			visitDef(ctx.def());
		}
		else if(ctx.asig() != null) {
			visitAsig(ctx.asig());
		}
		else if(ctx.call() != null) {
			Pair<Object, String> ret;
			ret = (Pair)visitCall(ctx.call());
			if(ret.first != null) {
				int line = ctx.call().start.getLine();
				int col = ctx.call().start.getCharPositionInLine()+1;
				semanticError(line, col, String.format(" la funcion \"%s\" retorna un valor que debe ir en una expresion.", ctx.call().ID()));
			}
		} 
		else if (ctx.write() != null) {
			visitWrite(ctx.write());
		} 
		else if (ctx.read() != null) {
			visitRead(ctx.read());
		} 
		else if (ctx.array() != null) {
			visitArray(ctx.array());
		} 
		else if (ctx.cls() != null) {
			visitCls(ctx.cls());
		}
		else if(ctx.spwait() != null) {
			visitSpwait(ctx.spwait());
		}
		else {
			System.out.println("error fatal");
		}
		return null;
	}
	
	@Override
	public T visitCom(PSeintParser.ComContext ctx) {
		visitComid(ctx.comid());
		return null;
	}
	
        @Override public T visitStif(PSeintParser.StifContext ctx) { 
                Pair<Object, String> ans = new Pair<>();
                ans = (Pair) visitExpr(ctx.expr());
                if( ans.second.equals("boolean") ){
                    if( (boolean) ans.first ){
                        visitBlock(ctx.block());
                    }else{
                        if( ctx.elif() != null ){
                            visitElif(ctx.elif());
                        }
                    }
                }else{
                    int line = ctx.expr().start.getLine();
                    int col = ctx.expr().start.getCharPositionInLine()+1;
                    semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba: logico; se encontro:%s.",typeName.get(ans.second)));                                                                
                }
                return null;
        }
        
        @Override public T visitElif(PSeintParser.ElifContext ctx) { 
                if( ctx.block() != null ){
                    visitBlock(ctx.block());
                }
                return null;
        }
        
        @Override public T visitStwhile(PSeintParser.StwhileContext ctx) { 
                Pair<Object, String> ans = new Pair<>();
                ans = (Pair) visitExpr(ctx.expr());
                if( ans.second.equals("boolean") ){
                    while( (boolean) ans.first ){
                        visitBlock(ctx.block());
                        ans = (Pair) visitExpr(ctx.expr());
                    }
                }else{
                    int line = ctx.expr().start.getLine();
                    int col = ctx.expr().start.getCharPositionInLine()+1;
                    semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba: logico; se encontro:%s.",typeName.get(ans.second)));                                                                
                }
                return null;
        }
        
        @Override public T visitDowhile(PSeintParser.DowhileContext ctx) { 
                Pair<Object, String> ans = new Pair<>();
                do{ 
                    visitBlock(ctx.block());    
                    ans = (Pair) visitExpr(ctx.expr());
                    if( !ans.second.equals("boolean") ){
                        int line = ctx.expr().start.getLine();
                        int col = ctx.expr().start.getCharPositionInLine()+1;
                        semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba: logico; se encontro:%s.",typeName.get(ans.second)));                                                                
                    }
                }while( !(boolean) ans.first );
                return null;
        }
        
        @Override public T visitStdefault(PSeintParser.StdefaultContext ctx) { 
            if( ctx.block() != null ){
                visitBlock(ctx.block());
            }
            return null; 
        }
        
        boolean enteroption = false;
        int opt = 0;
        @Override public T visitL4(PSeintParser.L4Context ctx) { 
            if( ctx.expr() != null ){
                Pair<Object, String> ans = new Pair<>();
                ans = (Pair) visitExpr(ctx.expr());
                if( !ans.second.equals("int") ){
                    int line = ctx.expr().start.getLine();
                    int col = ctx.expr().start.getCharPositionInLine()+1;
                    semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba: entero; se encontro:%s.",typeName.get(ans.second)));                                            
                }
                int option = (int) ans.first;
                if( option == opt ){
                    enteroption = true;
                    visitBlock(ctx.block());
                }else{
                    visitL4(ctx.l4());
                }
            }
            return null;
        }
        
        @Override public T visitCasel(PSeintParser.CaselContext ctx) {
                if( ctx.expr() != null ){
                    Pair<Object, String> ans = new Pair<>();
                    ans = (Pair) visitExpr(ctx.expr());
                    if( !ans.second.equals("int") ){
                        int line = ctx.expr().start.getLine();
                        int col = ctx.expr().start.getCharPositionInLine()+1;
                        semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba: entero; se encontro:%s.",typeName.get(ans.second)));                        
                    }
                    int option = (int) ans.first;
                    if( option==opt ){
                        enteroption = true;
                        visitBlock(ctx.block());
                    }
                    else{
                        visitL4(ctx.l4());
                    }
                }
                if( !enteroption ){
                    visitStdefault(ctx.stdefault());
                }
                return null;
        }
        
        @Override public T visitStswitch(PSeintParser.StswitchContext ctx) { 
                Pair<Object, String> ans = new Pair<>();
                ans = (Pair) visitExpr(ctx.expr());
                if( ans.second.equals("int") ){
                    opt = (int) ans.first;
                    visitCasel(ctx.casel());
                }else{
                    int line = ctx.expr().start.getLine();
                    int col = ctx.expr().start.getCharPositionInLine()+1;
                    semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba: entero; se encontro:%s.",typeName.get(ans.second)));                    
                }
                return null; 
        } 
        
        @Override public T visitT9(PSeintParser.T9Context ctx) { 
            if( ctx.cor() != null ){
                visitCor(ctx.cor());
            }
            return null;
        }
        
        @Override public T visitIdxorv(PSeintParser.IdxorvContext ctx) { 
            if( ctx.ID() != null ){
                String id = ctx.ID().getText();
                visitT9(ctx.t9());
                return (T)id;
            }
            return null; 
        }
        
        @Override public T visitOasig(PSeintParser.OasigContext ctx) { 
            if( ctx.idxorv() != null ){
                String id = (String) visitIdxorv(ctx.idxorv());
		HashMap<String, Symbol> table = tables.peek();		
		if(table.containsKey(id)) {
			Symbol sy = table.get(id);
			Pair<Object, String> res = (Pair)visitExpr(ctx.expr());
			if(res.second.equals(sy.type) || (isNumeric(res.second) && isNumeric(sy.type))) {
				if(sy.type.equals("int") && res.second.equals("real")) {
					int line = ctx.expr().start.getLine();
					int col = ctx.expr().start.getCharPositionInLine()+1;
					semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba: %s; se encontro:%s.", "int", "real"));
				}
                                else{
                                    sy.value = res.first;
                                    return (T)res;
                                }
			}
			else {
				int line = ctx.expr().start.getLine();
				int col = ctx.expr().start.getCharPositionInLine()+1;
				semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba: %s; se encontro:%s.", typeName.get(sy.type), typeName.get(res.second)));
			}
		}
		else {
			int line = ctx.expr().start.getLine();
			int col = ctx.expr().start.getCharPositionInLine()+1;
			semanticError(line, col, String.format(" la variable con nombre \"%s\" no ha sido declarada.", id));
		}
            }     
            return null;                                 
        }
        
        @Override public T visitStep(PSeintParser.StepContext ctx) { 
            if( ctx.expr() != null ){
                return visitExpr(ctx.expr());
            }
            return null;
        }
        
        //stfor : PARA oasig HASTA expr step HACER block FINPARA ;
        @Override public T visitStfor(PSeintParser.StforContext ctx) { 
        	System.out.println("in for");
            if( ctx.oasig() != null ){
                Pair<Object, String> ans = new Pair<>();
                Pair<Object, String> ans2 = new Pair<>();
                ans = (Pair)visitOasig(ctx.oasig());
                if( !ans.second.equals("int") ){
                    int line = ctx.expr().start.getLine();
                    int col = ctx.expr().start.getCharPositionInLine()+1;
                    semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba: entero; se encontro:%s.",typeName.get(ans.second)));
                }
                int init = (int) ans.first;
                ans2 = (Pair)visitExpr(ctx.expr());
                if( !ans2.second.equals("int") ){
                    int line = ctx.expr().start.getLine();
                    int col = ctx.expr().start.getCharPositionInLine()+1;
                    semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba: entero; se encontro:%s.",typeName.get(ans2.second)));
                }
                int limit = (int)ans2.first;
                int inc = 1; 
                if( visitStep(ctx.step()) != null ){
                    Pair<Object, String> ans3 = new Pair<>();
                    ans3 = (Pair) visitStep(ctx.step());
                    if( !ans3.second.equals("int") ){
                        int line = ctx.expr().start.getLine();
                        int col = ctx.expr().start.getCharPositionInLine()+1;
                        semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba: entero; se encontro:%s.",typeName.get(ans3.second)));                        
                    }
                    inc = (int) ans3.first;
                }
                for (int i = init; i <= limit ; i = i + inc) {
                    visitBlock(ctx.block());
                    String id = (String)ctx.oasig().idxorv().ID().getText();                    
                    HashMap<String, Symbol> table = tables.peek(); 
                    System.out.printf("id %s value %d inc %d\n", id, (int)table.get(id).value, inc);
                    Symbol sy = table.get(id);
                    sy.value = (int)sy.value+inc;
                }
            }
            return null;
        }
                       
        @Override
	public T visitStatement(PSeintParser.StatementContext ctx) {
                if( ctx.stif() != null ){
                    return visitStif(ctx.stif());
                }else if( ctx.stwhile() != null ){
                    return visitStwhile(ctx.stwhile());
                }else if( ctx.dowhile() != null ){
                    return visitDowhile(ctx.dowhile());
                }else if( ctx.stswitch() != null ){
                    return visitStswitch(ctx.stswitch());
                }else if( ctx.stfor() != null ){
                    return visitStfor(ctx.stfor());
                }
		return null;
	}
	
	@Override
	public T visitL5(PSeintParser.L5Context ctx) {
		if(ctx.storcom() != null) {
			visitStorcom(ctx.storcom());
			visitL5(ctx.l5());
		}
		return null;
	}
	
	@Override
	public T visitStorcom(PSeintParser.StorcomContext ctx) {
		if(ctx.statement() != null) {
			visitStatement(ctx.statement());
		}
		else {
			visitCom(ctx.com());
		}
		return null;
	}
	
	@Override
	public T visitBlock(PSeintParser.BlockContext ctx) {
		if(ctx.storcom() != null) {
			visitStorcom(ctx.storcom());
			visitL5(ctx.l5());
		}
		return null;
	}
	
	@Override
	public T visitFuncexprl(PSeintParser.FuncexprlContext ctx) {
		ArrayList<Pair> ans = new ArrayList<>();
		if(ctx != null && ctx.expr() != null) {
			if(ctx.expr() != null) {
				Pair p = (Pair)visitExpr(ctx.expr());
				ans = (ArrayList<Pair>)visitFuncexprl(ctx.funcexprl());
				ans.add(p);
			}
		}
		return (T)ans;
	}
	
	
	@Override
	public T visitCall(PSeintParser.CallContext ctx) {				
		Pair<Object, String> ans = new Pair<>();
		String name = ctx.ID().getText();
		//System.out.printf("in call name %s\n", name);
		if(functions.containsKey(name)) {
			//System.out.println("in");			
			Function func = (Function)functions.get(name);						
			ArrayList<Pair> args = (ArrayList<Pair>)visitFuncexprl(ctx.funcexprl());								
			if(ctx.expr() != null) {
				Pair value = (Pair)visitExpr(ctx.expr());
				args.add(value);
			}			
			tables.push(new HashMap<>());
			HashMap<String, Symbol> table = tables.peek();
			if(func.args.size() == args.size()) {
				for(int i = 0; i < args.size(); i++) {
					String id = func.args.get(i).id;
					Symbol sy = new Symbol(id, (String)args.get(i).second);
					sy.value = args.get(i).first;
					//System.out.println("put "+id);
					table.put(id, sy);
				}
			}
			else {
				int line = ctx.TOKEN_PAR_IZQ().getSymbol().getLine();
				int col = ctx.TOKEN_PAR_IZQ().getSymbol().getCharPositionInLine()+1;
				semanticError(line, col, String.format(" el numero de argumentos que recibe la funcion no corresponde con en numero de argumentos pasados."));
			}
			//returnStack.push(func.returnId);
			//currentContext.push(name);
			visitBlock(func.block);
			//System.out.println("return value "+ func.returnId);
			if(func.returnId != null) {
				Symbol ret = table.get(func.returnId);
				ans.first = ret.value;
				ans.second = ret.type;
			}
			else {
				ans.first = null;
				ans.second = null;
			}
			tables.pop();			
		}
		else {
			int line = ctx.ID().getSymbol().getLine();
			int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
			semanticError(line, col, String.format(" la funcion con nombre \"%s\" no ha sido declarada.", name));
		}
		return (T)ans;
	}
	
	@Override
	public T visitTok(PSeintParser.TokContext ctx) {
		Pair<Object, String> ans = new Pair();
		if(ctx.number() != null && ctx.TOKEN_MENOS() == null) {
			Pair temp = (Pair)visitNumber(ctx.number());
			if(temp.second.equals("int")) {
				ans.first = (int)temp.first;
			}
			else {
				ans.first = (double)temp.first;
			}
			ans.second = (String)temp.second;
		}
		else if(ctx.TOKEN_CADENA() != null) {
			String str = ctx.TOKEN_CADENA().toString();
			ans.first = str.substring(1, str.length()-1);
			ans.second = "string";
		}
		else if(ctx.ID() != null) {
			HashMap<String, Symbol> table = tables.peek();
			String name = ctx.ID().getText();
			if(table.containsKey(name)) {
				Symbol sy = table.get(name);
				ans.first = sy.value;
				ans.second = sy.type;
			}
			else {
				int line = ctx.ID().getSymbol().getLine();
				int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
				semanticError(line, col, String.format(" la variable con nombre \"%s\" no ha sido declarada.", name));
			}
			if(ans.first == null) {
				int line = ctx.ID().getSymbol().getLine();
				int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
				semanticError(line, col, String.format(" la variable con nombre \"%s\" no ha sido inicializada.", ctx.getText()));
			}
		}
		else if(ctx.call() != null) {			
			Pair<Object, String> val = (Pair)visitCall(ctx.call());			
			if(val.second.equals("string")) {
				ans.first = (String)val.first;
				ans.second = val.second;
			}
			else if(val.second.equals("int")) {
				ans.first = (int)val.first;
				ans.second = val.second;
			}
			else if(val.second.equals("real")) {
				ans.first = val.first instanceof Integer? ((Integer)val.first).doubleValue(): val.first;
				ans.second = val.second;
			}
			else if(val.second.equals("boolean")){
				ans.first = (boolean)val.first;
				ans.second = val.second;
			}
			else if(val.second.equals("char")){
				ans.first = (char)val.first;
				ans.second = val.second;
			}
			else {
				System.out.println("error fatal");
			}
		}
		else if(ctx.idarray() != null) {
			ans = (Pair)visitIdarray(ctx.idarray());
			if(ans.first == null) {
				int line = ctx.start.getLine();
				int col = ctx.start.getCharPositionInLine()+1;
				semanticError(line, col, String.format(" la variable con nombre \"%s\" no ha sido inicializada.", ctx.getText()));
			}
		}
		else if(ctx.VERDADERO() != null) {
			ans.first = true;
			ans.second = "boolean";
		}
		else if(ctx.FALSO() != null) {
			ans.first = false;
			ans.second = "boolean";
		}
		else if(ctx.TOKEN_MENOS() != null) {
			Pair temp = (Pair)visitNumber(ctx.number());
			if(temp.second.equals("int")) {
				int n = (int)temp.first;
				n *= -1;
				ans.first = n;
			}
			else {
				double n = (double)temp.first;
				n *= -1;
				ans.first = n;
			}
			
			ans.second = (String)temp.second;
		}		
		return (T)ans;
	}
	
	@Override
	public T visitExprl(PSeintParser.ExprlContext ctx) {
		ArrayList<Integer> ans = new ArrayList<>();
		if(ctx.expr() != null) {
			Pair<Object, String> p = (Pair)visitExpr(ctx.expr());
			if(!p.second.equals("int") && !p.second.equals("real")) {
				int line = ctx.expr().start.getLine();
				int col = ctx.expr().start.getCharPositionInLine()+1;
				semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba %s; se encontro: %s", "entero", typeName.get(p.second)));
			}
			if(p.second.equals("real")) {
				double val = (double)p.first;
				int t = (int)val;
				if(Math.abs(t - val) < precision) {
					p.first = t;
					p.second = "int";					
				}
				else {			
					int line = ctx.expr().start.getLine();
					int col = ctx.expr().start.getCharPositionInLine()+1;
					semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba %s; se encontro: %s", "entero", "real"));
				}
			}
			ans = (ArrayList<Integer>)visitExprl(ctx.exprl());
			ans.add((int)p.first);
		}
		return (T)ans;
	}
	
	@Override
	public T visitIdarray(PSeintParser.IdarrayContext ctx) {
		Pair<Object, String> ans = new Pair();
		String name = ctx.ID().getText();
		HashMap<String, Symbol> table = tables.peek();
		if(table.containsKey(name)){
			Array array = table.get(name).arrayValue;
			Pair <Object, String> p = (Pair)visitExpr(ctx.expr());
			if(!p.second.equals("int") && !p.second.equals("real")) {
				int line = ctx.expr().start.getLine();
				int col = ctx.expr().start.getCharPositionInLine()+1;
				semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba %s; se encontro: %s", "entero", typeName.get(p.second)));
			}
			if(p.second.equals("real")) {
				double val = (double)p.first;
				int t = (int)val;
				if(Math.abs(t - val) < precision) {
					p.first = t;
					p.second = "int";					
				}
				else {			
					int line = ctx.expr().start.getLine();
					int col = ctx.expr().start.getCharPositionInLine()+1;
					semanticError(line, col, String.format(" tipos de datos incompatibles. Se esperaba %s; se encontro: %s", "entero", "real"));
				}
			}
			ArrayList<Integer> indexes = (ArrayList<Integer>)visitExprl(ctx.exprl());		
			indexes.add((int)p.first);
			int idx = 0;
			int dim = 1;
			//System.out.printf("%s %s %s\n", array, indexes, array.dimensions);
			Pair<Object, String> val = getArrayValue(array, indexes, array.dimensions, table.get(name).arrayType, ctx.expr());
			ans = val;
		}
		else {
			int line = ctx.ID().getSymbol().getLine();
			int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
			semanticError(line, col, String.format(" la variable con nombre \"%s\" no ha sido declarada.", name));
		}
		return (T)ans;
	}
	
	@Override
	public T visitNumber(PSeintParser.NumberContext ctx) {
		Pair<Object, String> ans = new Pair();
		if(ctx.TOKEN_ENTERO() != null) {
			ans.first = Integer.parseInt(ctx.TOKEN_ENTERO().toString());
			ans.second = "int";
		}
		else {
			ans.first = Double.parseDouble(ctx.TOKEN_REAL().toString());
			ans.second = "real";
		}
		return (T)ans;
	}
	
	@Override
	public T visitWrite(PSeintParser.WriteContext ctx) {
		//System.out.println("at write");
		Pair  p = (Pair)visitExpr(ctx.expr());
		//System.out.println("first "+p.first);
		String start = p.first.toString();
		if(p.second.equals("boolean"))
			start = (boolean)p.first?"verdadero":"falso";
		String end = (String) visitL3(ctx.l3());
		System.out.printf("%s %s\n", start, end);
		return null;
	}
	
	@Override
	public T visitL3(PSeintParser.L3Context ctx) {
		String ans = "";
		if(ctx.expr() != null) {
			Pair<Object, String> expr = (Pair)visitExpr(ctx.expr());
			String end = (String)visitL3(ctx.l3());
			String app = expr.first.toString();
			if(expr.second.equals("boolean"))
				app = (boolean)expr.first?"verdadero":"falso";
			ans = app+" "+end;
		}
		
		return (T)ans;
	}
}









