public class Triangle {
    public int base,height;
    public double TriangleArea(){
        return (base * height)/2;
    }
    public double TrianglePerimeter(){
        return (3 * base);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
