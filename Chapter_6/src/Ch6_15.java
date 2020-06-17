import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
public class Ch6_15 {
    private static double hypotenuse(double cathetus1, double cathetus2){
        double hypotenuse;
        hypotenuse=sqrt(pow(cathetus1,2)+pow(cathetus2,2));
        return hypotenuse;
    }

    public static void main(String[] args) {
        System.out.println("Hypotenuse of Triangle 1: " + hypotenuse(3.0,4.0));
        System.out.println("Hypotenuse of Triangle 1: " + hypotenuse(5.0,12.0));
        System.out.println("Hypotenuse of Triangle 1: " + hypotenuse(8.0,15.0));

    }

}
