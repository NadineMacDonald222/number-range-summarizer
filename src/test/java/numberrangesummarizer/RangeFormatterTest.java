package numberrangesummarizer;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RangeFormatterTest {

    @Test
    void testFormatSequentialNumbers() {
        RangeFormatter formatter = new RangeFormatter();
        String result = formatter.format(List.of(1, 2, 3, 5, 6, 8));
        assertEquals("1-3, 5-6, 8", result);
    }

    @Test
    void testFormatSingleNumbersOnly() {
        RangeFormatter formatter = new RangeFormatter();
        String result = formatter.format(List.of(1, 3, 5));
        assertEquals("1, 3, 5", result);
    }

    @Test
    void testFormatEmptyList() {
        RangeFormatter formatter = new RangeFormatter();
        String result = formatter.format(List.of());
        assertEquals("", result);
    }
}
