package de.cats.sophistacated;

import de.cats.general.CatStrings;

public class PlayingState implements CatState {

    public void exectueAction(SophisticatedCatContext context) {
        System.out.println(CatStrings.playSaying);
        context.setState(new EatingState());
    }
}
