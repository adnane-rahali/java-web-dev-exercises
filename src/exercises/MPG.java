package exercises;
import java.util.Scanner;

public class MPG {
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the number of miles:");
        int miles = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the number of gallons:");
        int gallons = input2.nextInt();

        double mpg = (1.0*miles)/(1.0*gallons);
        System.out.println("miles-per-gallon: " + mpg);
    }
}
