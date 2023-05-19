/**
 * split(CharSequence input):
 *
 * Splits the given input string around matches of the compiled pattern.
 */
package topics._12_regex.pattern_method;
import java.util.regex.*;

public class method4 {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        Pattern pattern = Pattern.compile("\\W+");
        String[] words = pattern.split(input);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
