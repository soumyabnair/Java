package AbstractionConceptPractice;

public abstract class Bank {

	public abstract void loan(); 
	
	public abstract void debitcard();
	
	public  void mobilebanking() {
		System.out.println("Bank ....mobile banking");
	}
	
	public void payment() {
		System.out.println("Bank...payment methods");
	}
}
