package ar.edu.unq.po2.tp3;

public class Strings {

	public static void main(String[] args) {
			
		String a = "abc";
		String s = a;
		String t;
			
		System.out.println("1. s.length(): " + s.length());
		//System.out.println("2. t.length(): " + t.length());
		System.out.println("3. 1 + a: " + (1 + a));
		System.out.println("4. a.toUpperCase(): " + a.toUpperCase());
		System.out.println("5. \"Libertad\".indexOf(\"r\"): " + "Libertad".indexOf("r"));
		System.out.println("6. \"Universidad\".lastIndexOf('i'): " + "Universidad".lastIndexOf('i'));
		System.out.println("7. \"Quilmes\".substring(2,4): " + "Quilmes".substring(2,4));
		System.out.println("8. (a.length() + a).startsWith(\"a\"): " + (a.length() + a).startsWith("a"));
		System.out.println("9. s == a: " + (s == a));
		System.out.println("10. a.substring(1,3).equals(\"bc\"): " + a.substring(1,3).equals("bc"));
	}
	
}