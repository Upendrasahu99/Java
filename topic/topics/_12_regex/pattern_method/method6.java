/**
 * matches(String regex, CharSequence input):
 *
 * Determines if the given input matches the given regular expression.
 */
package topics._12_regex.pattern_method;
import java.util.regex.*;
public class method6 {
    public static void main(String[] args) {
        String regex = "\\d+";
        String input1 = "12345";
        String input2 = "abc123";
        boolean matches1 = Pattern.matches(regex, input1);
        boolean matches2 = Pattern.matches(regex, input2);
        System.out.println("Input1 matches: " + matches1);
        System.out.println("Input2 matches: " + matches2);
    }
}
