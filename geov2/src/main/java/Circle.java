public class Circle extends Shape{
    double radius=1.0;
    public Circle(){
        super();
    }
    public Circle(double radius){
        super();
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled){
        super();
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(double radius){
        return Math.PI*radius*radius;
    }
    public double gerPerimeter(double radius){
        return 2*Math.PI*radius;
    }
    @Override
    public String toString() {
        return "A Circle with radius= " + radius + ", which is a subclass of Shape";
    }
}
