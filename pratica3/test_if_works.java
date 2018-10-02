package pratica3;
//dveopers by @y.kolodiy
//


public class test_if_works {
    public static void main(String[] args) {
        ArrayStack<Integer> myStack=new ArrayStack<>(5);

        myStack.push(1);
        myStack.push(1);
        myStack.push(2);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack.toString());
    }
}
