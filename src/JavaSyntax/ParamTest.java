package JavaSyntax;

public class ParamTest {
    double width;
    double height;
    double length;
    int square(int i){
        return i*i;
    }
    double setDimens(double width,double height,double length){
        this.width=width;
        this.height=height;
        this.length=length;
        return width*height*length;
    }
}
