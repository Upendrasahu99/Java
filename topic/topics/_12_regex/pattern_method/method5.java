/**
 * split(CharSequence input, int limit):
 *
 * Splits the given input string around matches of the compiled pattern, up to a maximum of limit times.
 */

package topics._12_regex.pattern_method;
import java.util.regex.*;
public class method5 {
    public static void main(String[] args) {
        String input = "one,two,three,four,five";
        Pattern pattern = Pattern.compile(",");
        String[] words = pattern.split(input, 3);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
