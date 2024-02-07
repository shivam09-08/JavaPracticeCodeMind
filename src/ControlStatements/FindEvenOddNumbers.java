//package ArrayBasic;
package ControlStatements;

public class FindEvenOddNumbers {
	
	public static void main(String[] args) {
		int opr[] = {2,4,5,6,7,9,8,12,11};
		
		FindEvenOddNumbers obj = new FindEvenOddNumbers();
		obj.evenOdd(opr);
		
		
	}
	
	public void evenOdd(int eve[])
	{
		int oddEle =0;
		int eveEle = 0;
		int eveno=0;
		int oddno=0;
		int allval[] = new int[10];
		System.out.println("Given list of array Even Odd elements are as follows");
		
		for(int i =0; i<eve.length;i++)
		{
			allval[i] = eve[i];
			
			//
			
			if(eve[i]%2==0)
			{
				
				eveno++;
				eveEle= eve[i];
				System.out.println ("Even no values are : " + eveEle);
				
			}
			if(eve[i]%2 != 0 ) 
			{
				
				oddno++;
				oddEle= eve[i];
				
				System.out.println ("Odd no values are : " + oddEle);
				
			}
			
			
		}
		
		System.out.println("Even no count are : " + eveno);
		System.out.println(" " );
		System.out.println("Odd no count are : " + oddno);
		
//		for(int i =0; i<eve.length;i++)
//		{
//			
//			if(eve[i]%2 != 0 ) 
//			{
//				
//				oddno=oddno+1;
//				oddEle= eve[i];
//				
//				System.out.println ("Odd no values are : " + oddEle);
//				
//			}
//			
//			
//		}
		
		
		
		
		
		
		
		
		
		
	}

}
