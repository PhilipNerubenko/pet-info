package org.animalinfo;

public class Dog extends Animal {
    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    public double getFeedInfoKg() {
        return getWeight() * 0.3;
    }

    public String toString() {
        return String.format("Dog name = %s, age = %d, mass = %.2f, feed = %.2f", getName(), getAge(), getWeight(), getFeedInfoKg());
    }
}
