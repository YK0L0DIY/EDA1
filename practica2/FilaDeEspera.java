//dveopers by @y.kolodiy
//
package practica2;

public interface FilaDeEspera<AnyType> {

    int size();

    int maxSize();

    int places();

    boolean isFull();

    boolean isEmpty();

    void add(AnyType object);

    AnyType front();

    AnyType remove();

    String elements();

}
