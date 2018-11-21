package AVL;

public class test {
    public static void main(String[] args) {
        AVL<Contacto> agenda = new AVL<Contacto>();
        agenda.insert(new Contacto("manel"));
        agenda.insert(new Contacto("joiao"));

        System.out.println(agenda.isEmpty());
        agenda.printPreOrdem();

    }
}
