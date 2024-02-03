//package conditionStatement;

public class DoWhileTest {
	public static void main(String[] args) {
		
	
int i=0;
do {
	if(i==2) 
	{
		i++;
		continue;
	}
	if(i==6) {
	break;	
	}
	System.out.println(i);
	i++;
}
	while(i<7);
	
}
}
