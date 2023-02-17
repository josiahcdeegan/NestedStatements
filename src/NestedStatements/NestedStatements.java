package NestedStatements;

import java.util.Scanner;

public class NestedStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your favorite food?");		
		String food = sc.next();
		
		if("pizza".equals(food)){
			System.out.println("What do you like on your pizza");
			String topping = sc.next();
			
			if("anchovies".equals(topping)){
				System.out.println("Can I call you Stanley Spudowski?");
				String answer = sc.next();
					if("yes".equals(answer)) {
						System.out.println("This is my mew mop.");}
					else {
						System.out.println("Nevermind");}
					}
			else 
				{
				System.out.println("Good for you");
				}}
		
		else if("burgers".equals(food)){
			System.out.println("Mine too");
			}
			
		else
		{
			System.out.println("Good for you");
		}
				
		
		}}
