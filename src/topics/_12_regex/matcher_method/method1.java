/**
 * matches():
 *
 * This method attempts to match the entire input string against the pattern. It returns a boolean value indicating whether or not the entire input string matches the pattern.
 *
 */

package topics._12_regex.matcher_method;
import java.util.regex.*;
public class method1 {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog.";
        Pattern pattern = Pattern.compile("The.*dog\\.");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("The input string matches the pattern.");
        } else {
            System.out.println("The input string does not match the pattern.");
        }
    }
}
