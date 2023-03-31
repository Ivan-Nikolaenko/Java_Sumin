package JavaSyntax.OOP;

import JavaSyntax.Test.MyMath;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int i = MyMath.square(20);
        System.out.println(i);
        double a = MyMath.lenght(19);
        System.out.println(a);
        int b = MyMath.sum(1,6,1);
        System.out.println(b);
        String s = "1000";
        String s1 = "1000";
        int z = Integer.parseInt(s);
        int z1 = Integer.parseInt(s1);
        System.out.println(z+z1);

    }
}
