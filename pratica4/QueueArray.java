package pratica4;

public class QueueArray<AnyType> implements Queue<AnyType>{

    private AnyType[] arrayQueue;
    private int first=0;
    private int last=0;

    @Override
    public void enqueue(AnyType o) {

    }

    @Override
    public AnyType front() {
        return arrayQueue[first];
    }

    @Override
    public AnyType dequeue() {
        last--;
        return arrayQueue[last];
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean empty() {
        return false;
    }
}
