package AVL;

public class No<AnyType extends Comparable<? super AnyType>> {
    private AnyType element;
    private No esq;
    private No dir;

    public No(){
        this.element=null;
        this.esq=null;
        this.dir=null;
    }

    public No(AnyType element){
        this.element= element;
        this.esq=null;
        this.dir=null;
    }

    public No(AnyType element, No esq, No dir){
        this.element=element;
        this.esq=esq;
        this.dir=dir;
    }

    public AnyType getElement() {
        return element;
    }

    public No getDir() {
        return dir;
    }

    public No getEsq() {
        return esq;
    }

    public void setElement(AnyType element) {
        this.element = element;
    }

    public void setEsq(No esq) {
        this.esq = esq;
    }

    public void setDir(No dir) {
        this.dir = dir;
    }

}