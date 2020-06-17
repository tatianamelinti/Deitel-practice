import java.util.Scanner;

public class C4_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit;
        int numberOfDigits;
        int decimal=0;
        System.out.println("Enter number of digits in your binary number: ");
        numberOfDigits=input.nextInt();
        System.out.println("Enter one by one digits of binary number: ");
        int counter=0;
        while(counter<numberOfDigits) {
            digit= input.nextInt();
            decimal += (digit * (Math.pow(2, numberOfDigits - (counter+1))));
            counter++;
           }
        System.out.println("Equivalent decimal number is: "+decimal);
    }
}




