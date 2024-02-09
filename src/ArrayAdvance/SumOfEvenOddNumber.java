package ArrayAdvance;

public class SumOfEvenOddNumber {
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5,6,7};
		SumOfEvenOddNumber obj = new SumOfEvenOddNumber();
		obj.sumOfEvenOdd(arr1);
	}

	
	public void sumOfEvenOdd(int arr2[])	
	{
		int eve=0;
		int odd =0;
		for(int i=0; i<arr2.length;i++)
		{
		// if(i%2!=0)
			if(arr2[i]%2==0)
		 {
			 eve =eve+arr2[i];
		 }
		 else
		 {
			 odd = odd+arr2[i];
		 }
		 
		}
		System.out.println("Sum of Even num is :" + eve );
		System.out.println(" ");
		System.out.println("Sum of odd num is : " + odd);
		
	}
	
}
