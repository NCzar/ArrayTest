/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intercontinental;

import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author nikhilv85
 */
public class Intercontinental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Logger.getLogger(Intercontinental.class.getName()).log(Level.INFO,"Anagrams Group="+new Anagrams("This is a pig to gip repository also called ot").outputPairs());
        int[] x ={1,2,3,4,5,6};
        Logger.getLogger(Intercontinental.class.getName()).log(Level.INFO,"Pairs Group="+new PairsOfIntegers(x).numberGroup);
       
    }
    
}