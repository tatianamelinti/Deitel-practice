import java.util.Scanner;
public class Ch6_19 {
    private static void squareOf(int side, char fill) {
        int column = 0;
        int row;
        while (column < side) {
            row = 0;
            while (row < side) {
                row = row + 1;
                System.out.print(fill+" ");
            }
            column = column + 1;
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sideLength;
        char fillCharacter;
        System.out.println("Enter side length: ");
        sideLength=input.nextInt();
        System.out.println("Enter fill character: ");
        fillCharacter=input.next().charAt(0);
        squareOf(sideLength,fillCharacter);
    }
    }





