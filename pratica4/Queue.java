package pratica4;

interface Queue<AnyType> {
    public void enqueue(AnyType o);//throws OverflowQueueException;
    public AnyType front();//throws EmptyQueueException;
    public AnyType dequeue();//throws EmptyQueueException;
    public int size();
    public boolean empty();
}
