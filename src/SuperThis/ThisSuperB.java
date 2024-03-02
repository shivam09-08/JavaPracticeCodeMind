package SuperThis;

public class ThisSuperB extends SuperThis {
	

	public static void main(String[] args) {

		ThisSuperB b = new ThisSuperB();
		b.m2();
	}

	public ThisSuperB() {
		super();
		System.out.println("Inside ThisSuperB B Const");
	}

	public ThisSuperB(int a) {
		this();
		System.out.println("Inside ThisSuperB int Const");
	}

	void m2() {
		System.out.println("Inside ThisSuper  m2 method");
		m1();
	}

}
