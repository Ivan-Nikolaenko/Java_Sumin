package HomeWork.OOP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Collection {
    public static void main(String[] args) {
        //Первая коллекция с числами от 1 до 10
        ArrayList<Integer> numbs = new ArrayList<>();
        for (int i = 1; i <=10; i++) {
            numbs.add(i);
        }
        //Вторая коллекция строки
        ArrayList<String> str = new ArrayList<>();

        str.add("One");
        str.add("Two");
        str.add("Three");
        str.add("Four");
        str.add("Five");
        str.add("Six");
        str.add("Seven");
        str.add("Eight");
        str.add("Nine");
        str.add("Ten");

        ArrayList<String> union = new ArrayList<>();
        for (int i = 0; i < numbs.size(); i++) {
            String s = numbs.get(i) + " - " + str.get(i);
            union.add(s);
        }

        //Последнее условия ДЗ.
        for(String uni : str){
            System.out.println(union);
        }

    }
}
