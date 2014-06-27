package com.cloudera.mccl.activities;

import org.etosha.doa.DOAA;
import org.etosha.doa.DOAC;
import org.etosha.doa.DOAD;

/**
 *
 * @author kamir
 */
public class MRActivity {

    DOAC doac = null;
    DOAA algo = new DOAA();
    DOAD in = new DOAD();
    DOAD out = new DOAD();

    public MRActivity(DOAC doac) {
        this.doac = doac;
    }
    
    public void submit() {
        System.out.println( "> submit this ... " + this.toString() );
    } 

    @Override
    public String toString() {
       return algo.toString() + " " + in.toString() + " " + out.toString();
    }
    
    
} 
    
