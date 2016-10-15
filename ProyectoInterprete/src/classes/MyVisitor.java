package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

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
	
	static final String main = "_main";
	static final double precision = 1e-9;
	static HashMap<String, String> typeName = new HashMap<>();
	static HashMap<String, Symbol> functions = new HashMap<>();
	static HashMap<String, HashMap<String, Symbol>> tables = new HashMap<>();
	static Stack<String> currentContext = new Stack<>();
	static boolean isVoid = true;
	static String returnValue = null;
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
				semanticError(line, col, String.format("la funcion con nombre %s ya ha sido declarada", name));
			} else {
				Function func = new Function(name, "function");
				func.block = ctx.block();
				func.args = (ArrayList<Symbol>)visitArgs(ctx.args());
				functions.put(name, func);
				tables.put(name, null);
				HashMap<String, Symbol> table = tables.get(name);
			}
		} else {
			name = ctx.ID(1).getText();
			if (functions.containsKey(name)) {
				int line = ctx.ID(1).getSymbol().getLine();
				int col = ctx.ID(1).getSymbol().getCharPositionInLine() + 1;
				semanticError(line, col, String.format("la funcion con nombre %s ya ha sido declarada", name));
			} else {
				Function func = new Function(name, "function");
				func.returnId = ctx.ID(0).getText();
				func.value = ctx.block();
				func.args = (ArrayList<Symbol>)visitArgs(ctx.args());
				functions.put(name, func);
				tables.put(name, new HashMap<>());
				currentContext.push(main);
				HashMap<String, Symbol> table = tables.get(name);
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
		tables.put(main, new HashMap<>());
		Symbol func = new Symbol(main, "function");
		func.value = ctx.block();		
		functions.put(main, func);
		currentContext.push(main);
		visitSubprl(ctx.subprl());
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
				semanticError(line, col, String.format("tipos de datos incompatibles. Se esperaba %s; se encontro: %s", "logico", typeName.get(left.second)));
			}
			if( !right.second.equals("boolean")) {
				int line = ctx.eA().start.getLine();
				int col = ctx.eA().start.getCharPositionInLine()+1;
				semanticError(line, col, String.format("tipos de datos incompatibles. Se esperaba %s; se encontro: %s", "logico", typeName.get(right.second)));
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
				//semanticError();
			}
			else {				
				if(left.second.equals("string")) {
					if(!right.second.equals("string")){
						//semanticError();
					}
					else {
						ans.first = ((String)left.first).compareTo((String)right.first) < 0;
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
				//semanticError();
			}
			else {		
				if(left.second.equals("string")) {
					if(!right.second.equals("string")){
						//semanticError();
					}
					else {
						ans.first = ((String)left.first).compareTo((String)right.first) < 0 || ((String)left.first).equals((String)right.first);
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
				//semanticError();
			}
			else {				
				if(left.second.equals("string")) {
					if(!right.second.equals("string")){
						//semanticError();
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
				//semanticError();
			}
			else {				
				if(left.second.equals("string")) {
					if(!right.second.equals("string")){
						//semanticError();
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
			if(!(left.second.equals("int") || left.second.equals("real")) || !(right.second.equals("int") || right.second.equals("real"))) {
				//semanticError();
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
		String funcname = currentContext.peek();
		HashMap<String, Symbol> table = tables.get(funcname);
		ArrayList<Symbol> variables = (ArrayList<Symbol>)visitIdl(ctx.idl());
		variables.add(new Symbol(id, type));
		for(Symbol s: variables) {
			//System.out.printf("var %s\n", s.id);
			if(table.containsKey(s.id)) {
				int line = ctx.ID().getSymbol().getLine();
				int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
				semanticError(line, col, String.format("el simbolo con nombre \"%s\" ya ha sido declarado.", s.id));
			}
			else {
				table.put(s.id, new Symbol(s.id, s.type));
			}
		}
		return null;
	}
		
	@Override
	public T visitAsig(PSeintParser.AsigContext ctx) {
		//System.out.println("in asig");
		String id = ctx.ID().getText();
		HashMap<String, Symbol> table = tables.get(currentContext.peek());		
		if(table.containsKey(id)) {
			Symbol sy = table.get(id);
			//System.out.printf("symbol from table id %s type %s\n", sy.id, sy.type);
			Pair<Object, String> res = (Pair)visitExpr(ctx.expr());
			if(res.second.equals(sy.type)) {
				sy.value = res.first;
			}
			else {
				int line = ctx.expr().start.getLine();
				int col = ctx.expr().start.getCharPositionInLine()+1;
				semanticError(line, col, String.format("tipos de datos incompatibles. Se esperaba: %s; se encontro:%s.", typeName.get(sy.type), typeName.get(res.second)));
			}
		}
		else {
			int line = ctx.expr().start.getLine();
			int col = ctx.expr().start.getCharPositionInLine()+1;
			semanticError(line, col, String.format("la variable con nombre \"%s\" no ha sido declarada.", id));
		}
		return null;
	}
	
	@Override
	public T visitRead(PSeintParser.ReadContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	public T visitArray(PSeintParser.ArrayContext ctx) {
		return visitChildren(ctx);
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
			visitCall(ctx.call());
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
	
	@Override
	public T visitStatement(PSeintParser.StatementContext ctx) {
		return visitChildren(ctx);
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
		if(ctx != null) {
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
		//System.out.println("in call");
		Pair<Object, String> ans = new Pair<>();
		String name = ctx.ID().getText();
		//System.out.println("functions");
		if(functions.containsKey(name)) {
			tables.put(name, new HashMap<>());
			Function func = (Function)functions.get(name);			
			HashMap<String, Symbol> table = tables.get(name);
			ArrayList<Pair> args = (ArrayList<Pair>)visitFuncexprl(ctx.funcexprl());					
			if(ctx.expr() != null) {
				//System.out.println("here");
				Pair value = (Pair)visitExpr(ctx.expr());
				args.add(value);
			}
			if(func.args.size() == args.size()) {
				for(int i = 0; i < args.size(); i++) {
					String id = func.args.get(i).id;
					Symbol sy = new Symbol(id, (String)args.get(i).second);
					sy.value = args.get(i).first;
					table.put(id, sy);
				}
			}
			else {
				int line = ctx.expr().start.getLine();
				int col = ctx.expr().start.getCharPositionInLine()+1;
				semanticError(line, col, String.format("el numero de argumentos que recibe la funcion no corresponde con en numero de argumentos pasados."));
			}
			returnValue = func.returnId;
			currentContext.push(name);
			visitBlock(func.block);
			if(returnValue != null) {
				Symbol ret = table.get(returnValue);
				ans.first = ret;
				ans.second = ret.type;
			}
			else {
				ans.first = null;
				ans.second = null;
			}
			returnValue = null;
			tables.remove(currentContext.peek());
			currentContext.pop();
		}
		else {
			//semanticError();
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
			HashMap<String, Symbol> table = tables.get(currentContext.peek());
			String name = ctx.ID().getText();
			if(table.containsKey(name)) {
				Symbol sy = table.get(name);
				ans.first = sy.value;
				ans.second = sy.type;
			}
			else {
				int line = ctx.ID().getSymbol().getLine();
				int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
				semanticError(line, col, String.format("la variable con nombre \"%s\" no ha sido declarada.", name));
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
				ans.first = (double)val.first;
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
		String start = ((Pair)visitExpr(ctx.expr())).first.toString();
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
			ans = expr.first.toString()+" "+end;
		}
		
		return (T)ans;
	}
}









