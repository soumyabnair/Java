package OOP_Encapsulation;

public class Employee_testing {

	public static void main(String[] args) {
		
	 Employee obj=new Employee("Tom",25,1000);
	 
	 System.out.println(obj.name);
	 System.out.println(obj.age);
	 System.out.println(obj.getSalary());
	 obj.getAddress();
	 obj.getBankAccountdummy();
	 

	}

}
