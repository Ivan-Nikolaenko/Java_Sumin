package JavaSyntax.Test;

public class MyMath {
    public static final double PI = 3.14;

    static public int square(int number) {
        return number * number;
    }

    public static double lenght(double radius) {
        return 2 * PI * radius;
    }

    public static double area(double radius) {
        return PI*radius*radius;
    }

    public static int sum(int...numbers){
        int sum=0;
        for (int i : numbers
             ) {
            sum+=i;
        }return sum;
    }
}
