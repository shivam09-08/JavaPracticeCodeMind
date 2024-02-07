//package ArrayReturnTypeGetterSetter;
package ObjectCreation;

public class EmployeeInfoGetterSetter {

	int id;
	String name;
	Double salary;
	long contactNumber;
	String designation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getExperience() {
		return experience;
	}
	public void setExperience(double experience) {
		this.experience = experience;
	}
	String address;
	double experience;
	
	
	@Override
	public String toString() {
		return "EmployeeInfoGetterSetter [id=" + id + ", name=" + name + ", salary=" + salary + ", contactNumber="
				+ contactNumber + ", designation=" + designation + ", address=" + address + ", experience=" + experience
				+ "]";
	}

	
	
}
