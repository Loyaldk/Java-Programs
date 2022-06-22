
import java.util.Scanner;

public class SavingsAccountRunner {
	public static void main(String[] args) {
	int t1;
	double t2, t3;
	//Open scanner to take input
	Scanner Input = new Scanner(System.in);
	
	
	//Display and take input for variables
	System.out.println("Welcome to your Savings Account App!");
	System.out.print("Enter your account number: " );
	t1 = Input.nextInt();
	
	System.out.print("Enter your initial balance: ");
	t2 = Input.nextDouble();
	
	System.out.print("Enter your annual interest rate: ");
	t3 = Input.nextDouble();
	//System.out.println("Date Created:" + dateEstablished);
	
	//Output inputs to SavingsAccount class
	SavingsAccount acct = new SavingsAccount(t1,t2);
	acct.SetInterest(t3/100.0);
	
	for(int opt = 0;opt != 4;) {
					
		System.out.println("\n=============================");
		System.out.println("=       OPTIONS BELOW       =");
		System.out.println("=============================");
		
		System.out.println("1. Deposit");
		System.out.println("2. View Weekly Interest Rate");
		System.out.println("3. View Account Details");
		System.out.println("4. Exit");
		System.out.println("Enter your selection");
		
		//Take input for option selection
		opt = Input.nextInt();
		
		switch(opt) {
		case 1: 	System.out.println("Enter your deposit amount:");
	    			double amount = Input.nextDouble();
	    			acct.depositAmt(amount);
	    			System.out.println("New Balance: " + acct.getBalance());
	    			System.out.println();
	    			break;
		case 2: 	System.out.println("Your Weekly Interest Amount is " + acct.getWeeklyIntRate());
					System.out.println();
					break;
		case 3: 	System.out.println("Account ID: " + acct.getId());
					System.out.println("Account Creation Date/Time: " + acct.getDateEstablished());
					System.out.println("Balance: " + acct.getBalance());
					System.out.println("Weekly Interest Amount: $ " + acct.getWeeklyIntRate());
					System.out.println();
					break;
		case 4: 	System.out.println("Thank you - Goodbye!");
					break;
		default:	System.out.println("INVALID SELECTION - TRY AGAIN!");
					break;
		}
	}
	}
}
