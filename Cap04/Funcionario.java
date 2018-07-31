public class Funcionario {
	String name;
	String department;
	double salary;
	String date;
	String rg;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	void receivesincrease(double value) {
		double increase = this.salary + value;
		this.salary = increase;
	}
	
	double yearlygain() {
		 return this.salary * 12;
	}
	
	void show() {
		System.out.println(this.name);
		System.out.println(this.department);
		System.out.println(this.salary);
		System.out.println(this.date);
		System.out.println(this.rg);
		System.out.println(this.yearlygain());
	}
	
}

