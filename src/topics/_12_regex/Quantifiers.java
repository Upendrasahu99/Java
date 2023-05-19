/**
 * Quantifiers are used to specify the number of occurrences of a pattern.
 */
 /* Quantifier	Description

  *	            Matches zero or more occurrences of the preceding character or group
  +	            Matches one or more occurrences of the preceding character or group
  ?	            Matches zero or one occurrence of the preceding character or group
  {n}	        Matches exactly n occurrences of the preceding character or group
  {n,}	        Matches n or more occurrences of the preceding character or group
  {n,m}	        Matches between n and m occurrences of the preceding character or group

 */
package topics._12_regex;

import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {
        String regex = "ab{2,4}c"; // a or b come 2 time or 4 time
        String text1 = "abbc";
        String text2 = "abbbc";
        String text3 = "abbbbc";
        String text4 = "abc";
        Pattern pattern = Pattern.compile(regex);
        System.out.println("Match found in text1: " + pattern.matcher(text1).matches());
        System.out.println("Match found in text2: " + pattern.matcher(text2).matches());
        System.out.println("Match found in text3: " + pattern.matcher(text3).matches());
        System.out.println("Match found in text4: " + pattern.matcher(text4).matches());
    }
}
