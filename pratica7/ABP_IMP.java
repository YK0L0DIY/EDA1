package pratica7;

public class ABP_IMP<AnyType> implements ABP<Folha<AnyType>> {

    Folha raiz;

    public ABP_IMP(){
        raiz=new Folha(null );
    }

    public ABP_IMP(AnyType element){
        raiz=new Folha(element );
    }

    @Override
    public boolean isEmpty() {
        return raiz.getDir()==null && raiz.getEsq()==null;
    }

    @Override
    public boolean contains(Folha x) {
        return false;
    }

    @Override
    public Folha findMin() {
        return null;
    }

    @Override
    public Folha findMax() {
        return null;
    }

    @Override
    public void insere(Folha x) {

    }

    @Override
    public void remove(Folha x) {

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
}
