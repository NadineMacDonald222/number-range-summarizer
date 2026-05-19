package numberrangesummarizer;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Create the summarizer
        NumberRangeSummarizer summarizer = new NumberRangeSummarizerImpl();

        // Example input
        String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";

        // Parse and summarize
        Collection<Integer> numbers = summarizer.collect(input);
        String summary = summarizer.summarizeCollection(numbers);

        // Print results
        System.out.println("Input: " + input);
        System.out.println("Summarized: " + summary);
    }
}

