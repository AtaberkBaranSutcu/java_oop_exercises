package newproject;

public class BankAccount {
	private double balance;

	public BankAccount() {
		balance = 0;
	}

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double deposit) {
		balance += deposit;
	}

	public void withdraw(double withdraw) {
		balance -= withdraw;
	}
	
	public void transfer(double x, BankAccount y){
		withdraw(x);
		y.deposit(x);
	}

}
