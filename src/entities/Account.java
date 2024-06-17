package entities;

public class Account {

	private String accountHolder;
	private double accountBalance;
	private int accountNumber;
	public char initialDeposit;
		

	public Account() {
	}
	
		public Account(String accountHolder, int accountNumber) {
		super();
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
	}

	public Account(String accountHolder, double accountBalance, int accountNumber) {
		super();
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
		this.accountNumber = accountNumber;
	}



	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double setAccountBalance(double accountBalance) {
		return this.accountBalance = accountBalance;
	}

	public void setInitialDeposit(char initialDeposit) {
		this.initialDeposit = initialDeposit;
	}

	public char getInitialDeposit() {
		return initialDeposit;
	}
	
	public double setAccountIncome(double accountIncome) {
		return this.accountBalance += accountIncome;
	}
	
	public double setAccountWithdraw(double accountWithdraw) {
		return this.accountBalance -= (accountWithdraw + 5);
	}
		
	public String getAccountData() {			
		return "\n"
		+ "Account data:"
		+ "\n"
		+ "Account: "
		+ accountNumber
		+ ", Holder: "
		+ accountHolder
		+ ", Balance: R$"
		+ String.format("%.2f", accountBalance)
		+"\n";
	}
	
}
