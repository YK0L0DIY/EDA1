//dveopers by @y.kolodiy
//
package practica2;

import java.util.ArrayList;

//2.1
public class pratica2<AnyType> implements FilaDeEspera<AnyType>,Comparable<pratica2<AnyType>> {

    ArrayList<AnyType> myArray=new ArrayList<>();

    private int tamanhoMaximo;

    public pratica2(int tamanhoMaximo){
        this.tamanhoMaximo=tamanhoMaximo;
    }

    @Override
    public int size() {
        return myArray.size();
    }

    @Override
    public int maxSize() {
        return tamanhoMaximo;
    }

    @Override
    public int places() {
        return tamanhoMaximo-this.size();
    }

    @Override
    public boolean isFull() {

        return tamanhoMaximo==this.size();

    }

    @Override
    public boolean isEmpty() {
        return myArray.isEmpty();
    }

    @Override
    public void add(AnyType object) {
        myArray.add(object);
    }

    @Override
    public AnyType front() {
        return myArray.get(0);
    }

    @Override
    public AnyType remove() {
        AnyType object=myArray.get(0);
        myArray.remove(0);
        return object;
    }

    @Override
    public String elements() {
        return myArray.toString();
    }

    @Override
    public int compareTo(pratica2<AnyType> o) {
        if(myArray.size()==o.size()){
            return 0;
        }else if(myArray.size()>o.size()){
            return 1;
        }else{
            return -1;
        }
    }
}
//fim 2.2