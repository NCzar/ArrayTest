/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intercontinental;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nikhilv85
 */
public class PairsOfIntegers {
    
    List<String> numberGroup = new ArrayList<String>();
    HashSet<Integer> hs = new HashSet<Integer>();
    HashSet<Integer> Pairs = new HashSet<Integer>();
    
    public PairsOfIntegers(int[] input){
       PairsOfNumbers(input, 7);
        }
    
  public List<String> PairsOfNumbers(int[] input, int sum){
    Map<Integer, Integer> numberMap = new HashMap<>();   

    for(int i=0; i<input.length; i++){
        int value = input[i];
        int complement = sum - input[i];

        if(numberMap.containsKey(complement)){                
            int index = numberMap.get(complement) - 1;
           
            hs.add(value);
            hs.add(complement);
            boolean x = Pairs.add(value);
            boolean y = Pairs.add(complement);
           
            if(x==true && y==true && hs.size()<3){
                numberGroup.add(hs.toString());
                hs.clear();
            }
            if(index == 0){
                numberMap.remove(complement);
            }else{
                numberMap.put(complement, index);
               
            }
        }else{
            if(numberMap.containsKey(value)){         
                numberMap.put(value, numberMap.get(value) + 1);             
            }else{
                numberMap.put(value, 1);
            }
        }
    }
    return numberGroup;
}
}
