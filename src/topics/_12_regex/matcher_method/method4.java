/**
 * start() and end():
 *
 * These methods return the start and end positions of the substring that was matched by the previous find() method call.
 */

package topics._12_regex.matcher_method;
import  java.util.regex.*;
public class method4 {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog.";
        Pattern pattern = Pattern.compile("\\b\\w{4}\\b");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Match found at positions " + start + "-" + (end-1) + ": " + matcher.group());
        }
    }
}
