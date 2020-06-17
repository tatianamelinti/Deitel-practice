import java.util.Scanner;

public class Ch7_14 {
    public static int product( int... numbers ) {
        int product=1;
        for ( int i : numbers ){
            product *= i;
        }
        return product;
    }

    public static void main( String args[] ) {
        Scanner input=new Scanner(System.in);
        int numOfElements;
        System.out.println("Enter number of elements: ");
        numOfElements=input.nextInt();
        int[] numbers = new int[numOfElements];
        System.out.println("Enter numbers: ");
        for(int i=0; i<numbers.length; i++){
            numbers[i]=input.nextInt();
        }
        System.out.println("product= "+product(numbers));
              } // end main
         }

