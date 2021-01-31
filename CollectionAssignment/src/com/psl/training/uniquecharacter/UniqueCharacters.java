package com.psl.training.uniquecharacter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class UniqueCharacters {
/*	
	4.	Write a method that takes a string and returns the number of unique characters
	 in the string. 
	Pass a string with the same character sequence several times to the method.
	 The counting operation is time consuming so the method should cache the results, 
	 so that when the method is given a string previously encountered, 
	 it will simply retrieve the stored result.
	Use collections and maps where appropriate
*/
	 static Map hm = new HashMap();
	 public static int countUniqueCharacters(String str) {
	        Object cachedResult = hm.get(str);
	        if (cachedResult != null)
	            return ((Integer) cachedResult).intValue();

	        // Result was not in the cache, calculate it.
	        int length = str.length();
	        Set occurred = new TreeSet();
	        Set duplicates = new TreeSet();

	        // Identify occurrences and duplicates for each character in string:
	        for (int i=0; i<length;i++) {
	            Character character = new Character(str.charAt(i));
	            if (duplicates.contains(character)) continue;
	            boolean newOccurrence = occurred.add(character);
	            if (!newOccurrence) duplicates.add(character);
	        }


	        occurred.removeAll(duplicates);
	        int result = occurred.size();


	        hm.put(str, new Integer(result));
	        return result;
	    }

}
