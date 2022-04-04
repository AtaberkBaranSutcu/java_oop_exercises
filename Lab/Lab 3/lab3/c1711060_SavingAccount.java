package newproject;

public class SavingAccount extends BankAccount {
	private double interestRate;
	
	public SavingAccount() {
		interestRate = 0;
	}
	
	public SavingAccount(double interestRate) {
		this.interestRate = interestRate;
	}

	public void addInterest(){
		super.deposit(getInterestRate() * (super.getBalance() / 100));
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}
