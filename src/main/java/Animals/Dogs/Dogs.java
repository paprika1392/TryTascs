package Animals.Dogs;

import Animals.Animals;

import java.util.Scanner;

public class Dogs extends Animals {

    protected boolean cleanDog;

    public Dogs() {
        System.out.println("Void dog is created");
    }

    public Dogs(String name) {
        this.name = name;
        System.out.println("Dog's name is " + name);
    }

    public Dogs(String name, int age, String color, float weight, String voice, boolean cleanDog) {
        super.name = name;
        super.age = age;
        super.color = color;
        super.weight = weight;
        super.voice = voice;
        this.cleanDog = cleanDog;
        System.out.println("Full dog is created");
    }

    @Override
    public void washAnimal() {
        System.out.println("Please wash the Dog!!!");

        Scanner in = new Scanner(System.in);
        String itemsForClinner = in.next();

        switch (itemsForClinner) {
            case "Soap" -> System.out.println("Wash me with soap");
            case "Shampoo" -> System.out.println("Wash me with shampoo, but soap ie better");
            default -> System.out.println("Dog needs a soup or a shampoo");
        }


    }
}
