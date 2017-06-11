package prob2;

public class CheckingAccount extends Account {
     
	 private double balance;
     private double monthlyFee;
     private String accId;
     public CheckingAccount(String accId, double monthlyFee,double balance ) {
		
		this.balance = balance;
		this.monthlyFee = monthlyFee;
		this.accId = accId;
	}

	

	@Override
	public String getAccountID() {
		
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
		return balance-monthlyFee;
	}
	

}
