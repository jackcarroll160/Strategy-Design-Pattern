package strategydesignpattern;

import java.util.Random;

public class PassBehavior implements OffenceBehavior {

    Random r = new Random();
    int move = r.nextInt(5);
    /**
     * Randomly selecting a play for the Quarterback to do
     * @author Jackson Carroll
     */
    public String play() {
        if(move == 0) {
            return "throws a slant route";
        }
        else if(move == 1) {
            return "throws a out route";
        }
        else if(move == 2) {
            return "throws a seem route";
        }
        else if(move == 3) {
            return "throws a screen pass";
        }
        else {
            return "throws a hail mary";
        }
    }
}
