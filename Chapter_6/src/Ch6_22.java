import java.util.Scanner;

public class Ch6_22 {
    private static int celsius(int fahrenheit){
        int celsius=(fahrenheit-32)*5/9;
        return celsius;
    }
    private static int fahrenheit(int celsius){
        int fahrenheit=(celsius*9/5)+32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temperature;
        String userChoise=" ";
        System.out.println("Enter C to convert fahrenheit to celsius equivalent or F for fahrenheit equivalent:  ");
        userChoise=input.nextLine();
        System.out.println("Enter temperature: ");
        temperature=input.nextInt();
        switch (userChoise){
            case "C":
                System.out.println("celsius equivalent of "+temperature+" fahrenheit is: "+celsius(temperature));
                break;
            case "F":
                System.out.println("fahrenheit equivalent of "+temperature+" celsius is: "+fahrenheit(temperature));
                break;
                default:
                System.out.println("Wrong letter entered!");

        }
    }

}
