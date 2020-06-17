public class Ch5_20 {
    public static void main(String[] args) {
        double pi=0;

        for (int i = 200000; i > 0; i--) {
            pi += Math.pow(-1, i + 1) / (2 * i - 1);
            if (i == 1) {
                pi *= 4;
                System.out.println("PI = "+pi);
            }
        }
    }
}
