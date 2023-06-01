/**
 * matcher(CharSequence input):
 *
 * Creates a Matcher object that will match the given input against the compiled pattern.
 */
package topics._12_regex.pattern_method;
import java.util.regex.*;

public class method3 {
    public static void main(String[] args) {
        String regex = "\\d+";
        String input = "1234abc5678def";
        Matcher matcher = Pattern.compile(regex).matcher(input);
        while (matcher.find()) {
            System.out.println("Match found: " + matcher.group());
        }
    }
}
