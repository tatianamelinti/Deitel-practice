import java.util.Scanner;
public class Ch7_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int salesPeople;
        double grossSales;
        double totalPay;
        System.out.println("Enter number of sales persons: ");
        salesPeople = input.nextInt();

        double[] salary = new double[salesPeople];
        for (int i = 0; i < salary.length; i++) {
            System.out.println("Enter gross sales amount: ");
            grossSales = input.nextDouble();
            totalPay = grossSales * 0.09 + 200;
            salary[i] = totalPay;
        }
        System.out.println("Salaries: ");
        for (double sal : salary) {
            System.out.println("Salary: " + sal);
        }
        int[] counters = new int[9];
        for (double s : salary) {
            if (s >= 200 & s <= 299) {
                counters[0] += 1;
            } else if (s >= 300 & s <= 399) {
                counters[1] += 1;
            } else if (s >= 400 & s <= 499) {
                counters[2] += 1;
            } else if (s >= 500 & s <= 599) {
                counters[3] += 1;
            } else if (s >= 600 & s <= 699) {
                counters[4] += 1;
            } else if (s >= 700 & s <= 799) {
                counters[5] += 1;
            } else if (s >= 800 & s <= 899) {
                counters[6] += 1;
            } else if (s >= 900 & s <= 999) {
                counters[7] += 1;
            } else if (s >= 1000) {
                counters[8] += 1;
            }
        }
        String[] ranges = {"$200-299", "$300-399", "$400-499", "$500-599", "$600-699",
                "$700-799", "$800-899", "$900-999", "$1000 and over"};
        System.out.printf("%s\t\t%s\t\t%n","Salary range:","Number of employees:");
        for(int i=0;i<ranges.length;i++){
            System.out.printf("%s\t\t\t\t%d\t\t%n", ranges[i],counters[i]);
        }

    }
}
