package com.example.MovieRating;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortHashMapByValue {
	
	public static void main(String args[]) {
		
		 
		  HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		  
		  
		  hMap.put("Database", 91); 
		  hMap.put("Java", 95);
		  hMap.put("Operating System", 79);
		  hMap.put("Networking", 80); 
		  Map<String, Integer> hm1 = sortByValue(hMap);
		  
		  // print the sorted hashmap 
		  for (Map.Entry<String, Integer> en :
		  hm1.entrySet()) { 
			  System.out.println("Key = " + en.getKey() + ", Value = " +
		  en.getValue()); }
	}

	
	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<String, Integer> > list = 
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
            public int compare(Map.Entry<String, Integer> o1,  
                               Map.Entry<String, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
	
}
