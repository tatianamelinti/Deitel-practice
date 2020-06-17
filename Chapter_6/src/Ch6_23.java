import java.util.Scanner;

public class Ch6_23 {
    private static double minimum3(double num1, double num2, double num3){
        double smallest=Math.min(Math.min(num1, num2), num3);
        return smallest;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double number1, number2, number3;
        System.out.println("Enter 3 numbers: ");
        number1=input.nextDouble();
        number2=input.nextDouble();
        number3=input.nextDouble();
        System.out.println("The minimum value is: "+ minimum3(number1,number2,number3));
    }
}
