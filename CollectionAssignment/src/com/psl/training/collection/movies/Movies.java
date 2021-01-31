package com.psl.training.collection.movies;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Movies implements Comparable<Movies> {
	private String name;
	private String language;
	private Date releaseDate;
	private String director;
	private String producer;
	private String duration;
	
	public Movies()
	{
		
	}
	
	public Movies(String name, String language, Date releaseDate,
			String director, String producer, String duration) {
		super();
		this.name = name;
		this.language = language;
		this.releaseDate = releaseDate;
		this.director = director;
		this.producer = producer;
		this.duration = duration;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}



	@Override
	public String toString() {
		return "Movies [name=" + name + ", language=" + language
				+ ", releaseDate=" + releaseDate + ", director=" + director
				+ ", producer=" + producer + ", duration=" + duration + "]";
	}

	public List<Movies> createMovieList()
	{
		ArrayList<Movies> mov=new ArrayList<Movies>();
		mov.add(new Movies("Hera Pheri","Hindi",Date.valueOf("1988-04-19"), "B.P.Singh", "Yash Raj Films","3:00 hrs"));
		mov.add(new Movies("Rustom","Hindi",Date.valueOf("1912-05-20"), "Rajkumar Rao", "Yash Raj Films","2:30 hrs"));
		mov.add(new Movies("Mission Impossible","English",Date.valueOf("1914-05-8"), "Steven", "Pen Films","2:00 hrs"));
		mov.add(new Movies("Tremors","English",Date.valueOf("1912-05-21"), "Rocky", "Disney","2:00 hrs"));
		mov.add(new Movies("Anaconda","Hindi",Date.valueOf("1912-09-8"), "Rajkumar", "Hotstar","1:30 hrs"));
		return mov;
	}
	public void printList(List<Movies> lst) {
		for(Object i:lst)
		{
			System.out.println(i);
		}
	}
	public void sortByLanguage(List<Movies> movieList){
		Collections.sort(movieList, new SortByLanguage());
		System.out.println("Sort by language");
		printList(movieList);
	}
	public void sortByDuration(List<Movies> movieList)
	{
		Collections.sort(movieList,new SortByDuration());
		System.out.println("Sort by Duration");
		printList(movieList);
	}
	public void SortByLanguageAndReleaseDate(List<Movies> movieList){
		Collections.sort(movieList,new SortByLanguageAndReleaseDate());
		System.out.println("Sort by Language and Release Date");
		printList(movieList);
	}

	@Override
	public int compareTo(Movies o) {
		// TODO Auto-generated method stub
		
		return this.getLanguage().compareTo(o.getLanguage());
	}
	
}
