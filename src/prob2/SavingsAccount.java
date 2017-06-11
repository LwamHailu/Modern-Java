package prob2;

public class SavingsAccount  extends Account{
	 private double balance;
     private double interestRate;
     private String accId;
	public SavingsAccount(String accId,double interestRate, double balance) {
		
		this.balance = balance;
		this.interestRate = interestRate;
		this.accId = accId;
	}

	@Override
	public String getAccountID() {
		// TODO Auto-generated method stub
		return accId;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public double computeUpdatedBalance() {
		// TODO Auto-generated method stub
		return balance+(interestRate*balance);
	}

}
