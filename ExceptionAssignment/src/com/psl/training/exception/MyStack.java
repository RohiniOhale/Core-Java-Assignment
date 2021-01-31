package com.psl.training.exception;



public class MyStack 
{
	private String array[];
	private int top;
	private int capacity;
	
	
	public void initializeStack(int size) {
		array=new String[size];
		capacity=size;
		top=-1;
	}
	
	public void push(String element)  {
	try{
		array[++top]=element;
	}
	catch(Exception e)
	{
		if(top==capacity){
		System.out.print("Stack overflow");
		System.out.println(e.getMessage());
	}
	}
	}
	public void pop() {
		try
		{
			System.out.println(array[top--]+" popped out");

		}
		catch(Exception e)
		{
			
			System.out.println("Stack Underflow");
		}
	}
	
	public String peek() {
		return array[top];
	}
	
	public void printStack() {
		for(int i=0;i<=top;i++)
		{
			System.out.println(array[i]);
		}
	}
	
	public String[] getArray() {
		return array;
	}
	
	
	
}
