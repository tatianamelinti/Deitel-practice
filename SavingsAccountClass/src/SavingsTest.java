public class SavingsTest {
    //Driver
    public static void main(String[] args) {
        SavingsAccount saver1= new SavingsAccount(2000);
        SavingsAccount saver2= new SavingsAccount(3000);
        saver1.calculateMonthlyInterest();
        saver1.modifyInterestRate(0.5);
        saver2.calculateMonthlyInterest();
        saver2.modifyInterestRate(0.5);
    }
}
