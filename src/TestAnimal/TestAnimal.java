/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestAnimal;

import Classes.Animal;
import Classes.Cat;
import Classes.Dog;
import Classes.Frog;
import Interfaces.land;
import Interfaces.water;

/**
 *
 * @author user1
 */
public class TestAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Dogs are mammals and predators.
        Dog dog = new Dog(true, true, Animal.MOOD_HAPPY);

        // Print whether dogs are carnivorous and mammalian
        System.out.print("Dogs are ");
        System.out.print(dog.isCarnivorous() ? "carnivorous" : "not carnivorous");
        System.out.print(" and ");
        System.out.println(dog.isMammals() ? "mammalian" : "not mammalian");

        // Print messages for different moods of dogs
        System.out.print("Dogs usually greet people by");
        dog.sayHello();
        System.out.print("When they feel comfortable being touched, ");
        dog.sayHello(Animal.MOOD_HAPPY);
        System.out.print("When they are frightened and upset, ");
        dog.sayHello(Animal.MOOD_SCARE);
        System.out.println("To dogs have " + dog.getNumberOfLengs() + " lengs.");
        System.out.println();

        //Cats are mammals and predators.
        Cat cat = new Cat(true, true, Animal.MOOD_SCARE);

        // Print whether cats are carnivorous and mammalian
        System.out.print("Cats are ");
        System.out.print(cat.isCarnivorous() ? "carnivorous" : "not carnivorous");
        System.out.print(" and ");
        System.out.println(cat.isMammals() ? "mammalian" : "not mammalian");

        // Print messages for different moods of cats
        System.out.print("Cats usually make a sound when they greet people ");
        cat.sayHello();
        System.out.print("when they are in a good mood , ");
        cat.sayHello(Animal.MOOD_HAPPY);
        System.out.print("When they are frightened , ");
        dog.sayHello(Animal.MOOD_SCARE);
        System.out.println("To cats have " + cat.getNumberOfLengs() + " lengs.");
        System.out.println();

        //Frogs are neither mammals nor predators.
        Frog frog = new Frog(false, false, Animal.MOOD_HAPPY);

        // Print whether frogs are carnivorous and mammalian
        System.out.print("Frogs are ");
        System.out.print(frog.isCarnivorous() ? "carnivorous" : "not carnivorous");
        System.out.print(" and ");
        System.out.println(frog.isMammals() ? "mammalian" : "not mammalian");

        // Print messages for different moods of frogs
        System.out.print("When the frog is in a good mood , ");
        dog.sayHello(Animal.MOOD_HAPPY);
        System.out.print("When they are frightened , ");
        dog.sayHello(Animal.MOOD_SCARE);
        System.out.println(frog.hasGills() ? "The frog has gills" : "The frog doesn't have gills.");
        System.out.println(frog.hasLaysEggs() ? "The frog has lays eggs" : "The frog hasn't lays eggs.");
        System.out.println("To frogs have " + frog.getNumberOfLengs() + " lengs.");

//        Animal[] animals = {new Cat(), new Dog(), new Frog()};
//
//        System.out.println("Animals");
//        for (Animal animal : animals) {
//            System.out.print(animal.getClass() + " is say hello: ");
//            animal.sayHello();
//            System.out.print("When they are frightened and upset, ");
//            animal.sayHello(Animal.MOOD_SCARE);
//            System.out.print("when them feel comfortable ");
//            animal.sayHello(Animal.MOOD_HAPPY);
//            
//            if (animal instanceof land) {
//                System.out.println("They have " + ((land) animal).getNumberOfLengs() + " lengs");
//            }
//            if (animal instanceof water) {
//                System.out.println(((water) animal).hasGills() ? "They have gills" : "They do'nt have gills");
//                System.out.println(((water) animal).hasLaysEggs() ? "They have lays eggs" : "They do'nt have lays eggs");
//            }
//            System.out.println();
//        }
    }

}
