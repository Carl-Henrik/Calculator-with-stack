package com.example.main;

public class nod {
	
	
	float element;
	nod next;
	nod prev;
	
	
	// Konstruktor
	public nod(float e, nod p, nod n){
		// list list = new list();
		element = e;
		next = n;
		prev = p;
	}

	
	// Get/Set
	public float getElement(){return element;}
	public void setElement(float e){element = e;}
	
	public nod getNext(){return next;}
	public void setNext(nod n){next = n;}
		
	public nod getPrev(){return prev;}
	public void setPrev(nod p){prev = p;}
	
	
	
	
	
}
