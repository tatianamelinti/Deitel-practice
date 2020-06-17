public class Tetrahedron extends ThreeDimensionalShape {

    private double edge;

    public Tetrahedron(double edge) {
        this.edge = edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * Math.pow(getEdge(), 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(getEdge(), 3) / (6 * Math.sqrt(2));
    }

}

