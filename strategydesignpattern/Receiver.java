package strategydesignpattern;

public class Receiver extends Player {
    
    /**
     * Constructor for Receiver that takes in their name and sets it using the parent class
     * @author Jackson Carroll
     */
    public Receiver(String name) {
        super(name);
        setDefenceBehavior();
        setOffenceBehavior();
    }

    /**
     * Setting the offenceBehavior to a new ReceiveBehavior
     * @author Jackson Carroll
     */
    @Override
    public void setOffenceBehavior() {
        this.offenceBehavior = new ReceiveBehavior();
    }

    /**
     * Setting the defenceBehavior to null
     * @author Jackson Carroll
     */
    @Override
    public void setDefenceBehavior() {
        this.defenceBehavior = null;
    }

    /**
     * toString method to return the Receiver's name
     * @author Jackson Carroll
     */
    public String toString() {
        return this.name;
    }
}
