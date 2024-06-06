package MapInterface;

import java.util.ArrayList;
import java.util.List;

public class ObjectValues {

	public static void main(String[] args) {
	
		List<Student> al = new ArrayList<>();
		
		Student obj = new Student();
		obj.setName("Shivam");
		obj.setRollno(1);
		obj.setAdd("Pune");
		
		Student obj1 = new Student();
		obj1.setName("Abhi");
		obj1.setRollno(2);
		obj1.setAdd("Indore");
		
		al.add(obj);
		al.add(obj1);
		
		ObjectValues aobj = new ObjectValues();
		aobj.PrintStudent(al);

	}

	public void PrintStudent(List<Student> al)
	{
		for (Student student : al) {
			
			System.out.println(student.getRollno());
			System.out.println(student.getName());
			System.out.println(student.getAdd());
		}
	}
	
}
