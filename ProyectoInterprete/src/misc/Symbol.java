package misc;

public class Symbol {
	public String id;
	public String type;
	public String arrayType;
	public Object value;
	public Array arrayValue = null;
	public boolean array;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		Symbol t = (Symbol)obj;
		return t.id.equals(this.id);
	}
	
	public Symbol(String id, String type) {
		this.array = false;
		this.id = id;
		this.type = type;	
	}
	public Symbol() {
		this.array = false;
	}
}
