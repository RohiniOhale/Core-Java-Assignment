package com.psl.training.collection.cityhashmap;


import java.util.HashMap;
import java.util.Map;




public class CityStateMap {
	
/*	Write a class CityStateMap by using child class of java.util.Collection. 
 * This mapping class will allow the user to add new city-state pair in to it.
 *  User can get the state of the city by calling get method on this class.
 *   Duplicate city entries are not allowed, 
 *   in such case previous mapping should be replaced with new one.
 *    Assume that there is a text file having city state values (in string). 
 *    Read this file and store these values using CityStateMap class.
 *     Let user do the following operations with this class:

		1.	Get all cities
		2.	Get All states
		3.	Get cities for a state
		4.	Add new city state pair
		5.	Delete all the cities for a given state
*/
	public void printHAshMap(HashMap<String,String> h) {
		for (HashMap.Entry<String, String> e : h.entrySet()) 
            System.out.println("Key: " + e.getKey() 
                               + " Value: " + e.getValue());
		
	}
public void addCityState(HashMap<String,String> h,String city,String st){

h.put(city,st);
}
public void getCities(HashMap<String,String> hm) {
System.out.println("Cities are"+hm.keySet());	
}
public void getStates(HashMap<String,String> hm) {
System.out.println("States are "+hm.values());	
}
public void getStateForCity(HashMap<String,String> hm,String st) {
	for (Map.Entry<String, String> i: hm.entrySet()) {
		if(i.getValue()==st){
			System.out.println("City "+i.getKey()+" in State "+st);}
	}
//

}
public void deleteCities(HashMap<String,String> hm,String st) {
	try{
	for (Map.Entry<String, String> i: hm.entrySet()) {
		System.out.println("i.getValue()="+i.getValue()+"\nState="+st);
		if(i.getValue()==st){
			//System.out.println(i.getKey()+"deleted successfully");
			String val=(String)hm.remove(i.getKey());
			System.out.println(val+" deleted");
		}
		}
	}
	catch(Exception e){
	System.out.println(e);}
}


}
