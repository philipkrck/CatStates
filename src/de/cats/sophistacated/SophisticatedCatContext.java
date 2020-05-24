package de.cats.sophistacated;

import de.cats.general.Cat;

public class SophisticatedCatContext extends Cat {
    private CatState state;

    public SophisticatedCatContext(String name) {
        super(name);
        setState(new EatingState());
    }

    public void doSomething() {
        state.exectueAction(this);
    }

    public void setState(CatState state) {
        this.state = state;
    }
}
