import java.util.Scanner;
public class Ch7_16 {
    public static double sum( double arr[] ) {
        double sum=0;
        for ( double num : arr ){
            sum+=num;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int numOfElements;
        System.out.println("Enter number of elements: ");
        numOfElements=input.nextInt();
        double[] numbers = new double[numOfElements];
        System.out.println("Enter numbers: ");
        for(int i=0; i<numbers.length; i++){
            numbers[i]=input.nextInt();
        }
        System.out.println("sum = "+sum(numbers));
    } // end main
}