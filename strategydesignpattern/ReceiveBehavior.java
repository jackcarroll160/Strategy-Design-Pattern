package strategydesignpattern;

import java.util.Random;

public class ReceiveBehavior implements OffenceBehavior {
    
    Random r = new Random();
    int move = r.nextInt(5);

    /**
     * Randomly selects an offencive run play
     * @author Jackson Carroll
     */
    public String play() {
        if(move == 0) {
            return "runs a slant route";
        }
        else if(move == 1) {
            return "runs an out route";
        }
        else if(move == 2) {
            return "runs a seem route";
        }
        else if(move == 3) {
            return "runs a screen pass";
        }
        else {
            return "runs a hail mary";
        }
    }
}
