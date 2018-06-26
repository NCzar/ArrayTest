/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intercontinental;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author nikhilv85
 */
public class PairsOfIntegers {
    
    List<String> numberGroup = new ArrayList<String>();
    HashSet<Integer> hs = new HashSet<Integer>();
    HashSet<Integer> Pairs = new HashSet<Integer>();
    List<Integer> numberArray = new ArrayList<Integer>();
    
    public PairsOfIntegers(Integer[] input){
       PairsOfNumbers(input, 7);
        }
    
  public List<String> PairsOfNumbers(Integer[] input, int sum){
    
    numberArray = Arrays.asList(input);
    
    Iterator<Integer> it = numberArray.iterator();
             
        while(it.hasNext()){   
        int value = it.next();
        int complement = sum - value;
              
        if(numberArray.contains(complement)){                
            
            hs.clear();
            hs.add(value);
            hs.add(complement);
            boolean x = Pairs.add(value);
            boolean y = Pairs.add(complement);
           
            if(x==true && y==true ){
                numberGroup.add(hs.toString());             
                hs.clear();            
            }        
        }      
    }
    Pairs.clear();
    return numberGroup;
}
}
