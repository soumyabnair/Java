package OOP_Interface;

public class PrivateBank implements WorldBank {
	
	public static void AcceptingDeposit() {
		
		System.out.println("PrivateBank----Accepting deposit");
	
	}
	
	public void ChequePayment() {
		System.out.println("PrivateBank-----ChequePayment");
	}

	@Override
	public void FundRemittance() {
		System.out.println("WorldBank-----FundRemittance");
		
	}
}
