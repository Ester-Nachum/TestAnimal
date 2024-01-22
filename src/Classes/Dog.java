package Classes;

import Interfaces.land;

/**
 * Class representing a Dog, extending the Animal class and implementing the
 * land interface.
 */
/**
 *
 * @author user1
 */
public class Dog extends Animal implements land {

    private int numberOfLengs = 4;

    public Dog() {
    }

    public Dog(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
    }

    @Override
    public void sayHello() {
        System.out.println("wagging their tails");
    }

    //The dog says hello according to its mood.
    @Override
    public void sayHello(int mood) {
        switch (mood) {
            case MOOD_HAPPY:
                System.out.println("they will bark loudly");
                break;
            case MOOD_SCARE:
                System.out.println("they will make a \"whooping\" sound");
                break;
        }
    }

    @Override
    public int getNumberOfLengs() {
        return this.numberOfLengs;
    }

}
