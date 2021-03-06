import java.util.NoSuchElementException;

public class Range implements IntegerSequence {
    private int start, end, current;
    public Range(int rangeStart,  int rangeEnd) {
        start = rangeStart;
        end = rangeEnd;
        current = 0;
    }
    public void reset() {
        current = 0;
    }
    public int length() {
        return (Math.abs(end - start) + 1);
    }
    public boolean hasNext() {
        return (current < this.length());
    }

    //@throws NoSuchElementException
    public int next() {
        if (start + current > end) {
            throw new NoSuchElementException();
        } else {
            current++;
        }
        return start + (current - 1);
    }
}