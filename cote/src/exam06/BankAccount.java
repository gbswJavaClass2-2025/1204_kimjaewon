package exam06;

public class BankAccount {
	private static int count = 0;
	private String name;
	private String accountNumber;
	private int balance;
	
	public BankAccount(String name, String accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
		count++;
	}
	
	public BankAccount(String name, String accountNumber, int balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		count++;
	}
	
	String getName() {
		return name;
	}
	
	String getAccountNumber() {
		return accountNumber;
	}
	
	int getBalance() {
		return balance;
	}
	
	int getCount() {
		return count;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	
	void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	void setBalance(int balance) {
		this.balance = balance;
	}
	
	void withdrawal(int amount) {
		
		if (balance > amount) {
			System.out.println(amount);
			balance -= amount;
		}
		else {
			System.out.println(balance);
			balance -= balance;
		}
	
	}
	
	void deposit(int amount) {
		balance += amount;
		System.out.println(balance);
	}
}
