package org.animalinfo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> pets = new ArrayList<>();
        int count;

        while(true) {
            try {
                count = Integer.parseInt(scanner.nextLine().trim());
                break;
            } catch (NumberFormatException var13) {
                System.out.println("Could not parse a number. Please, try again");
            }
        }

        for(int i = 0; i < count; ++i) {
            String typeAnimal = scanner.nextLine().trim();
            if (!typeAnimal.equalsIgnoreCase("dog") && !typeAnimal.equalsIgnoreCase("cat") &&
                    !typeAnimal.equalsIgnoreCase("hamster") && !typeAnimal.equalsIgnoreCase("guinea")) {
                System.out.println("Incorrect input. Unsupported pet type");
            } else {
                String name = scanner.nextLine().trim();
                int age;

                while(true) {
                    try {
                        age = Integer.parseInt(scanner.nextLine().trim());
                        break;
                    } catch (NumberFormatException var12) {
                        System.out.println("Could not parse a number. Please, try again");
                    }
                }

                if (age <= 0) {
                    System.out.println("Incorrect input. Age <= 0");
                } else {
                    switch (typeAnimal.toLowerCase()) {
                        case "dog":
                            pets.add(new Dog(name, age));
                            break;
                        case "cat":
                            pets.add(new Cat(name, age));
                            break;
                        case "hamster":
                            pets.add(new Hamster(name, age));
                            break;
                        case "guinea":
                            pets.add(new GuineaPig(name, age));
                    }
                }
            }
        }

        Comparator<Animal> herbivoreFirst = (p1, p2) -> Boolean.compare(p2 instanceof Herbivore, p1 instanceof Herbivore);
        pets.sort(herbivoreFirst);
        pets.forEach(System.out::println);
    }
}