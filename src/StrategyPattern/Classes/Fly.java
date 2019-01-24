package StrategyPattern.Classes;

import StrategyPattern.Interfaces.FlyBehavior;

public class Fly implements FlyBehavior {

    @Override
    public String fly() {
        return "Flying super high!";
    }
}
