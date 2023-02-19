package HomeWork.OOP;

public class Monstro {
    int eyes;
    int legs;
    int hands;

    public Monstro() {

    }
    public Monstro(int eyes) {
        this.eyes = eyes;
    }
    public Monstro(int eyes, int legs) {
        this.eyes = eyes;
        this.legs = legs;
    }

    public Monstro(int eyes, int legs, int hands) {
        this.eyes = eyes;
        this.legs = legs;
        this.hands = hands;
    }
    public void voice(){
        System.out.println("Голос");
    }
    public void voice(int i){
        for (int j = 0; j < i; j++) {
            System.out.println("Голос");
        }
    }
    public void voice(int i,String word){
        for (int j = 0; j <i ; j++) {
            System.out.println(word);
        }
    }

}
