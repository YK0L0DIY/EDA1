package pratica4;

public class test {
    public static void main(String[] args) {
        QueueArray myQ= new QueueArray(10);
        for(int i=0;i<8;i++){
            myQ.enqueue(i*10);
        }
        myQ.enqueue(10);
        System.out.println(myQ.dequeue());
        System.out.println(myQ.dequeue());
        System.out.println(myQ.dequeue());
        System.out.println(myQ.dequeue());
        System.out.println(myQ.dequeue());
        System.out.println(myQ.dequeue());
        for(int i=0;i<6;i++){
            myQ.enqueue(i*10);
        }
        System.out.println("size: "+myQ.size());
    }
}
