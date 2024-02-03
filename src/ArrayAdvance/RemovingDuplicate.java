//package ArrayBasic;
package ArrayAdvance;

public class RemovingDuplicate {
	public static void main(String[] args) {
		int [] arr1 = {0,0,1,1,1,2,2,3,3,4};
//		RemovingDuplicate obj =new RemovingDuplicate();
//		int res =obj.Duplicate(arr1);
//		System.out.println(res);
		RemovingDuplicate.duplicate(arr1);
	
	}

	public static void duplicate(int [] arr)
	{
		
		int i=0;
		
		for (int j=0;j<arr.length-1;j++) {
		
			if(arr[j]!=arr[j+1])
			{
				
				arr[i++]=arr[j];
		
				
			}
			
		}
		
		arr[i++]=arr[arr.length-1];
		for(int k=0;k<i;k++) {
			System.out.println(arr[k]+ " ");
			
		}
		
		
		}
		
		
	}
	
	
	

