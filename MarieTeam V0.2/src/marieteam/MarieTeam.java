/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marieteam;

import com.itextpdf.text.DocumentException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author sio
 */
public class MarieTeam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, DocumentException, com.itextpdf.text.DocumentException {
        Parametre Test = new Parametre();
       Test.AfficherCatego();
       
    }
    
}