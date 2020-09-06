public class Circle implements Figure{

    private double r, d;


    public double perimeter() {
        return 2*Math.PI*r;
    }

    public double area() {
        return Math.PI*r*r;
    }

    public void setR(double r){
        this.r=r;
        this.d=r*2;
    }

    public void setD(double d){
        this.d=d;
        this.r=d/2;
    }
}
