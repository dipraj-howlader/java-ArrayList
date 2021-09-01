package ArrayListBasic;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrays {
	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>();
		number.add(10);
		number.add(-85);
		number.add(21);
		number.add(-2);
		number.add(6);
		for(int x : number) {
			System.out.println(x);
		}
		
		//Sorting
		
		System.out.println("assending:");
		
		Collections.sort(number);
		
		System.out.println(number);
		System.out.println("Dessending:");
		
		Collections.sort(number, Collections.reverseOrder());
		System.out.println();
		
	}
}
