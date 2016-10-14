import java.io.*;
public class Converter2 {

	public static void main(String[] args) throws IOException{
		File f = new File("tokens.in"), o = new File("newTokens.out");
		PrintWriter pw = new PrintWriter(o);
		for(char c = 'A'; c <= 'Z'; c++) {
			pw.printf("%c : ('%c'|'%c');\n", c, Character.toLowerCase(c), c);
		}
		BufferedReader bf = new BufferedReader(new FileReader(f));
		String line;
		while((line = bf.readLine()) != null) {
			String[] words = line.split(" [:] ");
			String token = words[0].trim(), value = words[1].trim();
			System.out.println(value);
			if(Character.isAlphabetic(value.charAt(1)) && value.charAt(0) == '\'') {
				String rule = "";
				char[] aValue = value.toCharArray();
				for(char c: aValue) {
					if(Character.isAlphabetic(c))
						rule += Character.toUpperCase(c)+" ";
				}
				pw.printf("%s : %s;\n", token, rule);
			}
			else {
				pw.printf("%s : %s\n", token, value);
			}
		}
		pw.close();
	}

}
