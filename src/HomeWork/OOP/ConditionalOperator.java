package HomeWork.OOP;

import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();
        if (temp > 500) {
            System.out.println("Pizzzza");
        } else if (temp < 100) {
        } else {
            System.out.println("5ka");
        }

    }
}
