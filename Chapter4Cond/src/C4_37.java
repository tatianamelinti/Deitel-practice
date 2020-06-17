import java.util.Scanner;

public class C4_37 {
    static int factorial(int n){
        if (n == 0){
            return 1;}
            else{
                return n*factorial(n-1);
        }

    }

     static double constantE(int n){
        int count=1;
        double e=1;
        while (count<n) {
            e += (1 / (double)factorial(count));
            count++;
        }
        return e;
    }


    public static void main(String[] args) {
        //------------(a)
        Scanner input = new Scanner(System.in);
        int numFactorial;
        System.out.println("Enter a non negative number: ");
        numFactorial = input.nextInt();
        System.out.println("Factorial of " + numFactorial + " is " + factorial(numFactorial));
        //------------(b)
        int numberOfTerms;
        System.out.println("Enter number of terms to claculate constant e: ");
        numberOfTerms = input.nextInt();
        System.out.println("Constant e = "  + constantE(numberOfTerms));
        //-----------(c)
        int numberExp;
        int x;
        System.out.println("Enter number of terms to claculate constant e^x: ");
        numberExp = input.nextInt();
        System.out.println("Enter x: ");
        x = input.nextInt();
        int count=1;
        double exp=0;
        while (count<numberExp) {
            exp=1;
            exp +=(Math.pow(x,count) / factorial(count));
            count++;
        }
        System.out.println("exp = "  + exp);

         }
    }

