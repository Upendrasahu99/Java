/**
 * compile(String regex, int flags):
 *
 * Compiles the given regular expression with the specified flags into a Pattern object.
 *
 * In Java, regular expression flags are used to modify the behavior of regular expressions. Flags are optional parameters that can be passed to regular expression methods to specify how the regular expression should be matched against the input text.
 *
 */
package topics._12_regex.pattern_method;
import java.util.regex.*;
public class method2 {
    public class PatternExample2 {
        public static void main(String[] args) {
            String regex = "cat";
            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            String input = "The CAT chased the mouse";
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                System.out.println("Match found: " + matcher.group());
            }
        }
    }
}
