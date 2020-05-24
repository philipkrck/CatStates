package de.cats.simple;

import de.cats.general.Cat;
import de.cats.general.CatStrings;

enum CatState {
    EAT,
    SLEEP,
    DRINKMILK,
    PLAY
}

public class SimpleCat extends Cat {

    private CatState state;

    public SimpleCat(String name) {
        super(name);
        state = CatState.EAT;
    }

    public void doSomething() {
        switch (state) {
            case EAT:
                System.out.println(CatStrings.foodSaying);
                state = CatState.DRINKMILK;
                break;
            case DRINKMILK:
                System.out.println(CatStrings.drinkMilkSaying);
                state = CatState.SLEEP;
                break;
            case SLEEP:
                System.out.println(CatStrings.sleepSaying);
                state = CatState.PLAY;
                break;
            case PLAY:
                System.out.println(CatStrings.playSaying);
                state = CatState.EAT;
                break;
        }
    }
}
