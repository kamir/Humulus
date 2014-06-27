
package com.cloudera.mccl;

import com.cloudera.mccl.activities.MRActivity;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.etosha.doa.DOAC; 

/**
 *
 * @author kamir
 */
public class MCCApp {

    public MCCApp() {
    }

    public static void main(String[] arg) {
        MCCApp app = new MCCApp();
        try {
            app.run();
        } 
        catch (URISyntaxException ex) {
            Logger.getLogger(MCCApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void run() throws URISyntaxException {
        ClusterClient clusterLocalClient = CCFactory.getClient( DOAC.getLoaclHadoopClientSetup() );
        ClusterClient clusterReomteCFG = CCFactory.getClient( DOAC.getRemoteHadoopClusterSetup());
        
        MRActivity mr1 = ClusterClient.getMRActivityInstance( clusterLocalClient );
        MRActivity mr2 = ClusterClient.getMRActivityInstance( clusterReomteCFG );
        
        mr1.submit();
        mr2.submit();
        
    
    }
    
}
