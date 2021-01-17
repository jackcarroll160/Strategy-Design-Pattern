package strategydesignpattern;

/**
 * Returns the stripping the ball play
 * @author Jackson Carroll
 */
public class StripBehavior implements DefenceBehavior {
    
    public String play() {
        return "Strip a ball from runners hands";
    }
}
