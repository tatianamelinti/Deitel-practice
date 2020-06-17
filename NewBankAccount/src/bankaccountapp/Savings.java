package bankaccountapp;

public class Savings extends Account {
    //List properties specific to the Savings account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    //Constructor to initialize settings for the Savings properties
    public Savings(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber= "1"+accountNumber;
        setSafetyDepositBox();
    }
    private void setSafetyDepositBox(){
        safetyDepositBoxID=(int) (Math.random()*Math.pow(10,3));
        safetyDepositBoxID=(int) (Math.random()*Math.pow(10,3));
    }
    //List any methods specific to Savings account
    public void showInfo(){
        super.showInfo();
        System.out.println(
                "Your Savings Account Features" +
                        "\n Safety Deposit Box ID: "+safetyDepositBoxID+
                        "\n Safety Deposit Box Key: " + safetyDepositBoxKey

        );
    }
}
