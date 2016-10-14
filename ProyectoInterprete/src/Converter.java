import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

import javax.annotation.processing.Filer;
import javax.lang.model.element.Element;
import javax.tools.FileObject;
import javax.tools.JavaFileObject;
import javax.tools.JavaFileManager.Location;

public class Converter {
	static HashMap<String, String> special = new HashMap<>();
	
	static {
		special.put("if", "stif");
		special.put("for", "stfor");
		special.put("while", "stwhile");
		special.put("switch", "stswitch");
		special.put("default", "stdefault");
		special.put("wait", "spwait");	
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
		File f = new File("old_grammar.in"), nf = new File("newPSeint.g"), sp = new File("special.txt");
		PrintWriter pw = new PrintWriter(nf);
		BufferedReader bf = new BufferedReader(new FileReader(f)), sbf = new BufferedReader(new FileReader(sp));
		HashMap<String, String> terminals = new HashMap<>();
		HashMap<String, String> nspecial = new HashMap<>();
		String line;
		while((line = sbf.readLine()) != null) {
			String[] words = line.split(" [:] ");
			String token = words[0].trim();
			nspecial.put(token, words[1]);
		}
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
			if(!nspecial.containsKey(key)) {
				String rule = "";
				char term[] = terminals.get(key).toCharArray();
				for(char c: term) {
					rule += String.format("[%c%c]", c, Character.toUpperCase(c));
				}
				pw.printf("%s : %s;\n", key, rule);
			}
			else
				pw.printf("%s : %s\n", key, nspecial.get(key));
		}
		pw.printf("WS		: [ \\t\\r\\n]+ -> skip ;");
		pw.close();
	}

}
