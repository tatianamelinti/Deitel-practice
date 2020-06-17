import java.util.Scanner;

public class C5_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int counter = 0;
        System.out.println("Enter 5 integer numbers between 1 and 30: ");
        while (counter < 5) {
            number = input.nextInt();
            if (number > 0 && number < 31) {
                switch (counter) {
                    case 0:
                        for (int i = 0; i < number; i++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                        break;
                    case 1:
                        for (int i = 0; i < number; i++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                        break;
                    case 2:
                        for (int i = 0; i < number; i++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                        break;
                    case 3:
                        for (int i = 0; i < number; i++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                        break;
                    case 4:
                        for (int i = 0; i < number; i++) {
                            System.out.print("*");
                        }
                        break;
                }
            } else {
                System.out.println("Wrong number");
            }
        }
        }

    }

