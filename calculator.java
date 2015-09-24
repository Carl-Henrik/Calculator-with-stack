package com.example.main;

import java.util.Scanner;

public class calculator {

stack myStack = new stack();
static Scanner in = new Scanner(System.in);

float temp1;
float temp2;
String input;
Boolean exit = false;
int i;

public calculator(){
	
	while (exit == false){
		
		System.out.println("kalk>");
		input = in.nextLine();
		
		if  (input.equals("Q")){exit = true;}
		else {
			
			String[] parts = input.split(" ");
			
			 for(int i = 0; i < parts.length; i++){
				 if (parts[i].equals("+") || parts[i].equals("-") || parts[i].equals("*") || parts[i].equals("/")){calculate(parts[i]);}
				 else { 
					 					 
					 myStack.push(Float.parseFloat(parts[i]));
				 }
				 
				 
			 }
			 
			 System.out.println(myStack.peek());
		

			
		}
	}
	
		
}





public void calculate(String calc){
	
	float temp1 = myStack.pop();
	float temp2 = myStack.pop();
	
	if (calc.equals("+")) myStack.push(temp2 + temp1);
	if (calc.equals("-")) myStack.push(temp2 - temp1);
	if (calc.equals("/")) myStack.push(temp2 / temp1);
	if (calc.equals("*")) myStack.push(temp2 * temp1);
	
	
}

}
