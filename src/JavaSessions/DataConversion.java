package JavaSessions;

public class DataConversion {

	public static void main(String[] args) {
		
		String x="100A";
		//System.out.println(x+20);
		
		
		String y=x.replace("A", "");
		System.out.println(y);
		
		//String to integer
		int z=Integer.parseInt(y);
		
		System.out.println(z+20);
		
		String i="12.33";
		
	double d=Double.parseDouble(i);
	System.out.println(d+20);
	
	int a=100;
	String b=String.valueOf(a);
		System.out.println(b+20);
			
		

	}

}
