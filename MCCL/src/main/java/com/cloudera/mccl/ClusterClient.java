
package com.cloudera.mccl;

import com.cloudera.mccl.activities.MRActivity;
import org.etosha.doa.DOAC;

/**
 *
 * @author kamir
 */
public class ClusterClient {
    
    DOAC doac = null;

    void init(DOAC doac) {
        this.doac = doac;
        initClassLoader();
        initConfiguration();
    }

    private void initClassLoader() {
        
    }

    private void initConfiguration() {
    
    }
    
    /**
     * We create a MRActivity to run a MR job in multiple clusters.
     * 
     * @return 
     */
    public static MRActivity getMRActivityInstance(ClusterClient client) {
        MRActivity mra = new MRActivity( client.doac );
        return mra;
    }
    
    
    
}
