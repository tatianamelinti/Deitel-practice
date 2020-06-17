public class MainTest {
    public static void main(String[] args) {
        Shape shape[] = new Shape[6];
        shape[0] = new Circle(10.0);
        shape[1] = new Square(10.0);
        shape[2] = new Triangle(9.0, 10.0);
        shape[3] = new Sphere(10.0);
        shape[4] = new Cube(10.0);
        shape[5] = new Tetrahedron(10.0);

        for (Shape curentShape : shape) {
            System.out.println(curentShape);
            if (curentShape instanceof TwoDimentionalShape) {
                TwoDimentionalShape twoDimentionalShape = (TwoDimentionalShape) curentShape;

                System.out.printf("Area: %.2f\n\n",  twoDimentionalShape.getArea());

            } else if (curentShape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape threeDimensionalShape = (ThreeDimensionalShape) curentShape;
                System.out.printf("Volume: %.2f\n\n",threeDimensionalShape.getVolume());

                System.out.printf("Area: %.2f\n\n", threeDimensionalShape.getArea());
            }

        }
    }
}
