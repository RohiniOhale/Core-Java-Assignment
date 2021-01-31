package com.psl.training.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class GenericPrint {
	public <T> void print(T element) {
	System.out.println(element.getClass().getName()+"="+element);	
	}
	public static void main(String[] args) {
		
		List<String> lst=new ArrayList<String>();
		lst.add("Chinu");
		lst.add("Radha");
		
		GenericPrint gp=new GenericPrint();
		gp.print(lst);
		
		HashMap<String,String> hm=new HashMap<String, String>();
		hm.put("Goa","Maharastra");
		gp.print(hm);
	
	}

}
