package classes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

import misc.Symbol;

public class MyVisitor<T> extends PSeintBaseVisitor<T> {
	static HashMap<String, HashMap<String, Symbol>> table = new HashMap<>();
	static Stack<String> currentContext = new Stack<>();
	static boolean isQuote(char c) {
		return c == '\'' || c == '"';
	}
	
	@Override
	public T visitSubpr(PSeintParser.SubprContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	public T visitRet(PSeintParser.RetContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	public T visitProc(PSeintParser.ProcContext ctx) {
		//System.out.println("in proc");
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
