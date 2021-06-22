public class Circle {
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
}
