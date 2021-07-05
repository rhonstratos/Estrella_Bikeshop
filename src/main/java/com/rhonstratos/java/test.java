package com.rhonstratos.java;
import java.util.*;
public class test {
    public static void main(String arg[]) {  
        //Create an empty Vector  
        Vector<String> vc = new Vector<String>();  
        //Add values in the vector  
            vc.add("Facebook");  
            vc.add("Whatsapp");  
            vc.add("Twitter");  
            vc.add("Instagram");  
            //Create an empty list  
            List<String> list = new ArrayList<String>();  
            //Add values in the List  
            list.add("Facebook");  
            list.add("Whatsapp");  
            System.out.println("Does vector contains all list elements?: "+vc.containsAll(list));  
            list.add("Hindi100");  
            System.out.println("Does vector contains all list elements?: "+vc.containsAll(list));  
          }     
}
