
public class ReverseTheWordOfString {

	public static void main(String[] args) {
		String str = "Java J2EE Java JSP J2EE";
		String word [] =str.split(" ");
		
		String reverseString="";
		
		for(int i =0;i<word.length;i++)
		{
			String cha =word[i];
			String reverseWord="";
			
			for(int j= cha.length()-1;j>=0;j--)
			{
				reverseWord =reverseWord+cha.charAt(j);
			}
			
			reverseString = reverseString + " " + reverseWord; 
			
		}
		
System.out.println("reverse word is " + reverseString);
	}

}
