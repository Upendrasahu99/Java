package topics._15_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class   Example3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
        List<String> filteredNames = names.stream().filter(name -> name.startsWith("C")).collect(Collectors.toList());

        System.out.println(filteredNames);
    }
}
