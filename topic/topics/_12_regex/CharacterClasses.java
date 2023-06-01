/*
 * Character classes allow you to match any one of a set of characters.
 */

/*
==================================================================================
Character Class	     Description

  [abc]	             Matches any one of the characters a, b, or c
  [^abc]	         Matches any character that is not a, b, or c
  [0-9]	             Matches any digit from 0 to 9
  [^0-9]	         Matches any character that is not a digit
  [a-z]	             Matches any lowercase letter from a to z
  [A-Z]	             Matches any uppercase letter from A to Z
  [a-zA-Z]	         Matches any letter, either lowercase or uppercase
  [0-9a-fA-F]	     Matches any hexadecimal digit
   .	             Matches any single character except a newline
  \s	             Matches any whitespace character
  \S	             Matches any non-whitespace character
  \d	             Matches any digit
  \D	             Matches any non-digit character
  \w	             Matches any word character (alphanumeric and underscore)
  \W	             Matches any non-word character
 ================================================================================================
 */
package topics._12_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClasses {
    public static void main(String[] args) {
        String regex = "[aeiou]";
        String input = "The quick brown fox jump over the lazy dog.";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.println("Vowel found : " + matcher.group());
        }
    }
}
