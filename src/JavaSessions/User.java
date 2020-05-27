package JavaSessions;

import java.util.ArrayList;

public class User {
	
	String name;
	int age;
	String email;
	boolean isActive;
	char gender;
	long phone;
	ArrayList<String> paymentoptions;
	
	// constructor is not afunction and it has the same name as class name
	//no void and no returntype 
	//Constructor overloading is possible
	
	public User(){ //0 param
		System.out.println("default const...");
		
	}
	
	public User(int i){ //1 param
		System.out.println("1 parameter");
		
	}
	

	public User(String p,int i){ //2 param
		System.out.println("2 parameter :" +p + "" +i);
		
	}
	
	public User(String name,int age,String email,boolean isActive) {
		this.name=name;
		this.age=age;
		this.email=email;
		this.isActive=isActive;
	}
	
	

	public User(String name, int age, String email, boolean isActive, char gender, long phone,
			ArrayList<String> paymentoptions) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.isActive = isActive;
		this.gender = gender;
		this.phone = phone;
		this.paymentoptions = paymentoptions;
	}

	public static void main(String[] args) {
		
		User u1=new User("Tom",25,"tom@gmail.com",true);
		User u2=new User("Ali",24,"ali@gmail.com",false);
		
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("google pay");
		ar.add("credit card");
		User u3=new User("Rahul",35,"rahul@gmail.com",true,'M',534676890,ar);
		
		System.out.println(u1.name+" ," +u1.age+ " ," +u1.email+ ","+u1.isActive);
		System.out.println(u2.name+" ," +u2.age+ " ," +u2.email+ ","+u2.isActive);
		System.out.println(u3.name+" ," +u3.age+ " ," +u3.email+ ","+u3.isActive+","+u3.gender+","+u3.paymentoptions);
	
	
		

	}

}
