package MapInterface;

public class Student {
	
private	int rollno;
private	String name;
private	String add;
public int getRollno() {
	return rollno;
}
public String getName() {
	return name;
}
public String getAdd() {
	return add;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public void setName(String name) {
	this.name = name;
}
public void setAdd(String add) {
	this.add = add;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", add=" + add + "]";
}



}
