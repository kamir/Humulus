/**
 *  This Tool will demo how some DOAx files are adds to a scalable triple store
 *  in order to query those via CumulusRDF web application. 
 * 
 *  The cluster connection is build via the "multi cluster client layer" module (MCCL).
 *
 **/

package app;

/**
 *
 * @author kamir
 */
public class HumulusPOC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println( ">>> There is still a lot todo ... ;-)");
    
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

    String path2DOAP = null;
    String path2DOAD = null;
    String query = null;
    
    private static void prepare() {
        
    }
    
}
