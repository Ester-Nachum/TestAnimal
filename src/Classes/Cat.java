package Classes;

import Interfaces.land;

/**
 * Class representing a Cat, extending the Animal class and implementing the
 * land interface.
 */
/**
 *
 * @author user1
 */
public class Cat extends Animal implements land {

    private int numberOfLengs = 4;

    public Cat() {
    }

    public Cat(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
    }

    @Override
    public void sayHello() {
        System.out.println("meow~");
    }

    //The cat says hello according to its mood.
    @Override
    public void sayHello(int mood) {
        switch (mood) {
            case MOOD_HAPPY:
                System.out.println("they make a \"purr, purr\" sound");
                break;
            case MOOD_SCARE:
                System.out.println("they make a \"hiss\" sound");
                break;
        }
    }

    @Override
    public int getNumberOfLengs() {
        return this.numberOfLengs;
    }

}
