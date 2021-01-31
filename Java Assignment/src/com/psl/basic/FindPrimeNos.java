package com.psl.basic;

import java.util.Scanner;

public class FindPrimeNos {
	public static void main(String[] args) {
		int start,end;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the starting no :");
		start=obj.nextInt();
		System.out.print("Enter the ending no :");
		end=obj.nextInt();
		FindPrimeNos fp=new FindPrimeNos();
		int arr[]=fp.findPrime(start,end);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
				continue;
			else
				System.out.print(arr[i]+" ");
			
		}
	}
int[] findPrime(int start,int end)
{
	int arr[]=new int[end-start+1];
	int count=0;
	for(int i=start;i<=end;i++)
	{
		boolean st=Operations.isPrimeNumber(i);
		if(st)
		{
			arr[count]=i;
			//System.out.print(i+" ");
			count+=1;
		}
		
	}
	return arr;
}
}
