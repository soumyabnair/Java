package OOP_Interface;

public interface USMedical {
	
	int min_fee=10;
	
	public void orthoServices();
	
	public void neuroServices();
	
	public void cardioServices();
	
	public void Services911();
	
	
	public static void medicine() {
		System.out.println("USMedical------medicine");
	}
	
	default void nursing() {
		System.out.println("USMedical-----nursing");
	}
	
	

}
