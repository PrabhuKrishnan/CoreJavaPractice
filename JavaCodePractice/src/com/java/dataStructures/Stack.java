package com.java.dataStructures;

public class Stack {

	private int maxSize=10;
	private int stackArray[] = new int[maxSize];
	private int top;
	int counter =0;
	
public Stack(int size)
{
	this.maxSize= size;
	this.stackArray = new int[maxSize];
	this.top = -1;
}

public void push(int ele)
{ 
	
    if(isFull())
    {
    	System.out.println("Stack is full");
    }
    else
    {
	top++;
	stackArray[top]=ele;
    }
    
}	 

public int pop()
{
	if(isEmpty())
	{
		System.out.println("stack is empty");
		return -1;
	}
	else
	{
    int currentStackTop = top;
    top--;
    return  stackArray[currentStackTop];
	}
}

public Boolean isEmpty()
{
	return (top == -1);
	
}

public Boolean isFull()
{
	return (maxSize-1 == top);
}

}














