package String;

public class StringMethodsUse {
	public static void main(String[] args) {
		String s = "Master";
	s=s + "mind";
	
	String str =10+50+50+"Code"+10+10;
	String sub = str.substring(0, 3);
	String res =str.substring(3);
	
	System.out.println(s);
		System.out.println("given string is: " +str);
//		System.out.println(str);
		System.out.println("Sub String of Given string is : " + sub);
		System.out.println("Sub String Using begining index : " + res);
		
		String s1 = "   candy";
		System.out.println("Given String is : "+ s1);
		System.out.println("After trim white space String become :" +s1.trim());
		s1 =s1.concat(str);
		System.out.println("After concate  candy  with 10+50+50+\"Code\"+10+10; " + s1  );
		String upc = s1.toUpperCase();
		System.out.println( "Converting  to uppercase :" + upc);
		System.out.println("Convert  to lowercase"+s1.toLowerCase());
		
		String ch = "Master computer coding problems";
		System.out.println("Given string is " + ch );
		System.out.println("Find word starwith(M)  " +ch.startsWith("M"));
		System.out.println("Find word endswith (ems) " + ch.endsWith("ems"));
		System.out.println("Find char at 7 index is : " + ch.charAt(7));
		
		System.out.println("Find the word if it is present in a string using Contains(coding) : " +ch.contains("coding"));
		
		String w1= "Mater";
		String w2 = "master";

		System.out.println("Given words are :" + w1+  " " + w2);
		System.out.println("Compare it using compareto () " + w1.compareTo(w2));
		System.out.println("Copmare using ComapreToIgnore () : " +w1.compareToIgnoreCase(w2));
		System.out.println("Compare using equals() :"+ w1.equals(w2));
		System.out.println("Compare using equalsIgnore () :"+ w1.equalsIgnoreCase(w2));
		
		// do more methods like contains and campare 
	}

}
