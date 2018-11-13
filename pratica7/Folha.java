package pratica7;

public class Folha<AnyType> {
    AnyType element;
    Folha esq;
    Folha dir;

    public void Folha(AnyType element){
        this.element= element;
        this.esq=null;
        this.dir=null;
    }

    public void Folha(AnyType element, Folha esq, Folha dir){
        this.element=element;
        this.esq=esq;
        this.dir=dir;
    }

    public AnyType getElement() {
        return element;
    }

    public Folha getDir() {
        return dir;
    }

    public Folha getEsq() {
        return esq;
    }

    public void setElement(AnyType element) {
        this.element = element;
    }

    public void setEsq(Folha esq) {
        this.esq = esq;
    }

    public void setDir(Folha dir) {
        this.dir = dir;
    }

}
