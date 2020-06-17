package bankaccountapp;

public class BankAccountApp {
    public static void main(String[] args) {

        Checking chkacc1=new Checking("Tom Wilson","321456789",1500);
        Savings savaacc1=new Savings("Rich Lowe","456657897",2500);
        //Read a CSV File then create new accounts based on that data
        savaacc1.showInfo();

        chkacc1.showInfo();

    }
}
