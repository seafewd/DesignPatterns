package StrategyPattern.Classes;

import StrategyPattern.Interfaces.FlyBehavior;

public class CantFly implements FlyBehavior {

    @Override
    public String fly() {
        return "I can't fly!";
    }
}
