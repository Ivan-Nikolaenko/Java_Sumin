package HomeWork.OOP;

public class HWIf {
    public static void main(String[] args) {
        int hour = 19;
        boolean isGoodWeather = false;
        boolean late = hour >=23 || hour <=5;
        if(late){
            System.out.println("Спать");
        }
        if(!late && isGoodWeather){
            System.out.println("Гулять");
        }
        if(!late && !isGoodWeather){
            System.out.println("Читать книгу");
        }
    }
}
