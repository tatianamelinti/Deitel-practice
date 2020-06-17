import java.util.Scanner;

public class C4_18_CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String accountNumber=" ";
        int balanceBeginningMonth;
        int charges;
        int credits;
        int allowedCreditLimit;
        int restAmount;
        System.out.println("Enter number of customers: ");
        int customers=input.nextInt();
        int count=0;
        while(count<customers) {

            System.out.println("Enter account number: ");
            accountNumber=input.next();
            System.out.println("Enter beginning balance: ");
            balanceBeginningMonth=input.nextInt();
            System.out.println("Enter total charges: ");
            charges=input.nextInt();
            System.out.println("Enter total of all credits applied: ");
            credits=input.nextInt();
            System.out.println("Enter allowed credit limit: ");
            allowedCreditLimit=input.nextInt();
            restAmount=balanceBeginningMonth+charges-credits;
            System.out.println("Account number: " + accountNumber+"; amount: "+ restAmount);
            if(allowedCreditLimit > restAmount){
                System.out.println("Credit limit exceeded!");
            }else{
                System.out.println("Credit limit is not exceeded!");
            }
        }

    }
}
