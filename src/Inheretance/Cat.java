package Inheretance;

public class Cat extends CatFamily{
    public Cat(){
        super(2,4,false);
    }

    @Override
    public void eating() {
        System.out.println("Кушаю вискас");
    }
}
