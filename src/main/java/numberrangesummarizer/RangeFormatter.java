package numberrangesummarizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RangeFormatter {

    /**
     * Formats a collection of integers into a comma-delimited string, combining sequential numbers into ranges.
     * Example: [1,3,6,7,8] -> "1, 3, 6-8"
     */
    public String format(Collection<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return "";
        }

        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers);

        StringBuilder sb = new StringBuilder();
        int start = sortedNumbers.get(0);
        int end = start;

        for (int i = 1; i < sortedNumbers.size(); i++) {
            int current = sortedNumbers.get(i);
            if (current == end + 1) {
                end = current; // sequential, extend range
            } else {
                appendRange(sb, start, end);
                start = end = current;
            }
        }
        appendRange(sb, start, end); // append last range
        return sb.toString();
    }

    private void appendRange(StringBuilder sb, int start, int end) {
        if (sb.length() > 0) {
            sb.append(", ");
        }
        if (start == end) {
            sb.append(start);
        } else {
            sb.append(start).append("-").append(end);
        }
    }
}


