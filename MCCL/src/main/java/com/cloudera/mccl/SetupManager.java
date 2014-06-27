/*
 *    In order to connect to a Hadoop cluster, one needs the same libraries
 *    the cluster uses internally.
 *    
 *    Dependencies can be fullfilled during compile time by using maven repositories.
 *  
 *    A second option is to have a local directory with all relevant configuration files and
 *    also all libraries, like a client would have. 
 *  
 *    For a MultiClient environment we have to use one individual ClassLoader per Client.
 *    This allows flexible loading during Runtime, e.g. also in a webapp environment.
 * 
 *    To have all relevant files available in the class path of an developement environment
 *    one has to copy the libraries from HDFS to a local clientLIBSDirectory. 
 *   
 *    Exclipse and NetBeans will use those libs during Compile time.
 *
 */

package com.cloudera.mccl;

/**
 *
 * @author kamir
 */
public class SetupManager {
    
    public static void main( String[] args ) {
        
        System.out.println( ">>> copy the jar files to HDFS .... ");
        
        System.out.println( ">>> copy the jar files from HDFS to the local LIBS directory and create a LIB in the IDE .... ");
        
    }
    
}
