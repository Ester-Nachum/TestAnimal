package Classes;

import Interfaces.land;
import Interfaces.water;

/**
 * Class representing a Frog, extending the Animal class and implementing the
 * land and water interface.
 */
/**
 *
 * @author user1
 */
public class Frog extends Animal implements land, water {

    private int numberOfLengs = 4;

    public Frog() {
    }

    public Frog(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
    }

    //The frog says hello according to its mood.
    @Override
    public void sayHello(int mood) {
        switch (mood) {
            case MOOD_HAPPY:
                System.out.println("it will sing \"quack quack quack\" on the shore");
                break;
            case MOOD_SCARE:
                System.out.println("it will \"plop into the water\"");
                break;
        }
    }

    @Override
    public int getNumberOfLengs() {
        return this.numberOfLengs;
    }

    //The frog has gills.
    @Override
    public boolean hasGills() {
        return true;
    }

    //The frog has lays eggs.
    @Override
    public boolean hasLaysEggs() {
        return true;
    }

}
