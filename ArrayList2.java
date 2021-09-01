package ArrayListBasic;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
	public static void main(String[] args) {
		System.out.println("---Array List:2 ---");
		ArrayList<Integer> num = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i <= 10; i++) {
			num.add(i);
		}
//		for(int x : num)
//		{
//			System.out.println(x);
//		}
		//clear method
//		num.clear();
		System.out.println("After Clear");
		
		//Empty List
		boolean check =	num.isEmpty();
		System.out.println("Arraylist empty :"+ check);
		//Contains method
		boolean con = num.contains(78);
		System.out.println("Is Contains: "+ con);
		
		//IndexOf
		System.out.println("Index of the value " + num.indexOf(10));
		
		// set , get method
		System.out.println("Set of the array "+ num.set(5, 54));
		for(int x : num)
		{
			System.out.println(x);
		}
		
		// get method
		
		
		System.out.println("Get the value of index "+ num.get(5));
		

		ArrayList<Integer> number = new ArrayList<>();
		ArrayList<Integer> number1 = new ArrayList<>();
		ArrayList<Integer> number2 = new ArrayList<>();
		number.add(10);
		number.add(20);
		number.add(30);
		System.out.println(number);
		
		number1.add(11);
		number1.add(22);
		number1.add(33);
		System.out.println(number1);
		
		//AddAll
		
		number2.addAll(number1);
		System.out.println(number2);
		
		// Equals
		System.out.println("Is it equal: "+ number1.equals(number));
		
		//
		
		
		
	}
}
