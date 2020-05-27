package OOP_Interface;

public class BOATest {

	public static void main(String[] args) {
		USBank us =new BankOfAmerica();
		
		us.ForeignCurrencyExchange();
		us.Loan();
		
		UKBank uk =new BankOfAmerica();
		
		uk.OnlineBanking();
		uk.Creditcards();
		
		IndianBanks in =new BankOfAmerica();
		    in.ATMServices();
		    in.DebitCards();
		    
		    PrivateBank pb=new BankOfAmerica();
		    pb.ChequePayment();
		    pb.FundRemittance();
		    
		    WorldBank wb=new BankOfAmerica();
		    wb.FundRemittance();
		    
		    PrivateBank.AcceptingDeposit();
		
	}
}