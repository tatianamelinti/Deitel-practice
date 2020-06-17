import java.util.Scanner;

public class Ch6_16 {
    private static boolean isMultiple(int integer1, int integer2){
        if(integer2 % integer1 ==0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Enter a pair of integers: ");
        num1=input.nextInt();
        num2=input.nextInt();
        System.out.println("Check (2nd number is a multiple of 1st number): " + isMultiple(num1,num2));
    }

}
