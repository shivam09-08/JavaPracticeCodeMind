//package ArrayAdvance;

public class CountFrequencyOfEachWord {
	public static void main(String[] args) {
		int arr [] = {2, 2, 3, 4, 3, 4, 2,8,10,1,8,1,10};
		CountFrequencyOfEachWord obj1 =new CountFrequencyOfEachWord();
	obj1.countFrequency(arr);	
	}

	
	public void countFrequency(int arr1[])
	{
		int count =0;
		
		
		for(int i=0;i<arr1.length;i++)
		{
			
		for(int j=1;j<i;j++)	
		{		
			if(arr1[i]==arr1[j])
			{
				int val = arr1[i];
				count= count + arr1[i];
				
				
				System.out.println("Repeating values are :" + val + " " + " there count are =" + count);
				count ++;
			}
			
			
		}
		
		}
	}
	
}
