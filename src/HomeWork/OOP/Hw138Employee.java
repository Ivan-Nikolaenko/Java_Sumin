package HomeWork.OOP;

public class Hw138Employee {
    String name;
    String post;
    int salary;

    public Hw138Employee(String name, String post, int salary) {
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    String info(int a){
        return "Имя сотрудника: "+name+
                "\nДолжность: "+post+
                "\nЗарплата за "+a+" месяцев = "+(salary*a);
    }

    public static void main(String[] args) {
        Hw138Employee em1=new Hw138Employee("Ivan","Director",240000);
        System.out.println(em1.info(4));
    }
}