package SpringContext;

public class Employee {
	
	String name ;
	int id;
	String dep;
	String exp;
	Allowance alw;
	Benifits bfit;
	
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getDep() {
		return dep;
	}
	public String getExp() {
		return exp;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public Allowance getAlw() {
		return alw;
	}
	public Benifits getBfit() {
		return bfit;
	}
	public void setAlw(Allowance alw) {
		this.alw = alw;
	}
	public void setBfit(Benifits bfit) {
		this.bfit = bfit;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", dep=" + dep + ", exp=" + exp + ", alw=" + alw + ", bfit="
				+ bfit + "]";
	}
	
	
}
