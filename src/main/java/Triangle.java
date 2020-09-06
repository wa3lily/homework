public class Triangle implements Figure{

    private double a, b, c;

    public double perimeter() {
        return a+b+c;
    }

    public double area() {
        double p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
}
