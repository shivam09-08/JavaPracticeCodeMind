package Final;

final  class FinalUse {
	
	final int id ;
	final static String name;
	
	
	static {
		name="shivam";
	}
//	 {
//		name ="Abhi";
//	}
//	 { 
//		 id =10;
//		 
//	 }
	 
	 FinalUse()
	 {
		 id =20;
	 }
	 
	final void  m1()
	 {
		 System.out.println("inside final m1");
	 }
	
	void m2()
	{
		System.out.println("inside m2");
	}

}
