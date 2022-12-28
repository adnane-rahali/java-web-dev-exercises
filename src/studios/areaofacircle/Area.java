package studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius:");
        String value = input.next();
        double radius = 0;
        boolean break_out = true;

        while(break_out){
            try {
                radius = Double.parseDouble(value);
                if(radius>=0) {
                    break_out = false;
                }
                else{
                    System.out.println("Enter a valid radius:");
                    input = new Scanner(System.in);
                    value = input.next();
                }
            }
            catch (Exception e){
                System.out.println("Enter a valid radius:");
                input = new Scanner(System.in);
                value = input.next();
            }
        }

        double area = Circle.getArea(radius);
        System.out.println("For radius " + radius + ", The area of a circle of radius is: " + area);
    }
}
