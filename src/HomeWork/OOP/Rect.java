package HomeWork.OOP;

public class Rect {
    double length;
    double width;

    void setParametr(double length,double width){
        this.length=length;
        this.width=width;
    }
    double showPerimetr(){
        return (length*width)*2;
    }double showSquare(){
        return length*width;
    }


}
