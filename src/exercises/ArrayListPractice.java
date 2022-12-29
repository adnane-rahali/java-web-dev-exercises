package exercises;
import java.util.ArrayList;
import java.util.*;

public class ArrayListPractice {
    public static int sumEvens(ArrayList<Integer> arr){
        int sum=0;
        for (Integer i : arr){
            if (i%2==0){
                sum = sum +i;
            }
        }
        return sum;
    }

    public static void printLengthFive(ArrayList<String> arr){
        System.out.println("Word's length: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (String s : arr){
            if(s.length()==n){
                System.out.println(s);
            }
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i=0; i<10; i++){
            temp.add(i);
        }
        System.out.println(sumEvens(temp));

        String s = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] temp1= s.split(" ");
        ArrayList<String> s_words = new ArrayList<>(Arrays.asList(temp1));
        printLengthFive(s_words);
    }
}
