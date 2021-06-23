public class Test {
    public static void main(String[] args) {
        Shape alpha = new Shape();
        alpha.setColor("green");
        alpha.setFilled(true);
        System.out.println("alpha.getColor() = " + alpha.getColor());
        System.out.println("alpha.isFilled() = " + alpha.isFilled());
        System.out.println(alpha.toString());
        ///
        Shape beta = new Shape("blue",false);
        System.out.println(beta.toString());
    }

}
