package org.etosha.doa;

import java.net.URI;
import java.net.URISyntaxException;
import org.etosha.doa.DOAx;

/**
 *
 * @author kamir
 */
public class DOAC extends DOAx {
    
    /**
     *
     * Returns a DOAx instance to reference a Cluster, which is configured on
     * the host using the default deployment via CM5.
     *
     * doac.theDOAxURI = new URI("file://Users/kamir/MCCL/LOCALLIBS/LocalClientDOAC.rdf" );
     *
     * @return
     * @throws URISyntaxException
     */
    public static DOAC getLoaclHadoopClientSetup() throws URISyntaxException {
        DOAC doac = new DOAC();
        doac.theDOAxURI = new URI("file:///Users/kamir/MCCL/LOCALLIBS/LocalClientDOAC.rdf");
        doac.check();
        return doac;
    }

    /**
     * Returns a DOAx instance to reference a Pseudodistributed Cluster in a VM.
     *
     * doac.theDOAxURI = new URI("file://Users/kamir/MCCL/LOCALLIBS/VMTrainingDOAC.rdf" );
     *
     * @return
     * @throws URISyntaxException
     */
    public static DOAC getRemoteHadoopClusterSetup() throws URISyntaxException {
        DOAC doac = new DOAC();
        // TODO : make this a URI from SMW
        doac.theDOAxURI = new URI("file:///Users/kamir/MCCL/LOCALLIBS/VMTrainingDOAC.rdf");
        doac.check();
        return doac;
    }

    
}
