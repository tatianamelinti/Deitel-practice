import java.util.Scanner;

public class Ch6_14 {
    private static int integerPower(int base,int exponent){
        int power=1;
        int counter=0;
        if (exponent!=0){
            while(counter<exponent){
                power*=base;
                counter++;
            }
        }
        return power;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base;
        int expo;
        System.out.println("Enter base: ");
        base=input.nextInt();
        System.out.println("Enter exponent: ");
        expo=input.nextInt();
        System.out.println("Result = "+ integerPower(base,expo));
    }

}
