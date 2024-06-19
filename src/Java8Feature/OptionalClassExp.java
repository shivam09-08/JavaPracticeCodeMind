package Java8Feature;

import java.util.Optional;

public class OptionalClassExp {

	
	
	public static void main(String[] args) {
	
	
		OptionalClassExp obj = null;
		
		System.out.println(obj);
		
		Optional<OptionalClassExp> obj1 = Optional.ofNullable(obj);
		if(obj1.isPresent())
		obj.display();
		else
		{
			System.out.println("Object is null");
		}
		
		
	}
	
	public void display()
	{
		System.out.println("From display Method");
	}

}
