public class Rect implements Figure{

    private double a, b;

    public double perimeter() {
        return (a+b)*2;
    }

    public double area() {
        return a*b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
}
