/**
 * 'Arrays.stream(numbers)' is creating a stream.
 * 'filter(n -> % 2 ==0)' is Intermediate operations that transform and filter a stream, new stream that can be further processed.
 * 'sum()' Terminal operations that produce a result or a side effect, They consume the elements of the stream and terminate the stream.
 * '->' is lambda Expression.
 */
package topics._15_stream;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

// Find the sum of all even numbers in the array
        int sum = Arrays.stream(numbers).filter(n -> n % 2 == 0).sum();

        System.out.println(sum); // Output: 6
    }
}
