
public class CountFrequencychar {

	public static void main(String[] args) {
		String s = "Java J2EE Java JSP J2EE";
//		String word [] = s.split(" ");
		char c [] = s.replace(" ", "").toCharArray();
	
		
		for(int i=0; i<=c.length-1;i++)
		{
			
			int count =1;
			if(c[i]==1)
			{
				continue;
			}
			
			for(int j=i+1;j<=c.length-1;j++)
			{
				
				if(c[i]==c[j]) {
					count ++;
					c[j]=1;
				
					
					
				}
				
				
			}
			System.out.println("Repeting values are " + c[i] + " there count is " +count);
		}

	}

}
