package org.animalinfo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> pets = new ArrayList<>();
        int count;

        while(true) {
            try {
                count = Integer.parseInt(scanner.nextLine().trim());
                break;
            } catch (NumberFormatException var10) {
                System.out.println("Could not parse a number. Please, try again");
            }
        }

        for(int i = 0; i < count; ++i) {
            String typeAnimal = scanner.nextLine().trim();
            if (!typeAnimal.equalsIgnoreCase("dog") && !typeAnimal.equalsIgnoreCase("cat")) {
                System.out.println("Incorrect input. Unsupported pet type");
            } else {
                String name = scanner.nextLine().trim();
                int age;

                while(true) {
                    try {
                        age = Integer.parseInt(scanner.nextLine().trim());
                        break;
                    } catch (NumberFormatException var9) {
                        System.out.println("Could not parse a number. Please, try again");
                    }
                }

                if (age <= 0) {
                    System.out.println("Incorrect input. Age <= 0");
                } else if (typeAnimal.equalsIgnoreCase("dog")) {
                    pets.add(new Dog(name, age));
                } else if (typeAnimal.equalsIgnoreCase("cat")) {
                    pets.add(new Cat(name, age));
                }
            }
        }

        for(Animal pet : pets) {
            System.out.println(pet);
        }

    }
}