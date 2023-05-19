
/*
Pattern:
  The Pattern class represents a compiled regular expression. It is used to create a regular expression pattern that can be used to match against input text. You can create a Pattern object using the compile() method, which takes a string argument representing the regular expression pattern. Once you have a Pattern object, you can use it to create a Matcher object.
  */

 /*
 Matcher:
  The Matcher class is used to match a regular expression pattern against input text. You can create a Matcher object by calling the matcher() method on a Pattern object, passing in the input text as an argument. The Matcher class provides methods for finding, replacing, and manipulating matches in the input text. For example, you can use the find() method to find the next match in the input text, and the group() method to get the matched text.
  */

        package topics._12_regex;

import java.util.regex.*;


public class Example1 {
}

class SimpleRegexExample {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        Pattern pattern = Pattern.compile("fox");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            System.out.println("Match found at position " + matcher.start());
        } else {
            System.out.println("Match not found");
        }
    }
}

/*In this example, we're creating a Pattern object that represents the regular expression pattern "fox". We're then creating a Matcher object by calling the matcher() method on the Pattern object, passing in the input text "The quick brown fox jumps over the lazy dog". We're using the find() method to find the next match in the input text, and the start() method to get the starting position of the match. The output of this program would be "Match found at position 16", indicating that the word "fox" was found starting at position 16 in the input text.
 */