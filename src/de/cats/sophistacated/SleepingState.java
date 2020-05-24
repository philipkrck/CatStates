package de.cats.sophistacated;

import de.cats.general.CatStrings;

public class SleepingState implements CatState {

    public void exectueAction(SophisticatedCatContext context) {
        System.out.println(CatStrings.foodSaying);
        context.setState(new PlayingState());
    }
}