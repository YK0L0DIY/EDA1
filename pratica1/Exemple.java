package pratica1;

import java.util.Scanner;

public class Exemple {

    public static void main(String[] args) {


        Person[] persons = new Person[2];

        Scanner input = new Scanner(System.in);

        int count = 0;

        while (count != 3) {
            System.out.println("Persons Name:");
            String name = input.next();
            System.out.println("age:");
            int age = input.nextInt();
            persons[count] = new Person(name, age);
            count++;
        }
        for (Person i : persons) {
            System.out.println(i.getName() + " have " + i.getAge() + " years");
        }
    }
}