package strategydesignpattern;

import java.util.Random;

public class QuarterBack extends Player {
    
    /**
     * Constructor for QuarterBack class taking in a name
     * @author Jackson Carroll
     */
    public QuarterBack(String name) {
        super(name);
        setDefenceBehavior();
        setOffenceBehavior();
    }

    Random r1 = new Random();
    int move1 = r1.nextInt(2);

    /**
     * Randomly selecting a run or pass behavior and overriding parent method
     * @author Jackson Carroll
     */
    @Override
    public void setOffenceBehavior() {
        if(move1 == 0) {
            this.offenceBehavior = new RunBehavior();
        } else {
            this.offenceBehavior = new PassBehavior();
        }
    }

    /**
     * Overriding and setting the defenceBehavior to null
     * @author Jackson Carroll
     */
    @Override
    public void setDefenceBehavior() {
        this.defenceBehavior = null;
    }

    /**
     * toString method that returns QuarterBack's name
     * @author Jackson Carroll
     */
    public String toString() {
        return this.name;
    }
}