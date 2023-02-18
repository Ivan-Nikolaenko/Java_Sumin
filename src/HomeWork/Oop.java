package HomeWork;

public class Oop {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();
        human1.name="Sveta";
        human1.age=22;
        human1.weight=49.9;
        human2.name="Ivan";
        human2.age=31;
        human2.weight=49.9;
        human3.name="John";
        human3.age=55;
        human3.weight=49.9;
        double averageAge = (human1.age+ human2.age+ human3.age)/3;
        System.out.println(averageAge);
    }
}

class Human {
    String name;
    double age;
    double weight;
}