package Inheretance;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Lion lion = new Lion();
        lion.showInfo();
        cat.showInfo();
        cat.eating();
        lion.eating();
    }
}
