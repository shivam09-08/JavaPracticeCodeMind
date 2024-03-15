package ThrowThrows;

public class CustomExceptionEx {
	
	public void govExame(int age ,int qualification)throws  JobEligiblityException
	{
	
		if(age<18 || qualification < 12)
		{
			System.out.println("you are not eligibile for job application");
			throw new JobEligiblityException("You are not fall under the criteria please complete the requriment and then apply");
		}
		
		else
		{
			System.out.println("you can apply for the job");
		}
	}
	
	
	

}
