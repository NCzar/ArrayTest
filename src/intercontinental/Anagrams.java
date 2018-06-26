/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intercontinental;

import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.Scanner;
/**
 *
 * @author nikhilv85
 */
public class Anagrams {
    
    String inputBody;
    HashSet<String> hs = new HashSet<String>();
    HashSet<String> fullseths = new HashSet<String>();
    List<String> l = new ArrayList<String>();
    List<String> anagramGroups =  new ArrayList<String>();
          
    public Anagrams(){
              
        Logger.getLogger(Anagrams.class.getName()).log(Level.INFO,"Enter a Pargraph");        
        Scanner sc = new Scanner(System.in);
        inputBody = sc.nextLine();

    }
    
    public Anagrams(String inputBody){
        this.inputBody = inputBody;
    }
    public List<String> outputPairs(){
        
        String[] words = inputBody.split(" ");
        for(int i=0;i<words.length;i++){
            l.add(words[i]);
        }
                 
        Iterator<String> it = l.iterator();
             
        while(it.hasNext()){              
        int j=l.indexOf(it.next());
        boolean wordCompare = false;
        
        for(int k=j+1;k<l.size();k++){
            if(isAnagram(words[j],words[k])==true){
                wordCompare = true;
                if(fullseths.add(words[k])==true){
                    hs.add(words[k]);
                }
                
            }
        }
        if(wordCompare==true){
            if(fullseths.add(words[j])==true){
            hs.add(words[j]);
            }
            wordCompare=false;
            if (hs.isEmpty()==false){
                anagramGroups.add(hs.toString());
            }
            
        }
        
        hs.clear();
        }            
        
        return anagramGroups;
              
    }
    
    public boolean isAnagram(String s1, String s2)
    {
        //Removing white spaces from s1 and s2 and changing case to lower
 
        String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
 
        String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();
 
        //Initially setting status as true
 
        boolean status = true;
 
        if(copyOfs1.length() != copyOfs2.length())
        {
            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
 
            status = false;
        }
        else
        {
            //Converting copyOfs1 to char array
 
            char[] s1ToArray = copyOfs1.toCharArray();
 
            //Checking whether each character of s1ToArray is present in copyOfs2
 
            for (char c : s1ToArray)
            {
                int index = copyOfs2.indexOf(c);
 
                if(index != -1)
                {
                    //If character is present in copyOfs2, removing that char from copyOfs2
 
                    copyOfs2 = copyOfs2.substring(0, index)+copyOfs2.substring(index+1, copyOfs2.length());
                }
                else
                {
                    //If character is not present in copyOfs2, setting status as false and breaking the loop
 
                    status = false;
 
                    break;
                }
            }
              
        }
        //Output
        return status;
        
    }
}
