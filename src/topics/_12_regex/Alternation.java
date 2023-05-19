/**
 * Alternation allows you to specify alternative patterns to match
 */
package topics._12_regex;
import  java.util.regex.*;

public class Alternation {
    public static void main(String[] args) {
        String regex = "hello|world";
        String text1 = "hello";
        String text2 = "world";
        String text3 = "hello world";
        Pattern pattern = Pattern.compile(regex);
        System.out.println("Match found in text1: " + pattern.matcher(text1).matches());
        System.out.println("Match found in text2: " + pattern.matcher(text2).matches());
        System.out.println("Match found in text3: " + pattern.matcher(text3).find());
    }
}
