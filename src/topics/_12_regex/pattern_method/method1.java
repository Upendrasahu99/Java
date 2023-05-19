/**
 * compile(String regex):
 * <p>
 * Compiles the given regular expression into a Pattern object.
 */
package topics._12_regex.pattern_method;

import java.util.regex.*;

public class method1 {
    public static void main(String[] args) {
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        String input = "1234abc5678def";
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println("Match found: " + matcher.group());
        }
    }
}
