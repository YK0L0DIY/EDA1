package pratica7;

public interface ABP<Folha extends Comparable<? super Folha>>  {
    public boolean isEmpty();
    public boolean contains(Folha x);
    public Folha findMin();
    public Folha findMax();
    public void insere(Folha x);
    public void remove(Folha x);
    public void printEmOrdem();
    public void printPosOrdem();
    public void printPreOrdem();
}
