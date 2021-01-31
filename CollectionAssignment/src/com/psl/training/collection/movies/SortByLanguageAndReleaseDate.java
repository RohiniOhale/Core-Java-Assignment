package com.psl.training.collection.movies;


import java.util.Comparator;

public class SortByLanguageAndReleaseDate  implements Comparator<Movies>  {

	@Override
	public int compare(Movies o1, Movies o2) {
		// TODO Auto-generated method stub
		int res=o1.getLanguage().compareTo(o2.getLanguage());
		if(res==0)
			return o1.getReleaseDate().compareTo(o2.getReleaseDate());
		return res;
	}

}
