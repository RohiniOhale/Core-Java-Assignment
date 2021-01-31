package com.psl.basic;

import java.util.Scanner;

public class StringBasic {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter string :");
	String str=obj.nextLine();
	System.out.println(str);
	int vowel_count=0,spaces_count=0;
	char arr[]=str.toLowerCase().toCharArray();
	for(int i=0;i<str.length();i++)
	{
		
		if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u')
		{
			vowel_count+=1;
		}
		if(arr[i]==' ')
		{
			spaces_count+=1;
		}
				
	}
	System.out.println("No of characters : "+str.length());
	System.out.println("No of vowels : "+vowel_count);
	System.out.println("No of spaces: "+spaces_count);
	
	String token[]=str.split("\\s"); 
	for(String w: token)
	{
		System.out.println(w);
	}
}

}
