package JavaSessions;

public class StaticVsNonStaticConcepts {

	String name;
	static int age;
	//non static method
	public void getname() {
		System.out.println("get name");
	}
	
	// static method
	
	public static void getemail() {
		System.out.println("get email");
	}
	
	
	public static void main(String[] args) {
		
	 
	//1. how to access non static stuff: first step is to create object for nonstatic method
		
		StaticVsNonStaticConcepts obj=new StaticVsNonStaticConcepts();
		obj.name="Tom"; // giving some name
		System.out.println(obj.name);//accessing nonstatic variable(class variable-name)
		obj.getname();//accessing non static method (class method-getname())
		
		
		
		
	//2.how to access static stuff:
		//a. call them directly
		getemail();//call them directly: why? bcoz it is stored in common memory allocation and is accessible for everyone.
		age=35;
		System.out.println(age);
		
		// b. call them by class
		
		StaticVsNonStaticConcepts.getemail();
		StaticVsNonStaticConcepts.age=43;
		System.out.println(StaticVsNonStaticConcepts.age);
		
		
		
		
	}

}
