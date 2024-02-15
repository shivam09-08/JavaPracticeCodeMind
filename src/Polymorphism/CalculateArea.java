package Polymorphism;

public class CalculateArea {
	
	public void area(int r )
	
	{
		double circle = 3.14*r*r;
		System.out.println("Area of circle is : " + circle);
	}
	
	public void area(int b, int h)
	{
		float triangle = (b*h)/2;
		System.out.println("Area of Triangle is : " + triangle);
	}

	public void area(float l, float b)
	{
		float rectangle = (l*b);
		System.out.println("Area of Rectangle is : " + rectangle);
	}
	
	public static void main(String[] args) {
		
		CalculateArea ar = new CalculateArea();
		ar.area(5);
		ar.area(45, 20);
		ar.area(45.3f, 24.6f);
	}
}
