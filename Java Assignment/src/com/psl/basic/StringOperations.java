package com.psl.basic;

import java.util.Scanner;


public class StringOperations
{
public static void main(String[] args) {
/*String st=StringOperations.makeReverse("To be or not to be");
System.out.println(st);
int cnt=StringOperations.check("To be or not to be", "to");
System.out.println(cnt);
*/
	Scanner obj=new Scanner(System.in);
	/*String product_name[]=StringOperations.initProductNames();
	for(String i:product_name)
	{
		System.out.println(i);
	}
	System.out.print("Enter the product to search:");
	String key=obj.next();
	boolean status=StringOperations.isPresent(product_name, key);
	if(status)
	System.out.println("Product found");
	else
		System.out.println("Product not found");
	*/	
	System.out.println("Enter sentence:");
	String sentence=obj.nextLine();
	System.out.println("Enter word to find :");
	String word=obj.next();
	System.out.println("Enter word to replace :");
	String replace=obj.next();
	StringOperations.findreplace(sentence, word, replace);
		
}
static void findreplace(String sentence,String find,String replace)
{
	String replacedstr=sentence.replace(find, replace);
	System.out.println(replacedstr);
}
static int check(String sentence,String word){
	int count=0;
	String token[]=sentence.split("\\s");
	for(String w:token)
	{	
		boolean st=w.equals(word);
		//System.out.println(st);
		if(st)
			count+=1;
	}
	return count;
}
static boolean isPresent(String[] productNames, String keyword)
{
	boolean status=false;
	for(String i:productNames)
	{
		status=i.contains(keyword);
		if(status)
			break;
	}
	//System.out.print(status);
	return status;
}
static String[] initProductNames()
{
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter no of products :");
	int cnt=obj.nextInt();
	String product_name[]=new String[cnt];
	for(int i=0;i<cnt;i++)
	{
		System.out.print("Enter product name of product "+(i+1)+" :");	
		product_name[i]=obj.next();
		
	
	}
	return product_name;
}
static String  makeReverse(String str)
{
	String token[]=str.split("\\s");
	String revstr="";
	StringBuilder sb1=new StringBuilder();
	for(String w:token)
	{
		StringBuilder sb=new StringBuilder(w);
		sb1.append(sb.reverse());
		sb1.append(" ");
		
	}
	revstr=sb1.toString();
	return revstr;
}

}

