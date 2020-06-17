import java.util.Scanner;

public class Ch6_20 {
    private static double circleArea(double radius){
        double area;
        area=Math.PI*Math.pow(radius,2);
        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        System.out.println("Enter radius of the circle: ");
        radius = input.nextDouble();
        System.out.println("Area = " + circleArea(radius));
    }

}
