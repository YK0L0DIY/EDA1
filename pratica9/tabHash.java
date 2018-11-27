package pratica9;

public abstract class tabHash<AnyType> {

    private int size;
    private int used;

    private hashElement<AnyType> space[];

    public tabHash() {
        space = new hashElement[7];
        size = 7;
        used = 0;
    }

    public tabHash(int size) {
        space = new hashElement[size];
        this.size = size;
        used = 0;
    }

    public int ocupados() {
        return used;
    }

    public float factorDeCarga() {
        return used / size;
    }

    protected abstract int procPos(AnyType s);

    public void alocarTabela(int dim) {
        space = new hashElement[dim];
        this.size = dim;
        used = 0;
    }

    public void tornarVazia() {
        space = new hashElement[size];
        used = 0;
    }

    public AnyType procurar(AnyType x) {
        int proc = procPos(x);
        if (space[proc] == null || space[proc].exists) {
            return null;
        }
        return x;
    }

    public void remove(AnyType x) {
        int proc = procPos(x);
        if (space[proc] == x && space[proc].exists) {
            space[proc].remove();
        }
    }

    public void insere(AnyType x) {
        int alocar = procPos(x);
//        if(factorDeCarga()>0.5){
//            rehash();
//        }
        if (space[alocar] == null || !space[alocar].exists) {
            if (space[alocar] == x) {
                space[alocar].restore();
            }
            space[alocar] = new hashElement<>(x);
        }
        used++;
    }

    public void rehash() {
        int newSize = newSize(size * 2);

        hashElement old[]=space;
        space=new hashElement[newSize];
        used=0;

        for (hashElement<AnyType> i:old){
            if(i!=null){
                insere(i.element);
            }
        }
    }

    public void print(){
        for(int i=0;i<size;i++){
            System.out.println(""+i+" : " +space[i]);
        }
    };

    private int newSize(int oldSize) {
        oldSize++;
        //now find if the number is prime or not

        for (int i = 2; i < oldSize; i++) {
            if (oldSize % i == 0) {
                oldSize++;
                i = 2;
            } else {
                continue;
            }
        }
        return oldSize;
    }

    private class hashElement<AnyType> {
        private AnyType element;
        private boolean exists = false;

        public hashElement(AnyType element) {
            this.element = element;
            exists = true;
        }

        public void remove() {
            exists = false;
        }

        public void restore() {
            exists = true;
        }

    }
}
