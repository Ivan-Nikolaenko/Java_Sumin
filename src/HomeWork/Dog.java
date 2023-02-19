package HomeWork;

public class Dog {
    String name;
    String breed;
    int speed;

    public void run() {
        for (int i = 0; i < speed; i++) {
            System.out.println("Бегу..."+"Моё имя "+name);
        }
    }

    public String info() {
        return "Кличка: " + name + " Порода: " + breed + " Скорость " + speed;
    }
}

