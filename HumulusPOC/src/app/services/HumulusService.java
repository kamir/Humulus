
// We run one local CumulusRDF service as a YARN application.

package app.services;

import java.net.URL;

/**
 * We wrap a WebService around this central master class.
 *
 * @author kamir
 */
public class HumulusService implements Runnable {

    URL storeURL = null;
    // start the container with CumulusRDF inside.
    // this container uses HBase to store the triples.
    
    
    
    public HumulusService(URL _storeURL) {
        storeURL = _storeURL;
        // instantiate the service client for the HumulusStore ... 
    }
    
    
    

    @Override
    public void run() {
            System.out.println( "> (HSN) RUN Service-Node: " + this.toString() );
            System.out.println( "        " + storeURL  );
            

            // here we have to run the Netty service ...
    
            // now we send a HeartBeat to the master ....
    }
    
    
}
