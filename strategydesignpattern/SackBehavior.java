package strategydesignpattern;

/**
 * Returns the sack the quarterback play
 * @author Jackson Carroll
 */
public class SackBehavior implements DefenceBehavior {
    
    public String play() {
        return "Sack the quarterback";
    }
}
