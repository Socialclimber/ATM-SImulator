/**************************
 * Author : Newton Nkeng  *
 * Title:   ATM Simulator *
 * Date :   04/06/2020    *
 **************************/

// import needed build-in classes
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
// class definetion
public class ATM{
	// method to display menu
	public static void menu(){
		System.out.println("|-------------------------|");
		System.out.println("| Main Menu               |");
		System.out.println("| 1. Check Balance        |");
		System.out.println("| 2. Withdraw             |");
		System.out.println("| 3. Deposite             |");
		System.out.println("| 4. Exit                 |");
		System.out.println("|-------------------------|");
	}
	public static void main(String[] args) {
		// a list that holds accounts objects
		List<Account> accounts = new ArrayList<>();
		// five objects of SavingsAccount
		accounts.add(new SavingsAccount(101,1500));
		accounts.add(new SavingsAccount(102,2000));
		accounts.add(new SavingsAccount(103,2500));
		accounts.add(new SavingsAccount(104,1000));
		accounts.add(new SavingsAccount(105,3000));
		// five objects of CheckingAccount
		accounts.add(new CheckingAccount(106,10000));
		accounts.add(new CheckingAccount(107,20000));
		accounts.add(new CheckingAccount(108,30000));
		accounts.add(new CheckingAccount(109,40000));
		accounts.add(new CheckingAccount(200,50000));
		// Object os Scanner helps get input from user
		Scanner input = new Scanner(System.in);
		int userID;
		int counter = 0;
		MAIN_LOOP: while(true){
			// get an id from the user
			System.out.println("Please, enter ID:");
			userID = input.nextInt();
			// check if ID exist in the list
			for(Account acc : accounts){
				counter++;
				if(acc.getID() == userID){
					/* If userID exist, give user opportunity to *
					*  explore the menu
					*/
					while(true){
						// diplay menu
						menu();
						// get option from the user
						System.out.print("Enter Menu option>> ");
						int option = input.nextInt();
						// if option is exactly 1, check user balance
						if(option == 1){
							System.out.println("Balance is: "+acc.getBalance());
						}else if(option == 2){
							System.out.print("Enter withdrawal amount>>");
							int amount = input.nextInt();
							acc.withdraw(amount);
							System.out.println("Current Balance: "+acc.getBalance());
						}else if(option == 3){
							System.out.print("Enter amount to be deposited>>");
							int amount = input.nextInt();
							acc.deposite(amount);
						}else if(option == 4){
							//System.out.println("ID doesn't exist.");
							continue MAIN_LOOP;
						}else{
							System.out.println("Invalid option");
						}
						counter = 0;
					}
					
				}else{
				   /**************************************************
					* If at the end of list and didn't find an ID,   *
					* report ID doesn't exist and ask for another ID *
					**************************************************/
					if(counter == accounts.size()){
						System.out.println("ID doesn't exist.");
						counter = 0;
						continue MAIN_LOOP;
					}else{
						continue;
					}
				}
			}

		}
		
	}
}