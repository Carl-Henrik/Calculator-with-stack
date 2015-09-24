package com.example.main;

public class stack {
	list myStack = new list();
	
	
	public void push(float element){
		myStack.addFirst(new nod(element, null, null));
	}
	
	public float pop(){
		nod temp = myStack.removeFirst();
		return temp.getElement();
	}
	
	public float peek(){
		nod temp = myStack.getFirst();
		return temp.getElement();
	}
	
}
