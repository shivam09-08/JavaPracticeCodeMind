package Java8Feature;

public class ImpRunable implements Runnable {
	public static void main(String[] args) {
		Runnable rn = new ImpRunable();
	
		rn.run();
	
		
	     
		 
		

	 
		Runnable imp  = ()->
		System.out.println("Overriding the run() method of runable Interface using Lambda expression");
	      new Thread(imp).start();
	
	
	}
	@Override
	public void run() {
		System.out.println("Overriding the run () of Runable Interface for thread creation using Anonymous class");
		
	}
	
	
	
}
