/**************************
 * Author : Newton Nkeng  *
 * Title:   ATM Simulator *
 * Date :   04/06/2020    *
 **************************/
// imports
import java.time.LocalDate;
// class declaration
public class Account{
	// class fields
	private int id;
	private double balance;
	private LocalDate dateCreated = LocalDate.now();
	// getter and setter for id field
	public void setID(int id){
		this.id = id;
	}
	public int getID(){
		return id;
	}
	// getter and setter for balance field
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return balance;
	}
	// getter method for date
	public LocalDate getDateCreated(){
		return dateCreated;
	}
	/* constructor that creates an account with 
	 * specified id and balance
	 */
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}

	// method that withdraws specific amount from the account
	public void withdraw(double amount){
		if(amount <= balance){
			this.balance -= amount;
		}else{
			System.out.println("Invalid amount");
		}

	}

	// method that performs a deposite operation
	public void deposite(double amount){
		if(amount > 0){
			this.balance += amount;
		}else{
			System.out.println("Invalid amount");
		}
	}
	// implementation of toString method
	public String toString(){
		return "ID: "+id+",balance: "+balance+", Date Created: "+dateCreated;
	}
}