import java.util.Scanner;

public class Chapter5_12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        int productOfOdds=1;
        for(int counter=1;counter<16;counter++){
            if(counter%2!=0){
                productOfOdds*=counter;
            }
        }
        System.out.println("Product of odd numbers = "+productOfOdds);
    }
}
