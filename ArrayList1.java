package ArrayListBasic;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
	public static void main(String[] args) {
		System.out.println("Hello Java people, Welcome to ArrayList :");
		ArrayList<Integer> num = new ArrayList<>();
		System.out.println(num.size());
		
		//Adding Elements
		
		num.add(10);
		num.add(15);
		num.add(19);
		num.add(150);

		System.out.println(num.size());
		//foreach
		for(int x: num) {
			System.out.println(x);
		}
		
		//Iterator
		Iterator itr = num.iterator();
		
		while(itr.hasNext()) 
		{
			System.out.println(" "+itr.next());
		}
		//removing elements
		num.remove(2);
		for(int x: num) {
			System.out.println(x);
		}
		//remove all
		System.out.println("After removing all");
		num.removeAll(num);
		
		
	}
}
