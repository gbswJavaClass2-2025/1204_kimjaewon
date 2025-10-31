package exam07;

public abstract class Employee {
	public String name;
	public String employeeId;
	
	public Employee(String name, String employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}
	
	abstract int calculatePay();
}
