package strategydesignpattern;

import java.util.Random;

public class RunBehavior implements OffenceBehavior {
    
    Random r = new Random();
    int move = r.nextInt(4);
    
    /**
     * Randomly selects a run play
     * @author Jackson Carroll
     */
    public String play() {
        if(move == 0) {
            return "runs a drive (up the gut)";
        }
        else if(move == 1) {
            return "runs a draw";
        }
        else if(move == 2) {
            return "runs a pitch";
        }
        else {
            return "runs a reverse";
        }
    }
}
