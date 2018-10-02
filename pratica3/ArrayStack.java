//dveopers by @y.kolodiy
//

package pratica3;

public class ArrayStack<AnyType> implements Stack<AnyType>{

    private AnyType[] arrayStack;
    private int top=0;

    public ArrayStack(){
        arrayStack=(AnyType[])new Object[10];
    }

    public ArrayStack(int size){
        arrayStack=(AnyType[])new Object[size];
    }

    @Override
    public void push(AnyType o) {
        if(top==this.size()){
            throw new RuntimeException("size to big");

        }
        arrayStack[top]=o;
        top++;

    }

    @Override
    public AnyType top() {
        return arrayStack[top];
    }

    @Override
    public AnyType pop() {
        if(size()!=0){
            AnyType o= arrayStack[top];
            top--;
            return o;
        }
        throw new RuntimeException("size to low");
    }


    @Override
    public int size() {
        return top+1;
    }

    @Override
    public boolean empty() {
        return top == 0;
    }

    public String toString(){

        String string="";
        for (AnyType i: arrayStack){
            if(i==null){
                break;
            }
            string += i.toString()+" ";
        }
        return string;
    }
}
