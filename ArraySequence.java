import java.util.NoSuchElementException;

public class ArraySequence implements IntegerSequence {
    private int currentIndex;
    private int[] data;

    /*Construct the sequence by copying values from the other array into the data array*/
    public ArraySequence(int[] other){
        data = new int[other.length];
        for (int i = 0; i < other.length; i++) {
            data[i] = other[i];
        }
        currentIndex = 0;
    }

    public ArraySequence(IntegerSequence otherseq) {
        currentIndex = 0;
        int index = 0;
        data = new int[otherseq.length()];
        while(otherseq.hasNext()) {
            data[index] = r.next();
            index++;
        }
    }

    public void reset() {
        currentIndex = 0;
    }

    public int length() {
        return (data.length);
    }

    public boolean hasNext() {
        return (currentIndex < this.length());
    }

    //@throws NoSuchElementException
    public int next() {
        if (currentIndex > this.length()) {
            throw new NoSuchElementException();
        } else {
            currentIndex++;
        }
        return data[currentIndex - 1];
    }
}