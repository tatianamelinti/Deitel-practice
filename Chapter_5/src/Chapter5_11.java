import java.util.Scanner;

public class Chapter5_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfElements;
        int counter=0;
        int number;
        int smallest;
        System.out.println("Enter number of elements: ");
        numOfElements=input.nextInt();
        System.out.println("Enter " + numOfElements +" numbers: ");
        smallest=input.nextInt();
        for(counter=0;counter<numOfElements-1;counter++){
           number=input.nextInt();
            if (number<smallest){
                smallest=number;
            }
        }
        System.out.println("The smallest value is: "+smallest);

    }
}
