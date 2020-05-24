package de.cats.general;

import de.cats.simple.SimpleCat;

public class CatController {

    public static void main(String[] args) {
        Cat ron = new SimpleCat("Ron");

        for (int i = 0; i < 24; i++) {
            ron.doSomething();
        }
    }
}
