package com.psl.training.collection.movies;


import java.util.Collections;
import java.util.List;




public class MovieTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Movies m=new Movies();
	List<Movies> list=m.createMovieList();
	m.printList(list);
	Collections.sort(list);
	System.out.println("Sort by Comparable");
	Collections.sort(list,new SortByDirector());
	System.out.println("Sort by Director");
	
	m.printList(list);
	m.sortByLanguage(list);
	m.sortByDuration(list);
	m.SortByLanguageAndReleaseDate(list);
	}

	

}
