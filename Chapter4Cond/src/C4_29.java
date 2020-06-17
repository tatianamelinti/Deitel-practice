import java.util.Scanner;

public class C4_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sideLength;
        int column;
        int row;
        System.out.println("Enter length of the square side (between 1 and 20): ");
        sideLength = input.nextInt();
        if (sideLength < 1 | sideLength > 20) {
            System.out.println("Enter length of the square side !!!(between 1 and 20):");
        }

      for (column = 1; column <= sideLength; column++) {
            for (row = 1; row <= sideLength; row++) {
                if (column == 1 || column == sideLength ||
                        row == 1 || row == sideLength)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
