import java.util.Scanner;

public class Ch5_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, number3, number4, number5;
        System.out.println("Enter 5 integer numbers between 1 and 30: ");
        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();
        number4 = input.nextInt();
        number5 = input.nextInt();


        for (int i = 0; i < number1; i++) {
            System.out.print("*");
        }
        System.out.println(" ");

        for (int i = 0; i < number2; i++) {
            System.out.print("*");
        }
        System.out.println(" ");

        for (int i = 0; i < number3; i++) {
            System.out.print("*");
        }
        System.out.println(" ");


        for (int i = 0; i < number4; i++) {
            System.out.print("*");
        }
        System.out.println(" ");

        for (int i = 0; i < number5; i++) {
            System.out.print("*");
        }
        System.out.println(" ");



    }

}


