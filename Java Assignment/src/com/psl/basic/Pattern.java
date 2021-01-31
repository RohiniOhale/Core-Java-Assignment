package com.psl.basic;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=4;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(j+" ");
	}
	System.out.println();
}
	
	for(int i=3;i>=1;i--)
	{
		for(int j=1;j<i;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println(i);
	}
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter a string :");
	String str=obj.next();
	char strarr[]=str.toCharArray();
	
	for(int i=0;i<str.length();i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print(strarr[j]+" ");
		}
		System.out.println();
	}
	
	
	}
}
