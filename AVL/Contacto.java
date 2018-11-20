package AVL;

public class Contacto implements Comparable<Contacto> {

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

    @Override
    public int compareTo(Contacto o) {
        return this.name.compareTo(o.getName());
    }
}