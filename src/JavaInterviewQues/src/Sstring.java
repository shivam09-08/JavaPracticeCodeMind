public class Sstring {
	public static void main(String[] args) {
		
	
String s="i am shivam";

	String r [] =s.split(" ");
	String val = "";
	for(int i=r.length-1;i>=0;i-- )
	{
		
		val = val +" "+ r[i];
	}
System.out.println(val );

	}
}
