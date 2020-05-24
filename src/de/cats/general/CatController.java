package de.cats.general;

import de.cats.simple.SimpleCat;
import de.cats.sophistacated.SophisticatedCatContext;

public class CatController {

    public static void main(String[] args) {
        Cat hermione = new SophisticatedCatContext("Hermione");

        for (int i = 0; i < 24; i++) {
            hermione.doSomething();
        }
    }
}
