public class BankAccount{
	public int account;
	double balance;
	String titleOfAccount;
	String nameOfAccountHolder;
	String branchCode;
	String branchAddress;
// constructor
	public BankAccount(double balance, String titleOfAccount, String nameOfAccountHolder, String branchCode, String branchAddress){
		 this.balance = balance;
		 titleOfAccount = titleOfAccount;
		 nameOfAccountHolder = nameOfAccountHolder;
		 branchCode = branchCode;
		 branchAddress = branchAddress;
		}

// constructor
	public BankAccount(double balance, String titleOfAccount, String nameOfAccountHolder){
		 balance = balance;
		 titleOfAccount = titleOfAccount;
		 nameOfAccountHolder = nameOfAccountHolder;
		 branchCode = "null";
		 branchAddress = "n/a";
		}

	double calculateInterest(int rate, double amount, int time){
		double interest = (amount * rate * time)/100;
		balance +=interest;
		return interest;
		}
	public void cashWithDrawl(int money){
		balance -= money;
		}
	public void cashDeposit(int money){
		balance += money;
		}
	public void remainingBalance(){
		System.out.println("Your current ballance is: " + balance);
		}
	public void tax(double rate){
		double tax;
		tax = (rate/100)*balance;
		System.out.println("tax calculated: " + tax);
		balance -= tax;
		}
}