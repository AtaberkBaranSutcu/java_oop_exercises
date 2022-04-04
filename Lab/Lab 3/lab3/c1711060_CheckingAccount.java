package newproject;

public class CheckingAccount extends BankAccount {
	private static final int FREE_TRANSACTIONS = 3;
	private static final double TRANSACTION_FEE = 2.0;
	private int transactionCount;

	public CheckingAccount(double balance) {
		super(balance);
		transactionCount = 0;
	}

	@Override
	public void deposit(double deposit) {
		transactionCount++;
		if (transactionCount > 3) {
			super.deposit(deposit - deductFees());
		} else
			super.deposit(deposit);
	}

	@Override
	public void withdraw(double withdraw) {
		transactionCount++;
		if (transactionCount > 3) {
			super.withdraw(withdraw + deductFees());
		} else
			super.withdraw(withdraw);
	}

	// return type cannot be void because when withdraw/deposit function is called,
	// transactionCount increases 1.
	// if return type is void, we should call withdraw function like super.withdraw(x)..
	public double deductFees() {
		double x = TRANSACTION_FEE * (transactionCount - FREE_TRANSACTIONS);
		return x;
	}

}
