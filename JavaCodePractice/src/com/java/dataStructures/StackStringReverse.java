package com.java.dataStructures;

public class StackStringReverse {


	private int maxSize=10;
	private char stackArray[] = new char[maxSize];
	private int top;
	int counter =0;
	
public StackStringReverse(int size)
{
	this.maxSize= size;
	this.stackArray = new char[maxSize];
	this.top = -1;
}

public void push(char i)
{ 
	
    if(isFull())
    {
    	System.out.println("Stack is full");
    }
    else
    {
	top++;
	stackArray[top]=i;
    }
    
}	 

public int pop()
{
	if(isEmpty())
	{
		System.out.println("stack is empty");
		return '0';
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
