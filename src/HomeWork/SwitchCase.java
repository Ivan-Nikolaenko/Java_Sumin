package HomeWork;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.equals("Январь")) {
            System.out.println(1);
        } else if (s.equals("Февраль")) {
            System.out.println(2);
        } else if (s.equals("Март")) {
            System.out.println(3);
        } else if (s.equals("Апрель")) {
            System.out.println(4);
        } else if (s.equals("Май")) {
            System.out.println(5);
        } else if (s.equals("Июнь")) {
            System.out.println(6);
        } else if (s.equals("Июль")) {
            System.out.println(7);
        } else if (s.equals("Август")) {
            System.out.println(8);
        } else if (s.equals("Сентябрь")) {
            System.out.println(9);
        } else if (s.equals("Октябрь")) {
            System.out.println(10);
        } else if (s.equals("Ноябрь")) {
            System.out.println(11);
        } else if (s.equals("Декабрь")) {
            System.out.println(12);
        } else {
            System.out.println("I don't now ");
        }
    }
}
