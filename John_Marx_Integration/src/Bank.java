//John Marx
public class Bank {
	private double bankBalance;
	private static double interest;

	public Bank() {
		bankBalance = 0.00;
	}

	public Bank(double mon) {
		if (mon >= 0) {
			bankBalance = Math.round(mon * 100.0) / 100.0;
		} else {
			bankBalance = 0.00;
		}
	}

	public void setBankBalance(double mon) {
		if (mon >= 0) {
			bankBalance = Math.round(mon * 100.0) / 100.0;
		} else {
			bankBalance = 0.00;
		}
	}

	public static void setInterest(double inter) {
		if (inter > 0) {
			interest = inter;
		} else {
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
			bankBalance -= Math.round(wmon * 100.0) / 100.0;
			System.out.println("Your current bank balance is: $" + bankBalance);
		} else {
			System.out.println("You don't have enough money");
		}
	}

	public void makeDeposit(double dmon) {
		bankBalance += Math.round(dmon * 100.0) / 100.0;
		System.out.println("Your new bank balance is: $" + bankBalance);

	}

	public double getInterestOvertime(double prin, double rat, int numc, int yers) {
		double newmoney = prin * Math.pow(1 + rat / numc, numc * yers);
		double rnewmoney = Math.round(newmoney * 100.0) / 100.0;
		return rnewmoney;
	}
}
