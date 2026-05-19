package numberrangesummarizer;

import org.junit.jupiter.api.Test;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class NumberRangeSummarizerImplTest {

    @Test
    void testSummarizeExampleInput() {
        NumberRangeSummarizerImpl summarizer = new NumberRangeSummarizerImpl();
        Collection<Integer> numbers = summarizer.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31");
        String summary = summarizer.summarizeCollection(numbers);
        assertEquals("1, 3, 6-8, 12-15, 21-24, 31", summary);
    }

    @Test
    void testSummarizeSingleNumber() {
        NumberRangeSummarizerImpl summarizer = new NumberRangeSummarizerImpl();
        Collection<Integer> numbers = summarizer.collect("5");
        String summary = summarizer.summarizeCollection(numbers);
        assertEquals("5", summary);
    }

    @Test
    void testSummarizeEmptyInput() {
        NumberRangeSummarizerImpl summarizer = new NumberRangeSummarizerImpl();
        Collection<Integer> numbers = summarizer.collect("");
        String summary = summarizer.summarizeCollection(numbers);
        assertEquals("", summary);
    }
}

