import java.util.Scanner;
public class TestBankAccount{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);


		double balance		= 0;	// init to use for negative value check
		String titleOfAccount;
		String nameOfAccountHolder;
		String branchCode;
		String branchAddress;
		int time		= 0;	// init to use for negative value check

		System.out.println("Enter your name: ");
		nameOfAccountHolder	= input.nextLine();

		System.out.println("Enter title: ");
		titleOfAccount		= input.nextLine();

		System.out.println("Enter branch Add: ");
		branchAddress		= input.nextLine();

		System.out.println("Enter Branch code: ");
		branchCode		= input.nextLine();

		System.out.println("Welcome!" + nameOfAccountHolder);
		while (balance <= 0){
		System.out.println("Enter balance: ");
		balance			= input.nextInt();
		}

		BankAccount user1 = new BankAccount(balance, titleOfAccount, nameOfAccountHolder, branchCode, branchAddress);
		System.out.println("Tax rate is 10% per year");
		System.out.println("Interest rate is 5% per year");

		while (time <= 0){
		System.out.println("Enter the duration in years: ");
		time 			= input.nextInt(); 
		}

		System.out.println("Your Interest is:" + user1.calculateInterest(5, balance, time));
		user1.tax(10);
		user1.remainingBalance();
		

		///  further menu

		char menu;
		System.out.println("want to enter menu? (y/n)");
		menu			= input.next().charAt(0);
		if(menu == 'y' || menu == 'Y'){
			System.out.println("welcome to menu");
			char again;				// for do - while 
			do{
				
				int option;
				System.out.println("press 1 to withdraw");
				System.out.println("press 2 to deposit");
				option	   = input.nextInt();
		/// switch
				int cash;
				switch(option){
					case 1:
						System.out.println("Enter cash to withdraw");
						cash	= input.nextInt();
						if(cash > 0 && (balance-cash) >= 0){
							System.out.println("you successfully withdrawn your money");
							user1.cashWithDrawl(cash);
							user1.remainingBalance();
							}
						else
							System.out.println("Invalid, try again");
						break;

					case 2:
						System.out.println("Enter cash to deposit");
						cash	= input.nextInt();
						if(cash > 0){					//// to avoid deposit cash in negative
							System.out.println("you successfully deposited your money");
							user1.cashDeposit(cash);
							user1.remainingBalance();
							}
						else
							System.out.println("Invalid, try again");
						break;

					default:
						System.out.println("select 1 or 2 only");
					}
				System.out.println("want to quit sub-menu? (y/n)");
				again	   = input.next().charAt(0);
				}while(again == 'n' || again == 'N');
			System.out.println("Take care");
			}					/// if condition ends
			else
				System.out.println("Take care");
				
	}
}
		