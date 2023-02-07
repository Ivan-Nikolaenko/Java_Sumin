package JavaSyntax;

public class CycleLoop {
    public static void main(String[] args) {
//        for (int i = 1; i <=1000 ; i++) {
//            System.out.println(i);
//        }
        int a =1;
        while (a <=1000){
            System.out.println("This is a while "+a);
            a++;
            if (a==100){
                break;
            }
        }
    }
}
