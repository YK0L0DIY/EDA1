package AVL;

public interface AVLInterface<AnyType extends Comparable<? super AnyType>> {

    boolean isEmpty();

    boolean contains(AnyType x);

    AnyType findMin();

    AnyType findMax();

    void insert(AnyType x);

    void remove(AnyType x);

    void printEmOrdem();

    void printPosOrdem();

    void printPreOrdem();

    void rodateRight();

    void rodateLeft();

    void rodateRightLeft();

    void rodateLeftRight();

    void heightUpdate();

    boolean isBalanced();
}
