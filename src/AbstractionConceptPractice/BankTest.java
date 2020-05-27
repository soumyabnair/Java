package AbstractionConceptPractice;

public class BankTest {

	public static void main(String[] args) {

		Bank b=new HDFCBank();
		b.loan();
		b.mobilebanking();
		b.debitcard();
		b.payment();
		HDFCBank.OnlineBanking();

	}

}
