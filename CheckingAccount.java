public class CheckingAccount extends Account{
	// fields
	private double overdraft;
	// getter method for overdraft field
	public double getOverDraft(){
		return overdraft;
	}
	public CheckingAccount(int id, double balance){
		super(id, balance);
	}
}