/**
 * In this code we're printing only odd number from arraylist.
 * "Stream<Integer> stream = numbers.stream();" is creation of stream, but it is not required we can directly use "numbers.stream()".
 * Intermediate operations "filter(n -> n % 2 !=0)"  keep only odd number.
 * Terminal Operation "forEach(System.out::println)" is print each odd number.
 *
 */

package topics._16_stream;

import java.util.Arrays;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        Stream<Integer> stream = numbers.stream();

        numbers.stream().filter(n -> n % 2 !=0).forEach(System.out::println);

    }
}
