import java.util.Scanner;

public class Ch6_8 {
    private static double calculateCharges(double hours){
        double charge=0;
        if (hours<=3){
           charge=2;
        }
        if (hours>3 & hours <=24) {
                hours = (hours - 3);
                charge = 2 + hours * 0.5;
            }
//!!Nu mai mult de 10 euro
        return charge;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hours;
        int customers;
        int counter=0;
        double totalCharge=0;
        System.out.println("Enter number of customers: ");
        customers=input.nextInt();
        while(counter<customers) {
            System.out.println("Enter the hours parked for each customer: ");
            hours = input.nextDouble();
            System.out.println("Total charge for each customer: " + calculateCharges(hours));
            totalCharge+=calculateCharges(hours);
            counter++;
        }
        System.out.println("Total charge for day: "+totalCharge);
    }

}
