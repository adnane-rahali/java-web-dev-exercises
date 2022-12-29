package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){
        int[] temp = new int[]{1, 1, 2, 3, 5, 8};
        for(int i : temp){
            if(i%2 == 1){
                System.out.println(i);
            }
        }
        String s = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] s_words = s.split(" ");
        System.out.println(Arrays.toString(s_words));

        String[] s_sentences = s.split("\\.");
        System.out.println(Arrays.toString(s_sentences));
    }
}
