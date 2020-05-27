package JavaSessions;

public class MethodsAssignments {

	//8. Write a program to print the factorial of a number by defining a method named 'Factorial'.
	public static void main(String[] args) {

		MethodsAssignments obj=new MethodsAssignments();
		
		int k=obj.getFactorial(8);
		System.out.println("Factorial is :" +k);
		
	}
				
		public int getFactorial(int n) {
			int fact=1; 
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
		}
				return fact;	
			
					
		
	}
}
