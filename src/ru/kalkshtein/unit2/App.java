package ru.kalkshtein.unit2;

import ru.kalkshtein.unit2.models.Person;
import ru.kalkshtein.unit2.models.Ranks;
import ru.kalkshtein.unit2.models.Soldier;

public class App {

    public static void main(String[] args) {

        Person person = new Person("Falcon", "Danilov", "Ivanovich");
        Soldier soldier = new Soldier("Djekill", "Hide", "Sachkovich", Ranks.Captain);

        System.out.println("Персона № 1 " + person.toString());
        System.out.println("Персона № 2 " + soldier.toString());
    }
}
