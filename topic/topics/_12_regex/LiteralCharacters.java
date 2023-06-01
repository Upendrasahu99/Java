/**
 * Literal characters are the basic building blocks of regular expressions. They match themselves exactly as they appear in the pattern
 */
package topics._12_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LiteralCharacters {
    public static void main(String[] args) {
        String regex = "hello";
        String input = "hello, how are you";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        System.out.println("Match found : " + matcher.find());

    }
}
