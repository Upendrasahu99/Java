package topics._10_data_structure.a_16_array;

import java.util.Arrays;

public class Array {
    public static void main(String args[]) {
        int[] numbers = {1, 2, 3, 4, 5};

// Find the sum of all even numbers in the array
        int sum = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .sum();

        System.out.println(sum); // Output: 6
    }

}
