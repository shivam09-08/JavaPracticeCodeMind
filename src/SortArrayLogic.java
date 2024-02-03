//package ArrayBasic;

public class SortArrayLogic {
public static void main(String[] args) {
//	int arr[] = {0, 23, 14, 12, 9};
	int arr[] = {7,0,2};
	System.out.println("Array  values Before Sorting :");
	for (int i : arr) {
		
		System.out.print(i + " ");
		
	}
	System.out.println(" ");
	
	SortArrayLogic obj1= new SortArrayLogic();
	System.out.println("Array values After sorting : ");
	obj1.sortArray(arr);
	
}

public void sortArray(int arr1[])
{
//	int s=arr1[0];
//	int j = arr1[0];
	
for(int i=0; i<arr1.length;i++) {
	for(int j=i+1;j<arr1.length;j++) {
		int s=0;
		if(arr1[i]>arr1[j])
		{
			s=arr1[i];
			arr1[i]=arr1[j];
			arr1[j]=s;
		}
	}
	
	
	System.out.print(arr1[i] + " ");
	}


	}
	
	
}




