package app.internals;

/**
 *
 * @author kamir
 */
public class HumulusHeartbeatMessage {
  
     String info = "I like Vegas!";

    @Override
    public String toString() {
        return super.toString() + " (" + info + ")";
    }
    
}
