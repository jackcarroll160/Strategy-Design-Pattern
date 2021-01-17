package strategydesignpattern;

import java.util.Random;

public class BlockBehavior implements DefenceBehavior {
    
    Random r = new Random();
    int move = r.nextInt(4);

    /**
     * Randomly selects a number 0 to 3 then outputs a defence play
     * @author Jackson Carroll
     */
    public String play() {
        if(move == 0) {
            return "block a kick";
        }
        else if(move == 1) {
            return "block a punt";
        }
        else if(move == 2) {
            return "block a pass";
        }
        else {
            return "block a catch";
        }
    }
}
