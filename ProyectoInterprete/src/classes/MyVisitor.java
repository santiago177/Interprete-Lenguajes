package classes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

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
	static HashMap<String, Symbol> functions = new HashMap<>();
	static HashMap<String, HashMap<String, Symbol>> tables = new HashMap<>();
	static Stack<String> currentContext = new Stack<>();
	
	static void semanticError(int line, int col) {
		System.exit(-1);
	}
	
	static boolean isQuote(char c) {
		return c == '\'' || c == '"';
	}
	
	@Override
	public T visitSubpr(PSeintParser.SubprContext ctx) {
		String name;
		if (ctx.ID().size() == 1) {
			name = ctx.ID(0).getText();
			if (functions.containsKey(name)) {
				int line = ctx.ID(0).getSymbol().getLine();
				int col = ctx.ID(0).getSymbol().getCharPositionInLine() + 1;
				semanticError(line, col);
			} else {
				Symbol func = new Symbol(name, "function");
				func.value = ctx.block();
				functions.put(name, func);
				tables.put(name, new HashMap<>());
				HashMap<String, Symbol> table = tables.get(name);
			}
		} else {
			name = ctx.ID(1).getText();
			if (functions.containsKey(name)) {
				int line = ctx.ID(1).getSymbol().getLine();
				int col = ctx.ID(1).getSymbol().getCharPositionInLine() + 1;
				semanticError(line, col);
			} else {
				Symbol func = new Symbol(name, "function");
				func.value = ctx.block();
				functions.put(name, func);
				tables.put(name, new HashMap<>());
				HashMap<String, Symbol> table = tables.get(name);
			}
		}
		return visitChildren(ctx);
	}

	@Override
	public T visitS(PSeintParser.SContext ctx) {
		//System.out.println("in proc");
		tables.put(main, new HashMap<>());
		Symbol func = new Symbol(main, "function");
		func.value = ctx.block();
		functions.put(main, func);
		return visitChildren(ctx);
	}
	
	@Override
	public T visitExpr(PSeintParser.ExprContext ctx) {
		Pair<Object, String> ans = new Pair<>();
		if(ctx.TOKEN_O() != null) {
			Pair<Object, String> left = (Pair)visitExpr(ctx.expr());
			Pair<Object, String> right = (Pair)visitEA(ctx.eA());
			if(!left.second.equals("boolean") || !right.second.equals("boolean")) {
				//semanticError();
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
			if(!left.second.equals("boolean") || !right.second.equals("boolean")) {
				//semanticError();
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
			if(left.second.equals("boolean") || right.second.equals("boolean")) {
				//semanticError();
			}
			else {				
				if(left.second.equals("string")) {
					if(!right.second.equals("string")){
						//semanticError();
					}
					else {
						ans.first = ((String)left.first).equals((String)right.first);
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
		}
		else if(ctx.TOKEN_DIF() != null) {
			Pair<Object, String> left = (Pair)visitEB(ctx.eB());
			Pair<Object, String> right = (Pair)visitEC(ctx.eC());
			if(left.second.equals("boolean") || right.second.equals("boolean")) {
				//semanticError();
			}
			else {
				if(left.second.equals("string")) {
					if(!right.second.equals("string")){
						//semanticError();
					}
					else {
						ans.first = !((String)left.first).equals((String)right.first);
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









