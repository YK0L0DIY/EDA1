package pratica5;

public interface TADLista2<AnyType> {
    public void add(AnyType x);//fim da lista
    public void add(int i, AnyType x);//adiciona na posiçao i
    public void set(int i, AnyType x);// subsitui oque esta na posicao i
    public AnyType remove(int i); //remove o elemento i
    public void remove(AnyType x); //remove o nodulo x
    public void clear(); //limpar tudo
    AnyType get(int i); //devolve o elemento na posicao i
    int size(); //tamanho da lista

}
