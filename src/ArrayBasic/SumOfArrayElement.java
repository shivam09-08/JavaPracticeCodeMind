//package ArrayBasic;
package ArrayBasic;

public class SumOfArrayElement {
	
	public static void main(String[] args) {
		
		int [] element  = {2,5,7,34,56,7,24};
		SumOfArrayElement obj= new SumOfArrayElement();
		obj.sumOfArray(element);
	}

	public void sumOfArray(int arr [])
	{

	
		
		int sum =0;
		
		System.out.print("Array elements are as follow : " );
		
		for(int i=0; i<arr.length;i++)
		{
			
			System.out.print( " " + arr[i]);
			sum = sum+ arr[i];
			
		}		
		
		System.out.println(" ");
		System.out.println("Sum of Array element  is : " + sum);
	}
	
}
