import java.util.Scanner;
public class Ch6_29 {
        public static void main (String[]args){
            Scanner input = new Scanner(System.in);
            int usersChoise;
            int counter=0;
            int frequencyHeads=0;
            int frequencyTails=0;
            System.out.println("Enter <1> to Toss Coin or <0> to quit: ");
            usersChoise=input.nextInt();
            while (usersChoise==1 && usersChoise != 0) {
                Coin side=Coin.flip();
                switch (side){
                    case TAILS:
                        frequencyTails++;
                        break;
                    case HEADS:
                        frequencyHeads++;
                }
                System.out.println("Enter <1> to Toss Coin or <0> to quit: ");
                usersChoise=input.nextInt();
                System.out.printf("toss[%d] = %s%n", counter, side);
                counter++;
            }
            System.out.println("HEADS apeared "+frequencyHeads+" times");
            System.out.println("TAILS apeared "+frequencyTails+" times");
        }
    }
