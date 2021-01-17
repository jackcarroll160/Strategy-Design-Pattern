package strategydesignpattern;

import java.util.Random;
/**
 * class for Lineman, inheriting the Player class
 * @author Jackson Carroll
 */
public class Lineman extends Player {

    /**
     * The constructor for Lineman that takes in the Lineman's name
     * @author Jackson carroll
     */
    public Lineman(String name) {
        super(name);
        setDefenceBehavior();
        setOffenceBehavior();
    }

    /**
     * Setting offenceBehavior to a new OBlockBehavior
     * @author Jackson Carroll
     */
    public void setOffenceBehavior() {
        this.offenceBehavior = new OBlockBehavior();
    }

    Random r = new Random();
    int move = r.nextInt(3);

    /**
     * Method is overriding parent class, Player, with random plays
     * @author Jackson Carroll
     */
    @Override
    public void setDefenceBehavior() {
 
        if(move == 0) {
            this.defenceBehavior = new BlockBehavior(); 
        }
        else if(move == 1) {
            this.defenceBehavior = new StripBehavior();
        }
        else {
            this.defenceBehavior = new SackBehavior();
        }
    }

    /**
     * toString method to return the Lineman's name
     * @author Jackson Carroll
     */
    public String toString() {
        return this.name;
    }
}
