package Inheretance;

public class Lion extends CatFamily{
    public Lion(){
        super(2,4,true);
    }
    @Override
    public void eating() {
        System.out.println("Кушаю антилопу");
    }

}
