package pratica1;

public class Person {

    //variavel de class
    static int a=4;

    //variaveis de nstancia
    private String name;
    private int age;

    //constructor
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    //metodo de instancia
    public String scream(){
        return "AAAAAAAAAAAAAAAAAAHHHHHHHH";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
