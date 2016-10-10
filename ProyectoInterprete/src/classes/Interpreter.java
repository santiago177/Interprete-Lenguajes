package classes;
import java.io.File;
import java.io.FileInputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Interpreter {

	public static void main(String [] args) throws Exception{
		System.setIn(new FileInputStream(new File("input.txt")));
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		PSeintLexer lexer = new PSeintLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PSeintParser parser = new PSeintParser(tokens);
		ParseTree tree = parser.s();
		MyVisitor<Object> loader = new MyVisitor<Object>();
		loader.visit(tree);
	}
}
