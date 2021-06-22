public class Circle extends Shape{
    //starting my code after branch
    double radious=1.0;
    public Circle(){
    }
    public Circle(double radious){
        this.radious=radious;
    }
    public Circle(double radious, String color, boolean filled){
        this.radious=radious;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }
    public double getArea(double radious){
        return Math.PI*radious*radious;
    }
    public double gerPerimeter(double radious){
        return 2*Math.PI*radious;
    }

    @Override
    public String toString() {
        return "A Circle with radious= " + radious + ", which is a subclass of Shape";
    }
}
