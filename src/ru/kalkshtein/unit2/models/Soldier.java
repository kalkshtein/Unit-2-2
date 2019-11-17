package ru.kalkshtein.unit2.models;

import ru.kalkshtein.unit2.models.Person;
import ru.kalkshtein.unit2.models.Ranks;

public class Soldier extends Person {

    Ranks ranks;

    public Soldier(String name, String secondName, String surName, Ranks ranks) {
        super(name, secondName, surName);
        this.ranks = ranks;
    }

    @Override
    public String toString() {
        return ranks.getName() + " " + super.toString();
    }
}
