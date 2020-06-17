public class C4_22 {
    public static void main(String[] args) {
        int number=1;
        System.out.printf("%s\t\t%s\t%s\t%s%n", "N","10*N","100*N", "1000*N");
        while(number<6){
            System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%n", number,10*number,100*number,1000*number);
            number++;
        }
    }
}


