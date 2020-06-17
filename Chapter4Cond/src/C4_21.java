import java.util.Scanner;

public class C4_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter=0;
        int number;
        int largest;
        System.out.println("Enter 10 numbers: ");
        largest=input.nextInt();  //first number from 10
        while(counter<9){
            number=input.nextInt();
            if (number>largest){
                largest=number;
            }
            counter++;
        }
        System.out.println("Largest number= "+ largest);
          }

    }


