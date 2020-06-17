import java.util.Scanner;

public class C4_19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double priceItem1=239.99;
        double priceItem2=129.75;
        double priceItem3=99.95;
        double priceItem4=350.89;

        double totalValue=0;
        double totalPay=0;

            int counter =1;
            while(counter<5){
                System.out.println("Enter number of items sold for item "+ counter+ " : ");
                int quantity=input.nextInt();
                if(counter==1) {
                    totalValue= (quantity * priceItem1);
                }
                    if (counter == 2) {
                        totalValue += (quantity * priceItem2);
                    }
                        if (counter == 3) {
                            totalValue += (quantity * priceItem3);

                        }
                            if (counter == 4) {
                                totalValue += (quantity * priceItem4);
                            }
                counter++;
            }

        System.out.println("Total Value "+totalValue);
        totalPay+=totalValue*0.09+200;
        System.out.println("Total pay: "+totalPay);

    }
}
