package Animals;

import Animals.Cats.Cat;
import Animals.Dogs.Dogs;
import org.testng.Assert;

import java.util.ArrayList;

public class TestAnimals {

    public String exchangeCatName() {
        Animals cat1 = new Cat("Barsik");
        cat1.setName("Byblik");
        String exchangeName = cat1.getName();
        System.out.println(exchangeName);
        return exchangeName;
    }

    public String exchangeDogName() {
        Animals dog1 = new Dogs("Petya");
        dog1.setName("Aliosha");
        String exchangeName = dog1.getName();
        System.out.println(exchangeName);
        return exchangeName;
    }

    public String value() {
        Animals cat2 = new Cat("Misha");
        cat2.setColor("blue");
        System.out.println("Cat2 has a color is" + cat2.getColor());
        return cat2.getColor();

    }

    public String newMethod() {
       String newMethod =  exchangeDogName();
       return newMethod;
    }

//    @Test
    public void tectCats() {
        Animals catVasya = new Cat("Vasya");
        Animals catLesha = new Cat("Lesha");
        Animals catSveta = new Cat("Sveta");


        ArrayList<Cat> catsCount = new ArrayList<>();
        catsCount.add(0, (Cat) catVasya);
        catsCount.add(1, (Cat) catLesha);
        catsCount.add(2, (Cat) catSveta);
        System.out.println(catsCount.size());

        Assert.assertEquals(catsCount.size(), 3);

    }

    public ArrayList<String> arrayListCatsCounts(ArrayList<Cat> animals) {
        String catsNamesFromList = "";
        ArrayList<String> catsNamesNewList = new ArrayList<>();
        for(Cat i : animals) {
            catsNamesFromList = i.getName();
            System.out.println("Cat's name in our list is " + catsNamesFromList);
            catsNamesNewList.add(catsNamesFromList);
        }
        System.out.println("Finish values " + catsNamesNewList);
        return catsNamesNewList;
    }


}