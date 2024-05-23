
public class CoutOccurenceOfEachWord {

	public static void main(String[] args) {
		String str = "Java J2EE Java JSP J2EE";
		String word [] =str.split(" ");
		
		System.out.println(word[0]);
		
		for(int i=0; i<word.length;i++)
		{
			int count = 1;
		
			if(word[i].equals("r"))
			{
				continue;
			}
			
			
			for(int j=i+1;j<word.length;j++)
			{
				
				if(word[i].equals(word[j]))
				{
					count++;
					word[j]="r";
				}
			}
			
			System.out.println("Repeating word is "+ word[i] + " there count is " + count);
		}
		
		
	
       
         
     
    }
	}


