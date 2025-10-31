package exam06;

public class BankAccountExample {

	public static void main(String[] args) {
		BankAccount bankaccount = new BankAccount("김재원", "9999");
		bankaccount.deposit(1000);
		bankaccount.withdrawal(500);
		bankaccount.withdrawal(600);
	}

}
