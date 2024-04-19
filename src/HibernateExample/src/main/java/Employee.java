import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="employee")
public class Employee {
	
	@Column
	@Id
	public int empid;
	
	@Column
	public String emp_name;
	
	@Column
	public int emp_salary;
	
	@Column
	public int emp_age;
	
	@Column
	public String emp_password;

	
	public int getEmpid() {
		return empid;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public int getEmp_salary() {
		return emp_salary;
	}

	public int getEmp_age() {
		return emp_age;
	}

	public String getEmp_password() {
		return emp_password;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public void setEmp_salary(int emp_salary) {
		this.emp_salary = emp_salary;
	}

	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}

	public void setEmp_password(String emp_password) {
		this.emp_password = emp_password;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + ", emp_age="
				+ emp_age + ", emp_password=" + emp_password + "]";
	}

}
