package JavaSyntax.OOP;

import java.util.ArrayList;

public class Collection {
    public static void main(String[] args) {
        int count =0;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers.add(i);
            count+=i;
        }

        System.out.println(count);

    }
}
