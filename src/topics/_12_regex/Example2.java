/**
 *Pattern.compile create pattern to match with input.
 * patter.matcher is used to match pattern with input.
 * "matcher.find()", "matcher.start()" and "matcher.group()" is different matcher class pattern. Every method had different use case.
 * "matcher.find()" is used to find the next match of pattern in input.
 * "matcher.start()" is show the position(index) where match found.
 * "matcher.group()" is give pattern.
 */

package topics._12_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 {
    public static void main(String[] args) {
        String input = "I am going";
        Pattern pattern = Pattern.compile("am");
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()){
            System.out.println("match found in index " + matcher.start() + " matcher pattern is \" " + matcher.group() + " \" " );
        }else {
            System.out.println("not found");
        }
    }
}
