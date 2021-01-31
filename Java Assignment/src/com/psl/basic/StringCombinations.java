package com.psl.basic;

import java.util.Scanner;

public class StringCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj=new Scanner(System.in);
System.out.print("Enter String: ");
String str=obj.next();
int len=str.length();
StringCombinations.getCombinations(str,0,len);
	}
	static void  getCombinations(String str,int start,int end)
	{
		
		
		if(start==end-1)
		{
			System.out.println(str);
		}
		else
		{
			for(int i=1;i<end;i++)
			{
				str=swap(str,start,i);
				getCombinations(str,start+1,end);
				
				str=swap(str,start,i);
			}
			}
		}
		
	
	static String swap(String str,int pos1,int pos2)
	{
		char temp;
		char[] array=str.toCharArray();
		temp=array[pos1];
		array[pos1]=array[pos2];
		array[pos2]=temp;
		return String.valueOf(array);
	}
	
}
