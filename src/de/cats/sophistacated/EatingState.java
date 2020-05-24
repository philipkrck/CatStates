package de.cats.sophistacated;

import de.cats.general.CatStrings;

import java.util.Random;

public class EatingState implements CatState {

    Random random = new Random();

    public void exectueAction(SophisticatedCatContext context) {
        System.out.println(CatStrings.foodSaying);
        switchState(context);
    }

    private void switchState(SophisticatedCatContext context) {
        int num = random.nextInt(3);
        if (num == 0) {
            context.setState(new DrinkingMilkState());
        } else if (num == 1) {
            context.setState(new SleepingState());
        } else {
            context.setState(new PlayingState());
        }
    }
}
