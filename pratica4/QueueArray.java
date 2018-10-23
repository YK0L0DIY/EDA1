package pratica4;

public class QueueArray<AnyType> implements Queue<AnyType> {

    private AnyType[] arrayQueue;
    private int first = 0;
    private int last = 0;
    private int elements;

    public QueueArray() {
        elements = 10;
        arrayQueue = (AnyType[]) new Object[10];
    }

    public QueueArray(int size) {
        elements = size;
        arrayQueue = (AnyType[]) new Object[size];
    }


    @Override
    public void enqueue(AnyType o) {
        if (size() == elements - 1) {
            throw new RuntimeException("no elements");
        }
        arrayQueue[last] = o;
        if (last + 1 == elements) {
            last = 0;
        } else {
            last++;
        }
    }

    @Override
    public AnyType front() {
        return arrayQueue[first];
    }

    @Override
    public AnyType dequeue() {
        if (empty()) {
            throw new RuntimeException("to many elements");
        }

        AnyType e = arrayQueue[first];
        if (first + 1 == elements) {
            first = 0;
            return e;
        }
        first++;
        return e;
    }

    @Override
    public int size() {
        return (elements - first + last) % elements;
    }

    @Override
    public boolean empty() {
        return first == last;
    }
}
