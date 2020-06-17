public class Ch6_24 {
    static boolean isPerfect(int num) {
        int sum = 1; //sum of factors
        // Find all factors and add them
        for (int i = 2; i * i <= num; i++) {
            if (num % i==0) {
                if(i * i != num){
                    sum += i + num / i;
                    }
                else{
                    sum += i;
                }
            }
        }
        if (sum == num && num != 1){
            System.out.print("Factors: ");
        for (int i=1;i< num;i++){
            if (num % i == 0){
               System.out.print(i+"; "); }
         }
            return true;
        }
        return false;
    }
    public static void main (String[] args)
    {
        System.out.println("Below are all perfect numbers till 1000:");
        for (int n = 2; n < 1000; n++) {
            if (isPerfect(n)){
                System.out.println("\n"+n + " is a perfect number");}
        }
    }
}
