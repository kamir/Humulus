/***
 * 
 * The cluster client factory create a cluster client class, which has a 
 * private class loader and a private set of configuration files.
 * 
 * Libraries and CFG files are loaded from the cluster via HTTP-FS.
 * 
 * The client configuration comes in as a URI pointing to a DOAC-file.
 *  
 ***/

package com.cloudera.mccl;

import org.etosha.doa.DOAC;
import org.etosha.doa.DOAx;

/**
 *
 * @author kamir
 */
public class CCFactory {
    
    /**
     * We use a DOAC instance to configure the classloader and the
     * config files.
     * 
     * @param doac
     * @return
     */
    public static ClusterClient getClient(DOAC doac) {
        ClusterClient client = new ClusterClient();
        client.init( doac );
        return client;
    }
    
}
