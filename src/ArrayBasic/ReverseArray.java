//package ArrayBasic;
package ArrayBasic;

public class ReverseArray {
	public static void main(String[] args) {
		int [] array1 = {12,34,56,10,20,4,7};
		
		ReverseArray obj1 =new ReverseArray();
		obj1.reverseArray(array1);
		
	}

	 public void reverseArray(int [] arr)
	 {
//		 int index =arr.length-1;
//		 for(int i=0; i<((arr.length-1)/2);i++)
//		 {
//			 int val = arr[i];
//			 arr[i] = arr[index];
//			 arr[index]= val;
//			
//			 index --;
//			  
		 int arr2 [] = new int[arr.length];

		 int j=0;
		 
		 for(int i=arr.length-1;i>=0;i--)
		 {
			int val = arr[i];
			arr2[j]=val;
			j++;
			
		 }
		
		for (int i : arr2) {
			System.out.println(i);
		}
//			
//		}

		
		
	 }
	 }


