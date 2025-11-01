package org.animalinfo;

import java.util.concurrent.TimeUnit;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return String.format("Dog name = %s, age = %d", getName(), getAge());
    }

    @Override
    public double goToWalk() {
        double walkingTime = getAge() * 0.5;
        try {
            TimeUnit.SECONDS.sleep((long) (walkingTime));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return walkingTime;
    }
}
