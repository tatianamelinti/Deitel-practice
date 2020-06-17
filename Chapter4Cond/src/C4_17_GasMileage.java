import java.util.Scanner;

public class C4_17_GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int milesDriven;
        int gallonsUsed;
        int milesPerGallon=0;
        int totalMiles=0;
        int totalGallons=0;
        System.out.println("Enter miles or number <=0 to quit: ");
        milesDriven = input.nextInt();
        System.out.println("Enter gallons used number <=0  to quit: ");
        gallonsUsed = input.nextInt();

        while( milesDriven>0 ) {
            milesPerGallon = milesDriven / gallonsUsed;
            System.out.println("Miles per gallon: " + milesPerGallon);
            totalMiles+=milesDriven;
            totalGallons+=gallonsUsed;
            System.out.println("Enter miles or number <=0  to quit: ");
            milesDriven = input.nextInt();
            System.out.println("Enter gallons used or number <=0  to quit: ");
            gallonsUsed = input.nextInt();
        }

        double average=(double)totalMiles/totalGallons;
            System.out.println("Average: "+average);
    }
}
