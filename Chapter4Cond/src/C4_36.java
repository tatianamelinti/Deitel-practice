import java.util.Scanner;

public class C4_36 {
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

         if(Math.pow(value1,2)+Math.pow(value2,2)==Math.pow(value3,2)) {
             System.out.println("It's a right triangle");
         }
         else if(Math.pow(value2,2)+Math.pow(value3,2)==Math.pow(value1,2)){
             System.out.println("It's a right triangle");
         }
         else if(Math.pow(value1,2)+Math.pow(value3,2)==Math.pow(value2,2)){
             System.out.println("It's a right triangle");
         }
       else {
            System.out.println("It's not a right triangle!");}
       }


    }

