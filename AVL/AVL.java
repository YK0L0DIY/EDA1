package AVL;

public class AVL<AnyType extends Comparable<? super AnyType>> implements AVLInterface<AnyType> {

    private No<AnyType> root;

    public AVL(){
        root = null;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
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
        root = insert(root, x);
    }

    private No<AnyType> insert(No no, AnyType x) {
        if (no == null) {
            return new No<AnyType>(x);
        }
        System.out.println(no.getElement());
        System.out.println(x);
        if (no.getElement().compareTo(x) > 0) {
            insert(no.getDir(), x);
        } else if (no.getElement().compareTo(x) < 0) {
            insert(no.getEsq(), x);
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

    public void printPreOrdem(){
        printPreOrdem(root);
    }

    private void printPreOrdem(No<AnyType> no) {

        if ( no.getElement() != null) {
            System.out.print(no.getElement() + " ");
            printPreOrdem(no.getEsq());
            printPreOrdem(no.getDir());
        }
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

