import java.util.Scanner;

public class Ch6_26 {
    private static int reverseInt(int number){
        int reversed=0;
        while(number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        System.out.println("Enter an integer: ");
        number=input.nextInt();
        System.out.println("This integer reversed: "+reverseInt(number));
    }
}