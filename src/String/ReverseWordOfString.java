package String;

public class ReverseWordOfString {
	public static void main(String[] args) {
		String str ="Java Concept Of The Day";
//		String check[] =str.split(" ");
		
//	
//		char[] ch = str.toCharArray();
//		
//		for(int i=ch.length-1 ; i>=0;i--)
//		{
//
//			
//		System.out.print(ch[i]);
////			System.out.print(check[i]);
//			
//			
//		}
		
		String[] words = str.split(" ");
        
        String reverseString = "";
         
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
             
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
             
            reverseString = reverseString + reverseWord + " ";
        }
         
       System.out.println("Given String is :" +str);
         
        System.out.println("Reverse String :"+reverseString);
         
     
    }
		
	}

