package exercises;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int length = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle:");
        int width = input2.nextInt();

        int area = length*width;
        System.out.println("The area of the rectangle is: " + area);
    }
}
