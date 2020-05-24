package de.cats.sophisticated;

import de.cats.general.Cat;

public class SophisticatedCatContext extends Cat {
    public SophisticatedCatContext(String name) {
        super(name);
    }

    public void doSomething() {
        System.out.println("Cat is doing something.");
    }
}
