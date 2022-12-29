package studios.areaOfCircle;
import static java.lang.Math.PI;

public class Circle {
    public static  double getArea(double radius){
        return (double)Math.round(PI * radius * radius*1000)/1000;
    }
}
