import java.util.Scanner;

public class C4_20 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int hoursWorkedWeek;
        double hourlyRate;
        double grossRate;
        int count=0;
        while(count<3) {
            System.out.println("Enter numbers of hours worked in a week: ");
            hoursWorkedWeek = input.nextInt();
            System.out.println("Enter hourlyRate: ");
            hourlyRate = input.nextDouble();
            if(hoursWorkedWeek>40){
                grossRate=(40*hourlyRate)+((hoursWorkedWeek-40)*(hourlyRate+hourlyRate*0.5));
            }else{
                grossRate=hoursWorkedWeek*hourlyRate;
            }
            System.out.println("Gross rate: " +grossRate);
            count++;
        }

    }
}
