package com.psl.training.collection.cityhashmap;

import java.util.HashMap;


public class CityStateTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hm=new HashMap<String, String>();
		CityStateMap csm=new CityStateMap();
		csm.addCityState(hm,"Pune", "Maharastra");
		csm.addCityState(hm,"Nagpur", "Maharastra");
		csm.addCityState(hm,"Amravati", "Maharastra");
		csm.addCityState(hm,"Jhansi", "Madhya Pradesh");
		csm.addCityState(hm,"Goa", "Goa");
		csm.addCityState(hm,"Tirunthapuram", "Kerala");
		csm.printHAshMap(hm);
		csm.getCities(hm);
		csm.getStates(hm);
		csm.getStateForCity(hm,"Maharastra");
		csm.deleteCities(hm,"Goa");
		csm.printHAshMap(hm);
	}

}
