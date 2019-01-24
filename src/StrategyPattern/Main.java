package StrategyPattern;

import StrategyPattern.Classes.*;

public class Main {

    public static void main(String[] args) {
        Duck duck = new Duck(new Fly(), new Quack());
        Cat cat = new Cat(new CantFly(), new Meow());
        Cat flyingCat = new Cat(new Fly(), new Meow());

        System.out.println("Duck says " + duck.makeSound());
        System.out.println("Duck: " + duck.fly());

        System.out.println("Kitty says " + cat.makeSound());
        System.out.println("Kitty: " + cat.fly());

        System.out.println("Kitty says: " + flyingCat.makeSound());
        System.out.println("Flying kitty: " + flyingCat.fly());



    }
}
