package ExceptionHandling;



public class TryCatchBlock {

	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		try {
		int i=9/0;
		System.out.println("B");
		System.out.println("B");
		}
		catch(NullPointerException e) {
			System.out.println("Hey some exception is coming");
			e.printStackTrace();
		}
		
		catch(ArithmeticException e) {
			System.out.println("Hey some exception is coming");
			e.printStackTrace();
		}
		
		
		System.out.println("A");
		System.out.println("A");

	}

}
