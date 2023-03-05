package HomeWork.OOP;

public class Man {
    private String name;
    private String spec;
    private int age;
    private double growth;

    public Man(String name, String spec, int age, double growth) {
        this.name = name;
        this.spec = spec;
        this.age = age;
        this.growth = growth;
    }

    public String getName() {
        return name;
    }

    public String getSpec() {
        return spec;
    }

    public int getAge() {
        return age;
    }

    public double getGrowth() {
        return growth;
    }
}
