package OOP_Interface;

public class BankOfAmerica extends PrivateBank implements USBank,UKBank,IndianBanks {

	//USBank
	@Override
	public void Loan() {
		System.out.println("BOA----Loan");
		
	}

	@Override
	public void ForeignCurrencyExchange() {
		System.out.println("BOA----ForeignCurrencyExchange");
		
	}
//UKBank
	@Override
	public void Creditcards() {
		System.out.println("BOA....Creditcards");
		
	}

	@Override
	public void OnlineBanking() {
		System.out.println("BOA....OnlineBanking");
		
	}
//IndianBanks
	@Override
	public void ATMServices() {
		System.out.println("BOA....ATMServices");
		
	}

	@Override
	public void DebitCards() {
		System.out.println("BOA....DebitCards");
		
	}
	//BankofAmerica
	public void Mobilebanking() {
		System.out.println("BOA....Mobilebanking");
	}
	//PrivateBank
	@Override
	public void ChequePayment() {
		System.out.println("PrivateBank-----ChequePayment");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
