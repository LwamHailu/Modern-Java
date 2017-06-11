package prob22;

public class SavingsAccount  extends Account{
	private double balance;
	private double interestRate;
	private String acctId;
	public SavingsAccount(String acctId,double interestRat,double balance) {
		
		this.balance = balance;
		this.interestRate = interestRate;
		this.acctId = acctId;
	}
	
	
	@Override
	public String getAccountID() {
		
		return acctId;
	}
	@Override
	public double getBalance() {
		
		return balance;
	}
	@Override
	public double computeUpdatedBalance() {
		
		return balance+(balance*interestRate);
	}

}
