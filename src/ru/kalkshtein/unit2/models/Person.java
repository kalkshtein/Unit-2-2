package ru.kalkshtein.unit2.models;

public class Person {

    private String name;
    private String secondName;
    private String surName;

    public Person(String name, String secondName, String surName) {
        this.name = name;
        this.secondName = secondName;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return secondName + " " + name + " " + surName;
    }

}
