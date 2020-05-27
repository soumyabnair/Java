package JavaSessions;

public class FunctionsInJava {
	
	//Write a program to print the sum of two numbers entered by user by defining your own method.

	public static void main(String[] args) {
		
	
		FunctionsInJava obj=new FunctionsInJava();
		obj.test();
		
		
		String s1=obj.getTrainerName();
		System.out.println(s1);
		
		int s2=obj.getScore();
		System.out.println(s2);
		
		int s3=obj.sum(20,30);
		System.out.println(s3+100);
		
		

	}
	// Simple -> no i/p and no o/p
	//void - does not return anything
	public void test() {
	System.out.println("test method");
	
	}

	
	//2. return type --->no i/p but some return
	public String getTrainerName()
	{
		System.out.println("get TrainerName");
		String name="Soumya";
		return name;
	}
	
	 public int getScore() {
		 int a=100;
		 int b=300;
		 int total =a+b;
		 return total;
	 }
	 
	 //3. return type--->some i/p and some o/p
	 public int sum(int a,int b) {
		 int add=a+b;
		 return(add);
		 
		 
	 }
}



