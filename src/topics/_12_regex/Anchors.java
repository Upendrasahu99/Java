/*
 * Anchors are used to specify the position of a match in the text
 */
 /*
 ===============================================
  Anchor	Description

  ^	        Matches the beginning of a line
  $	         Matches the end of a line
  \b	    Matches a word boundary
  \B	    Matches a non-word boundary
  \A	    Matches the beginning of the input
  \Z	    Matches the end of the input
 ================================================
 */
package topics._12_regex;

import java.util.regex.Pattern;

public class Anchors {
    public static void main(String[] args) {
        String regex = "^hello";
        String text1 = "hello world";
        String text2 = "say hello to the world";
        Pattern pattern = Pattern.compile(regex);
        System.out.println("Match found in text1: " + pattern.matcher(text1).find());
        System.out.println("Match found in text2: " + pattern.matcher(text2).find());
    }
}
