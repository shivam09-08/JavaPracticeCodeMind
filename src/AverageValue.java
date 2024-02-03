

public class AverageValue {
	public static void main(String[] args) {
		int arr[] = {12,34,56,67,98,90,43};
		
		AverageValue avrg = new AverageValue();
		
		avrg.average(arr);
	}

	public void average(int elem [])
	
	{
	     int sum =0;
		int avg =0;
		
		System.out.println("Given array elements are as follow");
		
		for(int i =0; i<elem.length;i++)
		{
			System.out.print(" " + elem[i]);
			sum = sum+elem[i];
		}
		avg = sum/elem.length;
		System.out.println(" ");
		System.out.println("Sum  of an element array  is : " + sum);
		System.out.println("Average value of an element is : " + avg);
	}
}
