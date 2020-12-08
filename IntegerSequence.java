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

    }
    public int length(){  }
    public boolean hasNext(){  }

    //@throws NoSuchElementException
    public int next(){    }

}