/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kevinjerke
 */
public class Demo1 {
    public static void main(String[] args) {
       // HashMap, HasTable, TreeMap, LinkedHashMap
      
//       Map myMap = new HashMap();
//       myMap.put("January",1);
//       myMap.put("Feburary", 2);
//       myMap.put("March", 3);
//       
//       
//       Integer m  = (Integer) myMap.get("Feburary");
//        System.out.println(m);
       
       
       Map myMap = new HashMap();
       myMap.put("small", new Integer(5));
       myMap.put("medium", new Integer(100));
       myMap.put("large", new Integer(10000));
       
       
       Integer i = (Integer) myMap.get("medium");
        System.out.println(i);
       
        
    }
}
