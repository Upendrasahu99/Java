/**
 *Grouping allows you to group parts of a regular expression together.
 *
 */
package topics._12_regex;

import java.util.regex.Pattern;

public class Grouping {
    public static void main(String[] args) {
        String regex = "a(bc){2,3}d";
        String text1 = "abcbcd";
        String text2 = "abcbcbcdd";
        String text3 = "abcd";
        String text4 = "abcbcbcd";
        Pattern pattern = Pattern.compile(regex);
        System.out.println("Match found in text1: " + pattern.matcher(text1).matches());
        System.out.println("Match found in text2: " + pattern.matcher(text2).matches());
        System.out.println("Match found in text3: " + pattern.matcher(text3).matches());
        System.out.println("Match found in text4: " + pattern.matcher(text4).matches());
    }
}
