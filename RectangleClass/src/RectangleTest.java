public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rect=new Rectangle(2,3);
        System.out.println("Area: " + rect.area(rect.getWidth(),rect.getLength()));
        System.out.println("Perimeter: " + rect.perimeter(rect.getWidth(),rect.getLength()));
    }
}
