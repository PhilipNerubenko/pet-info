package org.animalinfo;

public class Cat extends Animal {
    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }

    public double feed() {
        return getWeight() * 0.1;
    }

    public String toString() {
        return String.format("Cat name = %s, age = %d, mass = %.2f, feed = %.2f", getName(), getAge(), getWeight(), feed());
    }
}
