package Animals;

import Animals.Animals;
import Animals.Cats.Cat;
import Animals.Dogs.Dogs;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Animals catVasya = new Cat("Vasya");
        catVasya.setColor("Blue");
        Animals catLesha = new Cat("Lesha");
        catLesha.setColor("Yellow");
        Animals catSveta = new Cat("Sveta");
        catSveta.setColor("Rad");

        //        catVasya.hungryAnimal();

//
//        Animals dogPetya = new Dogs("Petya");
//        Animals dogKatya = new Dogs("Katya");
////        dogPetya.washAnimal();
//
//
        ArrayList<Cat> catsList = new ArrayList<>();
        catsList.add(0, (Cat) catVasya);
        catsList.add(1, (Cat) catLesha);
        catsList.add(2, (Cat) catSveta);
        System.out.println(catsList.size());

        TestAnimals testAnimals1 = new TestAnimals();
        testAnimals1.arrayListCatsCounts(catsList);

//        ArrayList<Dogs> dogsCount = new ArrayList<>();
//        dogsCount.add(0, (Dogs) dogPetya);
//        dogsCount.add(1, (Dogs) dogKatya);
//        System.out.println(dogsCount.size());





    }

}