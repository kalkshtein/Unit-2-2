package ru.kalkshtein.unit2.models;

public enum Ranks {
    Captain("Captain"),
    Major("Major"),
    General("General");

    String name;

    Ranks(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
