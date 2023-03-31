package JavaSyntax.Test;

abstract public class Figure {
    private double a;
    private double b;

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }
    abstract public double area ();

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
