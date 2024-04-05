package week1.homeassignment;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] number = {1,4,3,2,8,6,7}; 
		Arrays.sort(number);
		
		//1,2,3,4,6,7,8
		
		for (int i = 0; i < number.length-1; i++) {
			
			if(number[i]+1 != number[i+1])
			{
				System.out.println("The missing number is " +(number[i]+1));
			}
			
		}
	}

}
