/**
 * group():
 *
 * This method returns the substring of the input string that was matched by the previous find() method call.
 */
package topics._12_regex.matcher_method;
import java.util.regex.*;
public class method3 {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog.";
        Pattern pattern = Pattern.compile("\\b\\w{4}\\b");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String match = matcher.group();
            System.out.println("Match found: " + match);
        }
    }
}
