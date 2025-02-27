package behavioral_patterns.iterator;

import java.util.Map;

public class ValueOfAttributesIterator implements IteratorX<String> {
    private final String[] values;
    private int position;

    public ValueOfAttributesIterator(Map<String, String> attributes) {
        values = attributes.values().toArray(new String[0]);
    }

    @Override
    public boolean hasNext() {
        return position < values.length;
    }

    @Override
    public String next() {
        return hasNext() ? values[position++] : null;
    }
}
