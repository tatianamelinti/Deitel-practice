import org.w3c.dom.css.Rect;

public class Rectangle {
    private double width=1;
    private double length=1;

    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
       return width;
    }

    public void setWidth(double width){
        if(width>0.0 & width<20.0) {
            this.width = width;
        }
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        if(length>0.0 & length<20.0) {
            this.length = length;
        }
    }


    public double area(double width, double length){
        return getLength()*getWidth();
    }

    public double perimeter(double width, double length){
        return 2.0*(getWidth()*getLength());
    }


}