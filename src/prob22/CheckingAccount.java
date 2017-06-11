package prob22;

public class CheckingAccount extends Account {
private double balance;
private double mothlyFee;
private String accId;


public CheckingAccount(String accId,double mothlyFee,double balance) {
	super();
	this.balance = balance;
	this.mothlyFee = mothlyFee;
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
	return balance-mothlyFee;
}
}
