/**
 *  This is our DEMO client to run Humulus tests and benchmarks.
 * 
 *  Humulus will show the usage of the DOAx concepts in action. 
 *  In short, we add metadata to a scalable triple store, either a local one or
 *  even to a remote interconnecting triple store. This allows creation of the
 *  global data graph. Requests are processed as SPARQL queries.
 *  
 *  The first supported web tripple store is CumulusRDF. We run multiple 
 *  CumulusRDF servers, managed as HumulusServices behind a HumulusStore. 
 *
 **/

package app;

/**
 *
 * @author Mirko Kämpf
 */
public class HumulusPOC {

    public static final String version = "0.0.3";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println( "# H u m u l u s   is an Etosha project.");
        System.out.println( "### Visit: http://etosha.atlassian.net for more details.");
        System.out.println( "### There is still a lot todo.");
        System.out.println( "### Look for JIRAs with label \"newby\" ...");
    
        prepare();
        
        runOnCasandra();
        
        runOnHBase();
        
        runOnFuseki();
        
        runOnSOLR();
    }

    private static void runOnCasandra() {

        // load some DOAP files ....
        
        
        // load some DOAD files ...
        
        
        // query some stuff

    
    }

    private static void runOnHBase() {
    
        // load some DOAP files ....
        
        
        // load some DOAD files ...
        
        
        // query some stuff

    
    }

    private static void runOnFuseki() {
    
        // load some DOAP files ....
        
        
        // load some DOAD files ...
        
        
        // query some stuff

    }

    private static void runOnSOLR() {
    
        // load some DOAP files ....
        
        
        // load some DOAD files ...
        
        
        // query some stuff

    
    }

    // DEMO data
    String path2DOAPFolder = null;
    String path2DOADFolder = null;
    
    // DEMO query
    String queryFolder = null;
    
    static boolean runCluster = true;
    
    private static void prepare() {
        System.out.println("#Check the RDF-Store ...");
        
        if( runCluster ) 
            System.out.println("#Start a Humulus cluster now ...");
            HumulusCluster.main(null);
        
        
    }
    
}
