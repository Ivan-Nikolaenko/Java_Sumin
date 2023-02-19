package JavaSyntax.OOP;

public class Space {
    public static void main(String[] args) {
        String[] dayOfMonth ={"Январь","Февраль","Март","Апрель","Май","Июнь","Июль",
                "Август","Сентябрь","Октябрь","Ноябрь","Декабрь"};
        for (int i = 0; i <dayOfMonth.length ; i++) {
            System.out.print(dayOfMonth[i]);
            if(i==dayOfMonth.length-1){
                System.out.println(".");
            } else {
                System.out.println(",");
            }
        }
    }
}
