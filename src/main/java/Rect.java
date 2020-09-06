public class Rect implements Figure{



    private double a, b;

    public Rect(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double perimeter() {
        return (a+b)*2;
    }

    public double area() {
        return a*b;
    }

}
