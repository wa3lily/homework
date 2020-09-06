public class Square extends Rect{
    private double a;

    public double perimeter() {
        return a*4;
    }

    public double area() {
        return a*a;
    }

    public void setA(double a) {
        this.a = a;
    }

}
