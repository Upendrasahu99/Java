/**
 * quote(String s):
 * <p>
 * Returns a string literal replacement for the given string that can be used as a literal in a regular expression.
 */

package topics._12_regex.pattern_method;

import java.util.regex.*;

public class method7 {
    public static void main(String[] args) {
        String input = "Hello (world)";
        String regex = Pattern.quote("(") + ".*" + Pattern.quote(")");
        Pattern pattern = Pattern.compile(regex);
    }
}
