import java.util.Scanner;

public class Ch5_17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int productNum;
        int quantity;
        double totalVal=0;
        double price=0;
        int counter=0;
        System.out.println("Enter product number (1 to 5) or a number <=0 to quit: ");
        productNum=input.nextInt();
        System.out.println("...and quantity sold: ");
        quantity=input.nextInt();
        while (productNum >0) {
            switch(productNum){
                case 1:
                    price=2.98;
                    break;
                case 2:
                    price=4.50;
                    break;
                case 3:
                    price=9.98;
                    break;
                case 4:
                    price=4.49;
                    break;
                case 5:
                    price=6.87;
                    break;
                default:
                    System.out.println("Can't calculate");

            }
            totalVal+=quantity*price;
            counter++;
            System.out.println("Enter product number (1 to 5) or or a number <=0 to quit: ");
            productNum = input.nextInt();
            System.out.println("...and quantity sold: ");
            quantity = input.nextInt();
        }
        System.out.println("Total value = "+totalVal);
    }
}
