package com.psl.training.collection.movies;

import java.util.Comparator;



public class SortByLanguage implements Comparator<Movies>{

	@Override
	public int compare(Movies o1, Movies o2) {
		// TODO Auto-generated method stub'
		int res=o1.getLanguage().compareTo(o2.getLanguage());
		return res;
	}

	
	
	

}
