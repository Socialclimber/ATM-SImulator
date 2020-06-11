/**************************
 * Author : Newton Nkeng  *
 * Title:   ATM Simulator *
 * Date :   04/06/2020    *
 **************************/
// SavingsAccount class definition
public class SavingsAccount extends Account{
	// fields
	private double annualInterestRate;
	// monthly interest rate method
	public double getMonthlyInterestRate(){
		return (annualInterestRate/12)/100;
	}
	// method that calculates monthly interest
	public double getMonthlyInterest(){
		return getBalance() * getMonthlyInterestRate() ;
	}
	public SavingsAccount(int id, double balance){
		super(id, balance);
	}
}