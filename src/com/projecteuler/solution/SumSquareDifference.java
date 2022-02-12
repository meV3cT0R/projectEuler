package com.projecteuler.solution;

public class SumSquareDifference {
	public static void main(String[] args) {
		double sumOfSquares = 0;
		double squareOfSum = 0;
		int counter = 0;
		while(counter <= 100) {
			sumOfSquares += Math.pow(counter, 2);
			squareOfSum += counter;
			counter++;
		}
		System.out.println(Math.pow(squareOfSum,2)-sumOfSquares);
	}
}
