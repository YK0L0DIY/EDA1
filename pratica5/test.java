package pratica5;

public class test {
    public static void main(String[] args) {
        Nodulo<Integer> mydode=new Nodulo<>();

        mydode.setElement(1);
        mydode.setNext(new Nodulo<>(2));

        System.out.println(mydode.getElement());

        System.out.println(mydode.getNext().getElement());

        mydode.getNext().setNext(new Nodulo<>(3));

        System.out.println(mydode.getNext().getNext().getElement());
    }
}
