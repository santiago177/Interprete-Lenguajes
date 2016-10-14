package misc;

import java.util.ArrayList;

import classes.PSeintParser.BlockContext;

public class Function extends Symbol{
	public ArrayList<Symbol> args;
	public String returnId = null;
	public BlockContext block;	
	public Function(String id, String type) {
		super(id, type);
	}
}
