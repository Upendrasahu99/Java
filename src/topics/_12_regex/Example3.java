/**
 * In this programme we find number of vowel in the sentence.
 */
package topics._12_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example3 {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        Pattern pattern = Pattern.compile("[aeiou]");
        Matcher matcher = pattern.matcher(input.toLowerCase());
        int count = 0;
        while (matcher.find()){
            count++;
        }
        System.out.println("Number of vowel is found : " + count);
    }
}
