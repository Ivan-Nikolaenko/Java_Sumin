package HomeWork.OOP;

public class Main {
    public static void main(String[] args) {
        String s1 = "Это Иван, ему 34 года,его рост 166.3 см. Должность - программист.";
        String name = s1.substring(4,8);
        String age =s1.substring(14,16);
        String growth=s1.substring(31,36);
        String spec=s1.substring(53,64);
        int ageInt = Integer.parseInt(age);
        double growthDouble = Double.parseDouble(growth);
        Man m1 = new Man(name,spec,ageInt,growthDouble);
        System.out.println(m1.getAge());
        System.out.println(m1.getName());
        System.out.println(m1.getGrowth());
        System.out.println(m1.getSpec());

    }
}
