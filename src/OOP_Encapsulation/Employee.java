package OOP_Encapsulation;

public class Employee {

	public String name;
	public int age;
	private int salary;
	
	
	
	public Employee(String name, int age, int salary) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
	}


	public void getAddress() {
		System.out.println("Employee address");
	}
    
	
	private void getBankAccount() {
		System.out.println("Employee bank details");
	}
	
	public void getBankAccountdummy() {
		getBankAccount();
	}
	
	public int getSalary() {
		return salary;
	}
	
	
}
