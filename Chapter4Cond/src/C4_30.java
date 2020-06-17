import java.util.Scanner;

public class C4_30 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        Integer number=0;
        String s=" ";
        System.out.println("Enter an integer (five digits): ");
        number=input.nextInt();
        int length = (int)(Math.log10(number) + 1);
        if(length !=5){
            System.out.println("Error! number must contain 5 digits");
            System.out.println("Enter a five digits number: ");
            number=input.nextInt();
        }
        s=number.toString();
        if (s.charAt(0)==s.charAt(4) & s.charAt(1)==s.charAt(3)){
            System.out.println("This number is a palindrome!");
        } else{
            System.out.println("This number is not a palindrome!");
        }

    }
}
