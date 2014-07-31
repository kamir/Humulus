/** 
 *  This is our YARN application which starts the containers:
 *
 *    HumulusStore     one
 *    HumulusService   many
 *    
 */

package app;

import app.services.HumulusService;
import app.services.HumulusStore;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kamir
 */
public class HumulusCluster {
    
    static final int nrOfHumulusServices = 3;
    static final int nrOfHumulusStores = 1;
    
   public static final String version = "0.0.1";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println( " H u m u l u s Cluster is an Etosha project.");
        System.out.println( ">>> Visit: http://etosha.atlassian.net for more details.");
        System.out.println( ">>> There is still a lot todo.");
        System.out.println( ">>> Look for JIRAs with label \"newby\" ...");
        try {
            // run the YARN Application now ...
            runLocalCluster();
        } catch (MalformedURLException ex) {
            Logger.getLogger(HumulusCluster.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static void runLocalCluster() throws MalformedURLException {
        
        System.out.println( ">>> RUN Humulus-Cluster in local mode ... ");
        
        Thread t1 = new Thread( new HumulusStore() );
        Thread t2 = new Thread( new HumulusService( new URL("http://127.0.0.1:9101") ) );
        Thread t3 = new Thread( new HumulusService( new URL("http://127.0.0.1:9102") ) );
        Thread t4 = new Thread( new HumulusService( new URL("http://127.0.0.1:9103") ) );
        
        t1.run();
        t2.run();
        t3.run();
        t4.run();
    }
       
    
}
