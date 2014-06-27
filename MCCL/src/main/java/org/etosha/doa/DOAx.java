package org.etosha.doa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kamir
 */
public class DOAx {

    // from this URI we 
    URI theDOAxURI = null;

    void check() {
        try {
            // load and parse and extract all attributes ...
            URL url = theDOAxURI.toURL();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();
  
        } catch (MalformedURLException ex) {
            Logger.getLogger(DOAx.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DOAx.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
