package StrategyPattern.Classes;

import StrategyPattern.Interfaces.FlyBehavior;
import StrategyPattern.Interfaces.SoundBehavior;

public class Cat {
    private FlyBehavior flyBehavior;
    private SoundBehavior soundBehavior;

    public Cat(FlyBehavior flyBehavior, SoundBehavior soundBehavior) {
        this.flyBehavior = flyBehavior;
        this.soundBehavior = soundBehavior;
    }

    public String makeSound() {
        return soundBehavior.makeSound();
    }

    public String fly() {
        return flyBehavior.fly();
    }
}
