package StrategyPattern.Classes;

import StrategyPattern.Interfaces.SoundBehavior;

public class Meow implements SoundBehavior {

    @Override
    public String makeSound() {
        return "Meow!?";
    }
}
