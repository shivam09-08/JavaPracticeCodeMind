package ArrayAdvance;

public class AddiontionOfTwoArray {
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5,6,7};
		int arr2[] = {0,0,2,1,3,5,2};
		AddiontionOfTwoArray obj=new AddiontionOfTwoArray();
		obj.sumOfArrays(arr1, arr2);
		}
public void sumOfArrays(int arr1[],int arr2[])
{
	int arr3[]=new int[arr1.length];
for(int i =0; i<arr1.length;i++)
	{
	
arr3[i]=arr1[i]+arr2[i];	
System.out.println(arr1[i] +" + " + arr2[i]+ " = "+arr3[i]);
	}

}
}
