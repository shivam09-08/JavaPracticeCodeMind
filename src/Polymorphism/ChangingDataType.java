package Polymorphism;

public class ChangingDataType {
	
//	public int time(int hr , int min)
//	{
//		int timeTakenInMin = min+hr;
//		return timeTakenInMin;
//		
//		
//	}
//	
//	public float time(int hr , float min)
//	{
//		float timeTakenInMin = hr+ min ;
//		return timeTakenInMin;
//		
//		
//	}
//	

	public void time(int hr , int min)
	{
		int timeTakenInMin = min+hr;
		System.out.println("time using int values : " + timeTakenInMin );	
		
	}
	
	public void time(int hr , float sec)
	{
		float timeTakenInMin = hr+ sec ;
		System.out.println("time using float values : " + timeTakenInMin );	
		
		
	}
	public static void main(String[] args) {
		ChangingDataType obj = new ChangingDataType();
		
//		int r = obj.time(3, 50);
//		float t = obj.time(4, 45.6f);
//		
//		System.out.println("time using int values : " + r );
//		System.out.println("time using float values : " + t );
		
		obj.time(3, 50);
		 obj.time(4, 45.6f);
	}

}
