//package ArrayAdvance;

public class CountFrequencyOfEachWord {
	public static void main(String[] args) {
		int arr [] = {2, 2, 3, 4, 3, 4, 2,8,10,1,8,1,10};
		CountFrequencyOfEachWord obj1 =new CountFrequencyOfEachWord();
	obj1.countFrequency(arr);	
	}

	
	public void countFrequency(int arr1[])
	{
		
		
		
		for(int i=0;i<arr1.length;i++)
		{
			int flag =0;
			int count =0;
			
		for(int j=i+1;j<arr1.length;j++)	
		{		
			if(arr1[i]==arr1[j])
			{
				flag =1;
//				int val = arr1[i];
//				count= count + arr1[i];
				
				break;
//				System.out.println("Repeating values are :" + val + " " + " there count are =" + count);
				
			}
			
			
		}
		if(flag==1)
		continue;
		for(int j=0;j<=i;j++)
		{
			
			if(arr1[i]==arr1[j])
			{
				count++;
			}
		}
		System.out.println("Repeating values are :" + arr1[i] + " " + " there count are =" + count);
		
		}
	}
	
}
