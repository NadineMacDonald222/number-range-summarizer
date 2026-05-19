package numberrangesummarizer;

import java.util.ArrayList;
import java.util.Collection;

public class
NumberParser {


    // Parses a comma-separated string of numbers into a collection of integers.

    public Collection<Integer> collect(String input) {
        Collection<Integer> numbers = new ArrayList<>();
        if (input == null || input.isEmpty()) {
            return numbers;
        }

        String[] tokens = input.split(",");
        for (String token : tokens) {
            numbers.add(Integer.parseInt(token.trim()));
        }
        return numbers;
    }
}


