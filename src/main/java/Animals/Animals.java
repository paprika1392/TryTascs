package Animals;

import java.util.ArrayList;

public abstract class Animals {

    protected String name;
    protected int age;
    protected String color;
    protected float weight;
    protected String voice;

    public Animals() {
    }

    public Animals(String name) {
        this.name = name;
    }

    public Animals(String name, int age, String color, float weight, String voice) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.voice = voice;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void hungryAnimal() {
        System.out.println("Give same eat fo our animal!!!");
    }

    public void washAnimal() {
        System.out.println("Please wash the animal!!!");
    }

}