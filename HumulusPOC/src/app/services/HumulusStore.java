/*
 * A Humulus store wraps around CumulusRDS client implementation. 
 * It alows a pragmatic interaction with a scalable RDF store for all 
 * Etosha components.
 * 
 * This way, the Humulus project provides two components: (1) a low level 
 * component, the storage provider, which is used by CumulusRDF to 
 * connect to HBase and SOLR and (2) the CLI wrapper / or API connecter which
 * allows applications access the CumulsRDF node.
 * 
 * 
 *
 */

package app.services;

import app.internals.HumulusHeartbeatMessage;
import java.net.URL;
import java.util.Hashtable;

/**
 * A Humulus Store takes SPARQL requests and creates an execution plan for 
 * parallel SPARQL execution on many Humulus Services. 
 * 
 * The query is given to one "QueryMaster" for result merging. The client 
 * connects to the QM-Node and receives the results from it. Many QM-Nodes
 * contribute in parallel to one clients request.
 * 
 * The HumulusStore is the single query planer and load balancer for all 
 * concurrent Humulus workloads.
 * 
 * We wrap a WebService around this central master class.
 * 
 * @author kamir
 */
public class HumulusStore implements Runnable {

    // public static String ZOOKEEPER_QUORUM = "http://127.0.0.1:9001";
    public static String HUMULUS_STORE_URL = "http://127.0.0.1:9001";
    
    public boolean loadGraphFromURL( URL url ) {
        // delegate the request to one CumulusRDF node ...
        
        
        return true;
    }
    
    public boolean takeHeartBeat( int serviceId, URL url, HumulusHeartbeatMessage message ) {
        URL serviceURL = lookupURLofService( serviceId );
        if ( serviceURL == null ) registerServiceURL( serviceId, url );
        System.out.println( "*** Heartbeat from: " + serviceId + serviceURL );
        System.out.println( "*** Message : " + message.toString() );
        return false;
    } 

    
    Hashtable<Integer, URL> services = new Hashtable<Integer, URL>();
    
    private URL lookupURLofService(int serviceId) {
        return services.get(serviceId);
    }

    private void registerServiceURL(int serviceId, URL url) {
        this.services.put(serviceId, url);
    }

    @Override
    public void run() {
            System.out.println( "> (HST) RUN Humulus-Store-Node: " + this.toString() );
            System.out.println( "        " + HUMULUS_STORE_URL );
    }
    
}
