package StrategyPattern.Classes;

import StrategyPattern.Interfaces.SoundBehavior;

public class Quack implements SoundBehavior {

    @Override
    public String makeSound() {
        return "Quack!";
    }
}
