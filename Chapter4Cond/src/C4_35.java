import java.util.Scanner;

public class C4_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value1;
        int value2;
        int value3;
        System.out.println("Enter 3 nonzero int values: ");
            value1=input.nextInt();
            value2=input.nextInt();
            value3=input.nextInt();
        if(value1*value2*value3==0){
            System.out.println("Enter nonzero values!");
        }
        if(value1+value2>value3){
            if (value1+value3>value2){
                if(value2+value3>value1){
                    System.out.println("These values could represent sides of a triangle.");
                }
                else{
                    System.out.println("These values are not sides of a triangle!");}
            }
            else{
                System.out.println("These values are not sides of a triangle!");}
        }
        else{
            System.out.println("These values are not sides of a triangle!");}
    }
}
