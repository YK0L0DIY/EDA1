package AVL;

public class AVLTree<AnyType extends Comparable<? super AnyType>> {

    private AvlNode<AnyType> root;

    public AVLTree() {
        root = null;
    }


    public void insert(AnyType x) {
        root = insert(x, root);
    }


    public void remove(AnyType x) {
        //TODO remove
        System.out.println("Sorry, remove unimplemented");
    }


    public AnyType findMin() {
        return findMin(root).element;
    }

    public AnyType findMax() {
        return findMax(root).element;
    }

    public boolean contains(AnyType x) {
        return contains(x, root);
    }

    public void clean() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }


    public void printTree() {
        if (isEmpty())
            System.out.println("Empty tree");
        else
            printTree(root);
    }


    private AvlNode<AnyType> insert(AnyType x, AvlNode<AnyType> t) {
        if (t == null)
            return new AvlNode<AnyType>(x, null, null);


        if (x.compareTo(t.element) < 0) {
            t.left = insert(x, t.left);
            if (height(t.left) - height(t.right) == 2)
                if (x.compareTo(t.left.element) < 0)
                    t = rotateWithLeftChild(t);
                else
                    t = doubleWithLeftChild(t);
        } else if (x.compareTo(t.element) > 0) {
            t.right = insert(x, t.right);
            if (height(t.right) - height(t.left) == 2)
                if (x.compareTo(t.right.element) > 0)
                    t = rotateWithRightChild(t);
                else
                    t = doubleWithRightChild(t);
        }

        t.height = Math.max(height(t.left), height(t.right)) + 1;
        return t;
    }

    private AvlNode<AnyType> findMin(AvlNode<AnyType> t) {
        if (t == null)
            return t;

        while (t.left != null)
            t = t.left;
        return t;
    }


    private AvlNode<AnyType> findMax(AvlNode<AnyType> t) {
        if (t == null)
            return t;

        while (t.right != null)
            t = t.right;
        return t;
    }


    private boolean contains(AnyType x, AvlNode<AnyType> t) {
        while (t != null) {
            if (x.compareTo(t.element) < 0)
                t = t.left;
            else if (x.compareTo(t.element) > 0)
                t = t.right;
            else
                return true;    // iguais
        }

        return false;   // Nao existe
    }

    private void printTree(AvlNode<AnyType> t) {
        if (t != null) {
            printTree(t.left);
            System.out.println(t.element);
            printTree(t.right);
        }
    }
    //TODO preordem posordem

    private int height(AvlNode<AnyType> t) {
        if (t == null) {
            return -1;
        }

        return t.height;
    }


    private AvlNode<AnyType> rotateWithLeftChild(AvlNode<AnyType> k2) {
        AvlNode<AnyType> k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        k2.height = Math.max(height(k2.left), height(k2.right)) + 1;
        k1.height = Math.max(height(k1.left), k2.height) + 1;
        return k1;
    }


    private AvlNode<AnyType> rotateWithRightChild(AvlNode<AnyType> k1) {
        AvlNode<AnyType> k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
        k1.height = Math.max(height(k1.left), height(k1.right)) + 1;
        k2.height = Math.max(height(k2.right), k1.height) + 1;
        return k2;
    }


    private AvlNode<AnyType> doubleWithLeftChild(AvlNode<AnyType> k3) {
        k3.left = rotateWithRightChild(k3.left);
        return rotateWithLeftChild(k3);
    }


    private AvlNode<AnyType> doubleWithRightChild(AvlNode<AnyType> k1) {
        k1.right = rotateWithLeftChild(k1.right);
        return rotateWithRightChild(k1);
    }

    //TODO Iterator


    private static class AvlNode<AnyType> {
        AnyType element;      // sera o contacto
        AvlNode<AnyType> left;         // no esquerdo
        AvlNode<AnyType> right;        // no direito
        int height;       // altura

        // Constructors
        AvlNode(AnyType theElement) {
            this(theElement, null, null);
        }

        AvlNode(AnyType theElement, AvlNode<AnyType> lt, AvlNode<AnyType> rt) {
            element = theElement;
            left = lt;
            right = rt;
            height = 0;
        }


    }

    public static class Contacto implements Comparable<Contacto> {

        private String name;
        private int number1;
        private int number2;


        public Contacto(String name) {
            this.name = name;
            this.number1 = 0;
            this.number2 = 0;
        }

        public Contacto(String name, int number1) {
            this.name = name;
            this.number1 = number1;
            this.number2 = 0;
        }

        public String getName() {
            return name;
        }

        public int getNumber1() {
            return number1;
        }

        public int getNumber2() {
            return number2;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setNumber1(int number1) {
            this.number1 = number1;
        }

        public void setNumber2(int number2) {
            this.number2 = number2;
        }

        public String toString(){
            return name;
        }

        @Override
        public int compareTo(Contacto o) {
            return this.name.compareTo(o.getName());
        }
    }

    // Test program
    public static void main(String[] args) {
        AVLTree<Contacto> t = new AVLTree<Contacto>();


        t.insert(new Contacto("xico"));
        t.insert(new Contacto("joao"));
        t.insert(new Contacto("qwd"));
        t.insert(new Contacto("r2r"));
        t.insert(new Contacto("erer"));
        t.printTree();

    }
}
