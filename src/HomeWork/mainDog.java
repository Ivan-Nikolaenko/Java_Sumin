package HomeWork;

public class mainDog {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();
        d1.name = "Stepa";
        d2.name = "Ivan";
        d3.name = "Sveta";
        d1.breed = "koko";
        d2.breed = "fofo";
        d3.breed = "dada";
        d1.speed=5;
        d2.speed=55;
        d3.speed=15;
        d1.run();
        d2.run();
        d3.run();
    }
}
