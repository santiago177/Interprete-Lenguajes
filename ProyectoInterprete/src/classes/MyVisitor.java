package classes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

import misc.Symbol;

public class MyVisitor<T> extends PSeintBaseVisitor<T> {
	static final String main = "_main";
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
				if (ctx.TOKEN_ASIG() != null) {
					System.out.printf("%s has return value\n", name);
					table.put(ctx.ID(0).getText(), new Symbol(ctx.ID(1).getText(), "open"));
				}
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
	public T visitWrite(PSeintParser.WriteContext ctx) {
		//System.out.println("at write");
		String out = ctx.expr().getText();
		if(isQuote(out.charAt(0)) && isQuote(out.charAt(out.length()-1)));
			out = out.substring(1, out.length()-1);
		System.out.println(out);
		return visitChildren(ctx);
	}
}
