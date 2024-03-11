package String;

public class ReverseString {
	public static void main(String[] args) {
		String str = "MyJava";
		System.out.println("Given String : "+ str);
		char [] c = str.toCharArray();
		
		System.out.println("Reverse string : ");
		for(int i= c.length-1; i>=0;i--)
		{
			System.out.print(c[i]);
		}
	}

}
