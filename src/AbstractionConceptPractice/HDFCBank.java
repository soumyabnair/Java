package AbstractionConceptPractice;

public class HDFCBank extends Bank {
	
	

	@Override
	public void debitcard() {
		System.out.println("HDFCBank -----Overirded method----debitcard");
		
	}

	@Override
	public void loan() {
		System.out.println("HDFCBank-----Overrided method-----loan");
		
	} 
	
	public static void OnlineBanking ()
	{
		System.out.println("HDFC bank---independent static method---onlineBanking");
	}

}
