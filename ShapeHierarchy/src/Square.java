public class Square extends TwoDimentionalShape{
    private double length;

    public Square(double length) {
        this.length=length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return Math.pow(getLength(), 2);
    }

}