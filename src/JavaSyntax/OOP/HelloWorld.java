package JavaSyntax.OOP;

public class HelloWorld {
    public static void main(String[] args) {
        ParamTest test = new ParamTest(1,2,3);
                int square = test.square(15);
        System.out.println(square);
        double result = test.setDimens(19,39,11);
        System.out.println(result);
    }
}
