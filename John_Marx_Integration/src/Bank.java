// John Marx
/**
 * Contains the code to simulate a bank.
 * @author John Marx
 *
 */
public class Bank {
  private double bankBalance;
  private double interest;
  
  public Bank() {
    bankBalance = 0.00;
  }

  /**
 * Creates a bank account with money in it specified by the mon parameter.
 * @param mon the initial money amount.
 */
  public Bank(double mon) {
    if (mon >= 0) {
      bankBalance = Math.round(mon * 100.0) / 100.0;
    } else {
      bankBalance = 0.00;
    }
  }

  /**
 *Allows the user to set the bank balance. 
 * @param mon is the amount to set the bank account to.
 */
  public void setBankBalance(double mon) {
    if (mon >= 0) {
      bankBalance = Math.round(mon * 100.0) / 100.0;
    } else {
      bankBalance = 0.00;
    }
  }

  public void setInterest(double inter) {  
    boolean goodPercent = false;
    while (goodPercent == false) {
      if (inter <= 1 && inter > 0) {
        interest = inter;
        goodPercent = true;
      } else {
        System.out.println("Enter a valid interest PERCENT");
        System.out.println("HINT: this percent is less than 1 and greater than 0");
        inter = GoodDouble.getGoodDouble();
      }
    }
  }

  public double getBankBalance() {
    return bankBalance;
  }

  public double getInterest() {
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
    double newMoney = prin * Math.pow(1 + rat / numc, numc * yers);
    double rNewMoney = Math.round(newMoney * 100.0)/100.0;
    return rNewMoney;
  }
}
