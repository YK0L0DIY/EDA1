package AVL;

public class AVL<AnyType extends Comparable<? super AnyType>> implements AVLInterface<AnyType> {

    No<AnyType> raiz = new No<AnyType>();

    @Override
    public boolean isEmpty() {
        return raiz.getElement() == null;
    }

    @Override
    public boolean contains(AnyType x) {
        return false;
    }

    @Override
    public AnyType findMin() {
        return null;
    }

    @Override
    public AnyType findMax() {
        return null;
    }

    @Override
    public void insert(AnyType x) {
        raiz = insert(raiz, x);
    }

    private No<AnyType> insert(No no, AnyType x) {
        if (no.getElement() == null) {
            return new No<AnyType>(x);
        }
        if (no.getElement().compareTo(x) > 0) {
            no.setDir(insert(no.getDir(), x));
        } else if (no.getElement().compareTo(x) < 0) {
            no.setEsq(insert(no.getEsq(), x));
        }
        return no;
    }

    @Override
    public void remove(AnyType x) {

    }

    @Override
    public void printEmOrdem() {

    }

    @Override
    public void printPosOrdem() {

    }

    @Override
    public void printPreOrdem() {

    }

    @Override
    public void rodateRight() {

    }

    @Override
    public void rodateLeft() {

    }

    @Override
    public void rodateRightLeft() {

    }

    @Override
    public void rodateLeftRight() {

    }

    @Override
    public void heightUpdate() {

    }

    @Override
    public boolean isBalanced() {
        return false;
    }
}

