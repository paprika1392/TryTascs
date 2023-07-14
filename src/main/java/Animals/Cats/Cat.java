package Animals.Cats;

import Animals.Animals;

import java.util.Scanner;

public class Cat extends Animals {

    protected boolean cleanCat;

    public Cat() {
        System.out.println("Void cat is created");

    }

    public Cat(String name) {
        super.name = name;
        System.out.println("Cat's name is " + name);

    }

    public Cat(String name, int age, String color, float weight, String voice, boolean cleanCat) {
        super.name = name;
        super.age = age;
        super.color = color;
        super.weight = weight;
        super.voice = voice;
        this.cleanCat = cleanCat;
        System.out.println("Full Cat is created");
    }

    public boolean getCleanCat() {
        return cleanCat;
    }

    public void setCleanCat(Boolean cleanCat) {
        this.cleanCat = cleanCat;
        }

    @Override
    public void hungryAnimal() {

        System.out.println("Cat is very hungry now :(");
        Scanner in = new Scanner(System.in);
        String meal = in.nextLine();


        if (meal!= null) {
            System.out.println("Our cat is eating delicious " + meal + " !!! ");
        } else {
            System.out.println("Give same eat fo our animal!!!");
        }
    }



}
