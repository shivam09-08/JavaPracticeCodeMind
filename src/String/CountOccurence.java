package String;

public class CountOccurence {
	public static void main(String[] args) {
		String str = "Java J2EE Java JSP J2EE";
		
		char[] c = str.replace(" ","").toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			
			int count =1;
			
			if(c[i]==1)
			{  continue;
				
			}
			
		for(int j=i+1;j<c.length;j++)	
		{		
			if(c[i]==c[j] )
			{
				count++;
				c[j]=1;
			}
		
		}
		System.out.println("Repeating values are :" + c[i] + " " + " there count are =" + count);

		}
		
		
	}

}
