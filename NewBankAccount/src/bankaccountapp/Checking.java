package bankaccountapp;

public class Checking extends Account {
    //List properties specific to a Checking account
    int debitCardNumber;
    int debitCardPIN;

    //Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit){
        super(name, sSN,initDeposit);
        accountNumber="2"+accountNumber;
        setDebitCard();

    }
    //List any methods specific to the Checking account
    private void setDebitCard(){
        debitCardNumber=(int) (Math.random()*Math.pow(10,12));
        debitCardPIN=(int)(Math.random()*Math.pow(10,4));

    }

    public void showInfo(){
        super.showInfo();
        System.out.println("Your Checking Account Features" +
                "\n Debit Card Number: "+debitCardNumber+
                "\n Debit Card PIN: "+ debitCardPIN
                );
    }


}
