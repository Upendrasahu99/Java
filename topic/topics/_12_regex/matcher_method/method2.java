/**
 * find():
 *
 * This method attempts to find the next occurrence of the pattern in the input string. It returns a boolean value indicating whether or not a match was found.
 */

package topics._12_regex.matcher_method;
import java.util.regex.*;
public class method2 {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog.";
        Pattern pattern = Pattern.compile("\\b\\w{4}\\b");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println("Match found at position " + matcher.start() + ": " + matcher.group());
        }
    }
}
