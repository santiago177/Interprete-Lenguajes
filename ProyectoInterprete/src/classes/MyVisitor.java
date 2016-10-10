package classes;

public class MyVisitor<T> extends PSeintBaseVisitor<T> {
	@Override
	public T visitProc(PSeintParser.ProcContext ctx) {
		System.out.println("in proc");
		return visitChildren(ctx);
	}

	@Override
	public T visitWrite(PSeintParser.WriteContext ctx) {
		System.out.println("at write");
		System.out.println(ctx.TOKEN_ENTERO());
		return visitChildren(ctx);
	}
}
