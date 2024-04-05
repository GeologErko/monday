package Oop1;

import java.lang.reflect.Array;

public class MainHS {
    public static void main(String[] args) {
        Human h1 = new Human(25,"Gary");
//        h1.age = 25;
//        h1.name="gary";

        Human h2 = new Human(35, "Lora");
//        h1.age = 35;
//        h1.name="lora";



       City town = new City(new Human[]{h1,h2}, 25);
//       town.humans = new Human[] {h1};
//        town.setHumans(new Human[]{h1});





        System.out.println(town.getHumans()[0].getName());


















    }
}
