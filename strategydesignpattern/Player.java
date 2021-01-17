package strategydesignpattern;

public class Player {
    protected String name;
    private boolean defence;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;

    /**
     * Constructor for Player class that takes in a name and sets the name and defence
     * @author Jackson Carroll
     */
    public Player(String name) {
        this.name = name;
        this.defence = false;
    }

    /**
     * setDefenceBehavior method and setting a default value
     * @author Jackson Carroll
     */
    public void setDefenceBehavior() {
        this.defenceBehavior = new BlockBehavior();
    }

    /**
     * setOffenceBehavior method, also setting a default value
     * @author Jackson Carroll
     */
    public void setOffenceBehavior() {
        this.offenceBehavior = new OBlockBehavior();
    }

    /**
     * If the defence is false and the defenceBehavior is null, "not playing" is returned, otherwise a defence play is made
     * @author Jackson Carroll
     */
    public String play() {
        if(this.defence) {
            if(this.defenceBehavior == null) {
                return "not playing";
            }
            else {
                return this.defenceBehavior.play();
            }
        }
        else {
            return this.offenceBehavior.play();
        }
    }

    /**
     * Method for a turnover
     * @author Jackson Carroll
     */
    public void turnover() {
        if(defence) {
            this.defence = false;
        }
        else {
            this.defence = true;
        }
    }
}