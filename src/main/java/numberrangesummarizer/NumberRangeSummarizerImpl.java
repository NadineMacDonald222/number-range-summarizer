package numberrangesummarizer;

import java.util.Collection;

public class NumberRangeSummarizerImpl implements NumberRangeSummarizer {

    private final NumberParser parser;
    private final RangeFormatter formatter;

    public NumberRangeSummarizerImpl() {
        this.parser = new NumberParser();
        this.formatter = new RangeFormatter();
    }

    @Override
    public Collection<Integer> collect(String input) {
        return parser.collect(input);
    }

    @Override
    public String summarizeCollection(Collection<Integer> input) {
        return formatter.format(input);
    }
}


