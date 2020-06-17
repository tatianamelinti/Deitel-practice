import java.util.Scanner;

public class C4_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter=0;
        int numberOfElements=10;
        int number;
        int firstLargest=0;
        int temp;
        int secondLargest=0;
        System.out.println("Enter 10 numbers: ");
        while(counter<numberOfElements){
            number=input.nextInt();
            if (number>firstLargest ) {
                secondLargest=firstLargest;
                firstLargest=number;
            }
            if (number>secondLargest && number<firstLargest){
                secondLargest=number;
            }
            counter++;
        }
        System.out.println("First largest number= "+ firstLargest);
        System.out.println("Second largest number= "+ secondLargest);
    }
}
