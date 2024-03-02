package SuperThis;

public class SuperThis {
	public SuperThis() {
		this(10);
		System.out.println("Inside SuperThisA default Const");
	}
	
	public SuperThis(int a) {
		System.out.println("Inside SuperThisA int cont");
	}

	void m1() {
		System.out.println("Inside SuperThis method");
		ThisSuperB b = new ThisSuperB(10);
		
	}

}
