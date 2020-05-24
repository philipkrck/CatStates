package de.cats.general;

public abstract class Cat {
    public String name;

    public Cat(String name) {
        this.name = name;
        System.out.println(CatStrings.greeting(name));
    }

    public abstract void doSomething();
}
