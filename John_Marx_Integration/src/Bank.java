public class Bank {
	private double bankBalance;
	private static double interest;
	
	public Bank() {
		bankBalance = 0;
	}
	public Bank(double mon) {
		if (mon >=0) {
			bankBalance = mon;
		}
		else {
			bankBalance = 0;
		}
	}
	
	public void setBankBalance(double mon) {
		if (mon >=0) {
			bankBalance = mon;
		}
		else {
			bankBalance = 0;
		}
	}
	
	public static void setInterest(double inter) {
		if (inter>0) {
			interest = inter;
		}
		else {
			interest = 0.01;
		}
	}
	
	public double getBankBalance() {
		return bankBalance;
	}
	
	public static double getInterest() {
		return interest;
	}
	
	public void makeWithdraw(double wmon) {
		if (wmon <= bankBalance) {
			bankBalance -= wmon;
		}
		else {
			System.out.println("You don't have enough money");
		}
	}
	public void makeDeposit(double dmon) {
		bankBalance += dmon;
		System.out.println("Your new bank balance is: $" + bankBalance);
	}
}
