package JavaSessions;
import java.util.ArrayList;
public class Employee {
	String name;
	int age;
	String deptname;
	char c;
	boolean isPermanent;
	String laptops[];
	double exp;
	ArrayList <String> devices;
	
		public static void main(String[] args) {
			
	Employee emp=new Employee();
    emp.name="Tom";
    emp.age=20;
    emp.deptname="QA";
    emp.isPermanent=true;
    emp.laptops=new String[3];
    emp.laptops[0]="Apple";
    emp.laptops[1]="Windows";
    emp.devices=new ArrayList<String>();
    
    emp.devices.add("Apple Iphone");
    emp.devices.add("Samsung s10");
    emp.devices.add("Windows 10");
     
    //System.out.println(emp.devices);
    Employee emp1=new Employee();
    emp1.name="Sam";
    emp1.age=20;
    emp1.deptname="Dev";
    emp1.isPermanent=false;
    emp1.laptops=new String[3];
    
    Employee emp2=new Employee();
    emp2.name="Kim";
    emp2.age=27;
    emp2.deptname="Admin";
    emp2.isPermanent=true;
    emp2.laptops=new String[3];
          //default values
    Employee emp3=new Employee();
    
    System.out.println("The default value of Boolean is : " +emp3.isPermanent);
    System.out.println("The default value of character  is : " +emp3.c);
    //System.out.println("The default value of ArrayList is : " +emp3.devices);
   // System.out.println("The default value of Array is : " +emp3.laptops);
	}
}
