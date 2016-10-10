import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Converter {
	static HashMap<String, String> special = new HashMap<>();
	
	static {
		special.put("if", "stif");
		special.put("for", "stfor");
		special.put("while", "stwhile");
		special.put("switch", "stswitch");
		special.put("default", "stdefault");		
	}
	
	static String toLower(String s) {
		String ans = "";
		for(int i = 0; i < s.length(); i++) {
			ans += Character.toLowerCase(s.charAt(i));
		}
		return ans;
	}
	
	static String toUpper(String s) {
		String ans = "";
		for(int i = 0; i < s.length(); i++) {
			ans += Character.toUpperCase(s.charAt(i));
		}
		return ans;
	}

	public static void main(String[] args) throws IOException{		
		File f = new File("old_grammar.in"), nf = new File("PSeint.g");
		PrintWriter pw = new PrintWriter(nf);
		BufferedReader bf = new BufferedReader(new FileReader(f));
		HashMap<String, String> terminals = new HashMap<>();
		String line;
		pw.println("grammar PSeint;\n");
		while((line = bf.readLine()) != null) {
			String[] division = line.split("->");
			//System.out.printf("line %s\n", line);
			String[] construct = division[1].split("[|]");			
			String nt = toLower(division[0].trim());
			if(special.containsKey(nt))
				nt = special.get(nt);
			String strRules = "";
			ArrayList<String> rules = new ArrayList<>();
			for(String s: construct) {
				String rule = "";
				StringTokenizer stok = new StringTokenizer(s);
				while(stok.hasMoreTokens()) {
					String current = stok.nextToken();
					if(Character.isUpperCase(current.charAt(0))) {
						if(!current.equals("EPSILON")) {
							String temp = toLower(current);
							rule += special.containsKey(temp)? special.get(temp) : temp;
						}
					}
					else {
						rule += toUpper(current);
						terminals.put(toUpper(current) , current);
					}
					rule += " ";
				}
				//System.out.printf(" rule = %s", rule);
				rules.add(rule);
			}
			for(int i = 0; i < rules.size(); i++) {
				strRules += rules.get(i);
				if(i < rules.size()-1)
					strRules += "| ";
			}
			pw.printf("%s : %s;", nt, strRules);
			pw.println();			
		}
		for(String key: terminals.keySet()) {
			pw.printf("%s : '%s';\n", key, terminals.get(key));
		}
		pw.printf("WS		: [ \\t\\r\\n]+ -> skip ;");
		pw.close();
	}

}
