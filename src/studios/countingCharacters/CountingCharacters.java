package studios.countingCharacters;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) throws FileNotFoundException {
        String alphabet = "absdefghijklmnopqrstuvwxyz";
        String ALPHABET = alphabet.toUpperCase();

        String txt_s = "If the product of two terms is zero then common sense says at least one of the two terms " +
                "has to be zero to start with. So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";
        File file = new File("src/studios/countingCharacters/Search_text");
        Scanner sc = new Scanner(file);

        String txt_file = "";
        while (sc.hasNextLine()){
            txt_file = txt_file + sc.nextLine();
        }

        HashMap<Character, Integer> dict_chars = new HashMap<>();
        char[] txt_arr = txt_s.toCharArray();
        for (char c : txt_arr){
            if(alphabet.indexOf(c) != -1 || ALPHABET.indexOf(c) != -1){
                if (dict_chars.containsKey(c)){
                    dict_chars.put(c, dict_chars.get(c) + 1);
                } else {
                    dict_chars.put(c, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> c : dict_chars.entrySet()){
            System.out.println(c.getKey() + ": " + c.getValue());
        }
    }
}
