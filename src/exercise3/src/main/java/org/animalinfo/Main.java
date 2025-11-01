package org.animalinfo;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int count = readNumber(scanner);

        List<Animal> pets = IntStream.range(0, count)
                .mapToObj(i -> readAnimal(scanner))
                .filter(Objects::nonNull)
                .toList();

        pets.stream()
                .map(a -> a.getAge() > 10
                        ? (a instanceof Dog
                        ? new Dog(a.getName(), a.getAge() + 1)
                        : new Cat(a.getName(), a.getAge() + 1))
                        : a)
                .forEach(System.out::println);
    }

    private static int readNumber(Scanner scanner) {
        return Stream.generate(() -> {
                    try {
                        return Optional.of(Integer.parseInt(scanner.nextLine().trim()));
                    } catch (NumberFormatException e) {
                        System.out.println("Could not parse a number. Please, try again");
                        return Optional.<Integer>empty();
                    }
                })
                .filter(Optional::isPresent)
                .map(Optional::get)
                .findFirst()
                .orElse(0);
    }

    private static Animal readAnimal(Scanner scanner) {
        String type = scanner.nextLine().trim();
        if (!type.equalsIgnoreCase("dog") && !type.equalsIgnoreCase("cat")) {
            System.out.println("Incorrect input. Unsupported pet type");
            return null;
        }

        String name = scanner.nextLine().trim();
        int age = readNumber(scanner);

        if (age <= 0) {
            System.out.println("Incorrect input. Age <= 0");
            return null;
        }

        return switch (type.toLowerCase()) {
            case "dog" -> new Dog(name, age);
            case "cat" -> new Cat(name, age);
            default -> null;
        };
    }
}
