package org.animalinfo;

import java.util.concurrent.TimeUnit;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return String.format("Cat name = %s, age = %d", getName(), getAge());
    }

    @Override
    public double goToWalk() {
        double walkingTime = getAge() * 0.25;
        try {
            TimeUnit.SECONDS.sleep((long) (walkingTime));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return walkingTime;
    }
}
