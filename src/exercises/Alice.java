package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String alice_origin = "Alice was beginning to get very tired of sitting by her sister on the bank, and of " +
                "having nothing to do: once or twice she had peeped into the book her sister was reading, but it " +
                "had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without " +
                "pictures or conversation?'";
        String alice_search = alice_origin.toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter term:");
        String term_origin = input.next();
        String term = term_origin.toLowerCase();

        boolean in_alice = alice_search.contains(term);
        if (in_alice){
            int index = alice_search.indexOf(term);
            int length = term.length();
            System.out.println("The term " + term_origin + " is in the text. It appears at position " + index +
                    " and its length is " + length);
            alice_origin = alice_origin.replace(term_origin, "");

            System.out.println();
            System.out.println(alice_origin);
        }
        else{
            System.out.println("The term " + term_origin + " is not in the text");
        }
    }
}
