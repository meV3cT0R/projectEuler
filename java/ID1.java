/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class ID1 {
	public static void main(String[] args) {
		int[] values = {};
		int counter = 1;
		int sum = 0;
		while(counter < 1000) {
			if(counter % 3 == 0 || counter % 5 ==0) {
				values = pushInArray(values,counter);
				sum += counter;
			}
			counter++;
		}

		for(int i=0; i< values.length; i++){
			System.out.printf("%2d%s",values[i],i== values.length-1 ? "\n":",");
		}

		System.out.printf("Total sum : %s%n",sum);
	}

	public static int[] pushInArray(int[] array,int value) {
		int[] newArray = new int[array.length+1];
		for(int i =0;i <array.length;i++) {
			newArray[i] = array[i];
		}
		newArray[array.length]= value;
		return newArray;
	}
}