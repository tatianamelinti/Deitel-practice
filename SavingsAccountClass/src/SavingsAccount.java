public class SavingsAccount {
private static double annualInterestRate;
private double savingsBalance;

public SavingsAccount(double savingsBalance){
    this.savingsBalance=savingsBalance;
    this.annualInterestRate=0.4;

}

public double getAnnualInterestRate(){ return annualInterestRate; }
public double getSavingsBalance(){
    return savingsBalance;
}
public void setSavingsBalance(double savingsBalance){
    this.savingsBalance=savingsBalance;
}

public void calculateMonthlyInterest(){
    System.out.println("Current savings balance: " + savingsBalance);
    double monthlyInterest;
    monthlyInterest=(getSavingsBalance()*getAnnualInterestRate())/12;
    savingsBalance+=monthlyInterest;
    System.out.println("New savings balance: " + savingsBalance);
}

public static void modifyInterestRate(double newInterestRate){
    annualInterestRate=newInterestRate;
}

}
