package de.cats.sophistacated;

import de.cats.general.CatStrings;

import java.util.Random;

public class DrinkingMilkState implements CatState {
    Random random = new Random();

    public void exectueAction(SophisticatedCatContext context) {
        System.out.println(CatStrings.drinkMilkSaying);
        context.setState(new SleepingState());
    }

    private void switchState(SophisticatedCatContext context) {
        int num = random.nextInt(3);
        if (num == 0) {
            context.setState(new EatingState());
        } else if (num == 1) {
            context.setState(new SleepingState());
        } else {
            context.setState(new PlayingState());
        }
    }
}
