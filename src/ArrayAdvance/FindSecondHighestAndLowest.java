package ArrayAdvance;

public class FindSecondHighestAndLowest {
	public static void main(String[] args) {
		int array [] = {10,25,35,15,45};
		FindSecondHighestAndLowest obj= new FindSecondHighestAndLowest();
		obj.secondLargest(array);
//		int result =obj.secondLargest(array);
//		System.out.println("Second Largest element is : " + result);
	}
	
	public void secondLargest(int arr[]) {
	int larg =0;
	for(int i=0; i<arr.length;i++)
	{
		for(int j=i+1; j<arr.length;j++)
		{
			
			if(arr[i]>arr[j])
			{
				larg =arr[i];
				arr[i]=arr[j];
				arr[j]=larg;
			}
		}
		
	}
	System.out.println("Second largest elemnt is : " + arr[arr.length-2]);
	System.out.println("");
	
	System.out.println("Second smallest element is : " + arr[1]);
	}
}
 
		//or
		
//		
//	public int secondLargest(int arr[]) {
//		int larg =0;
//		for(int i=0; i<arr.length;i++)
//		{
//			for(int j=i+1; j<arr.length;j++)
//			{
//				
//				if(arr[i]>arr[j])
//				{
//					larg =arr[i];
//					arr[i]=arr[j];
//					arr[j]=larg;
//				}
//			}
//			
//		}
//		return arr[arr.length-2];
//		
//		
//}

