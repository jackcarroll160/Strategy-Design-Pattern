package strategydesignpattern;

/**
 * Pointing the OBlockBehavior to the offensive behavior
 * @author Jackson Carroll
 */
public class OBlockBehavior implements OffenceBehavior {
    
    public String play() {
        return "block defenders";
    }
}
