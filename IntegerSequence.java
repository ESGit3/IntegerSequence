import java.util.NoSuchElementException;

public interface IntegerSequence {
    boolean hasNext();
    int next();
    int length();
    void reset();
}

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

    }

    //@throws NoSuchElementException
    public int next(){    }

}