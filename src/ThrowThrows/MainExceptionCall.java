package ThrowThrows;

public class MainExceptionCall {

	
	
	 void check()throws  JobEligiblityException
	 {
		 CustomExceptionEx ob = new CustomExceptionEx();
		 ob.govExame(19,13);
	 }
	public static void main(String[] args) {
		MainExceptionCall obj = new MainExceptionCall();
		try {
		obj.check();
	}catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
		}
	
}
