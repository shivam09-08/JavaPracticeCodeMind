package Java8Feature;

public class Interfacemain implements FunctionalInterfaceEx{
	public static void main(String[] args) {
		FunctionalInterfaceEx obj = new Interfacemain();
		FunctionalInterfaceEx.display();
		obj.add(10, 21);
		
	obj.sub(90,10);
		
	}

	@Override
	public void add(int a, int b) {
		int c= a+b;
		System.out.println("The given two numbers are  : " + a +" && " + b  +" result= "+ c);
		
	}

}
