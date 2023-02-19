package JavaSyntax.OOP;

public class AverageDcim {
    public static void main(String[] args) {
        int count=0;
        int summa=0;
        for (int i = 1; i <=100 ; i++) {
            System.out.println(i);
            summa+=i;
            count++;
        }
        System.out.println(summa);
        System.out.println(count);
        System.out.println(summa/count);
    }
}
