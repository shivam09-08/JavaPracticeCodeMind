package CollectionSortingComparatercompare;

import java.util.ArrayList;
import java.util.Collections;

public class SortComparator {

	public static void main(String[] args) {
		
	ArrayList <Student> al = new ArrayList<>();
		al.add(new Student(3,25,"Rihan"));
		al.add(new Student(5,26,"Vivan"));
		al.add(new Student(2,23,"Ritika"));
		al.add(new Student(7,24,"Sumit"));
		
		System.out.println("Student details before sorting");
		
		for (Student student : al) {
			System.out.println(student.rno+" "+student.name+" "+student.age);
		}
		System.out.println(" ");
		System.out.println("After Sorting by rollno");
		
		Collections.sort(al, new RollNoSorting());
		for (Student student : al) {
			System.out.println(student.rno+" "+student.name+" "+student.age);
		}
		System.out.println(" ");
System.out.println("After Sorting by Name");
		
		Collections.sort(al, new SortByName());
		for (Student student : al) {
			System.out.println(student.rno+" "+student.name+" "+student.age);
		}
	}

}
