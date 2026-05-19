package numberrangesummarizer;

import org.junit.jupiter.api.Test;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberParserTest {

    @Test
    void testCollectSingleNumbers() {
        NumberParser parser = new NumberParser();
        Collection<Integer> result = parser.collect("1,3,5");
        assertEquals(List.of(1, 3, 5), result);
    }

    @Test
    void testCollectWithSpaces() {
        NumberParser parser = new NumberParser();
        Collection<Integer> result = parser.collect(" 1 , 2 , 3 ");
        assertEquals(List.of(1, 2, 3), result);
    }//

    @Test
    void testCollectEmptyInput() {
        NumberParser parser = new NumberParser();
        Collection<Integer> result = parser.collect("");
        assertTrue(result.isEmpty());
    }
}

