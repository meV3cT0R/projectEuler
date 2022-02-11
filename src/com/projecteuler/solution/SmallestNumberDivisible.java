package com.projecteuler.solution;

/*
 * 2520 is the smallest number that can be divided by 
 * each of the numbers
 *  from 1 to 10 without any remainder.

	What is the smallest positive number that 
	is evenly divisible by all of the numbers from 1 to 20?
 * 
 * 
 * 
 */
public class SmallestNumberDivisible {
	public static void main(String[] args) {
		int counter = 1;
		boolean isNotSatisfied = true;
		int requiredValue = 0;
		while(isNotSatisfied) {
			for(int i =1;i<=20;i++) {
				
				if(counter % i != 0) { 
					isNotSatisfied =true;
					break;
				}
				
				isNotSatisfied = false;
			}
			
			requiredValue = counter;
			counter++;
		}
		System.out.println(requiredValue + "  is required Value");
	}
}






