
import java.util.Scanner;
public class C4_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;
        int result;
        while (studentCounter <= 10) {
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            result = input.nextInt();

          while(result<0|result>2){
              System.out.print("That's not a required value! Enter a new value");
              System.out.print("Enter result (1 = pass, 2 = fail): ");
              result=input.nextInt();
          }

            if (result == 1){
                passes = passes + 1;}
           else{
            failures = failures + 1;
        }
            studentCounter = studentCounter + 1;

        }
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
        //determine whether more than 8 students passed
       if (passes > 8){
           System.out.println("Bonus to instructor!");}
    }
}




