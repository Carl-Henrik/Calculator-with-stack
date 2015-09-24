package com.example.main;

public class list {
	
	static int size;
	static nod header;
	nod trailer;
	
	
	// Konstruktor, skapar ny lista samt sentinels
	public list(){
		size = 0;
		header = new nod(0, null, null);
		trailer = new nod(0, header, null);
		header.setNext(trailer);
	}

	public int returnSize(){return size;}
	public boolean empty(){return (size == 0);} //kontrolerar om listan är tom
	
	
	
	public nod getFirst() throws IllegalStateException{
		if (empty()) throw new IllegalStateException("Listan är tom!");
		return header.getNext();
	}
	
	public nod getLast() throws IllegalStateException{
		if (empty()) throw new IllegalStateException("Listan är tom!");
		return trailer.getPrev();
	}

	
	public nod getNext(nod temp) throws IllegalArgumentException {
		if (temp==trailer) throw new IllegalArgumentException("Det här är den sista noden i listan!");
		return temp.getNext();
	}
	
	public nod getPrev(nod temp) throws IllegalArgumentException {
		if (temp==header) throw new IllegalArgumentException("Det här är den första noden i listan!");
		return temp.getPrev();
	}
	
	
	// Lägg till en ny nod före given nod
	public void addBefore(nod exNod, nod newNod) throws IllegalArgumentException {
		nod temp = getPrev(exNod);
		newNod.setNext(exNod);
		newNod.setPrev(temp);
		temp.setNext(newNod);
		exNod.setPrev(newNod);
		size++;
	}
	
	// Lägg till en ny nod efter given nod
	public static void addAfter(nod exNod, nod newNod) throws IllegalArgumentException {
		nod temp = exNod.getNext();
		newNod.setNext(temp);
		newNod.setPrev(exNod);
		exNod.setNext(newNod);
		temp.setPrev(newNod);
		size++;
	}
	
	
	// Metoder för att lägga till nya noder först och sist i listan
	public static void addFirst(nod temp){addAfter(header, temp);}
	public void addLast(nod temp){addBefore(trailer, temp);}
	
	
	// Tar bort den första noden i listan och returnerar den
	public nod removeFirst() throws IllegalStateException {
		if (empty()) throw new IllegalStateException("Listan är tom!");
		
		nod first = header.getNext();
		nod newFirst = first.getNext();
		header.setNext(newFirst);
		newFirst.setPrev(header);
		first.setNext(null);
		first.setPrev(null);
		size--;
		
		return first;
	}
	
	// Tar bort den sista noden i listan och returnerar den
	public nod removeLast() throws IllegalStateException {
		if (empty()) throw new IllegalStateException("Listan är tom!");
		
		nod last = trailer.getPrev();
		nod newLast = last.getPrev();
		trailer.setPrev(newLast);
		newLast.setNext(trailer);
		last.setNext(null);
		last.setPrev(null);
		size--;
		
		return last;
	}
	
	
	
	// ta bort listan 

	public void delList(){
		
		while (size > 0){
			removeFirst();
		}
		

			
	}
	
	// kontrollerar om angivet element finns i listan.
	public boolean elLookUp(int elLook) throws IllegalStateException {
		if (empty()) throw new IllegalStateException("Listan är tom!");
		
		boolean elFound = false;
		nod current = header;
		
		while (current.getNext() != null){
			if (current.getElement() == elLook){
				elFound = true;				
			}
			current = current.getNext();
		}
		
		return elFound;
	}
	
	

		
	
		
	}
	
