package ArrayBasic;

import java.util.Arrays;

public class CopyArrayElement {
public static void main(String[] args) {
	int [] arr1  = {2,5,7,34,56,7,24};
	System.out.println(arr1.toString());
	CopyArrayElement obj1 =new CopyArrayElement();
	int arr2[] =obj1.copyArray(arr1);
	for (int i : arr2) {
		System.out.println(i);
	}
	
//System.out.println("Array one values are =" );
//
//for (int i : arr1) 
//	System.out.println(i + " ");
//
//
//int arr2 [] =Arrays.copyOf(arr1, 6);
//
//System.out.println("Array 2 after copying values  are :" );	
//for(int j: arr2)
//{
//	System.out.println(j + " ");
//}


}
public int[] copyArray(int arr [])
{
int arr2[] = new int[arr.length];

for(int i=0;i<=arr.length-1;i++)
{
 int val = arr[i];
 arr2[i]=val;
}
return arr2;

}
}



