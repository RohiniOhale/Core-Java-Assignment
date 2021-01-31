package com.psl.training.collection.movies;

import java.util.Comparator;

public class SortByDirector implements Comparator<Movies> {

	@Override
	public int compare(Movies o1, Movies o2) {
		// TODO Auto-generated method stub
		return o1.getDirector().compareTo(o2.getDirector());
	}

}
