package programToInterface;

import java.util.ArrayList;
import java.util.List;

/*
 *Programming to interface allows you  
 * to be confident that all classes instantiated
 * will behave in a certain way.
 * In this case, this menu has food items
 * that are all 'edible.'
 * 
 * */

public class ProgramToInterface {
	
	public static void main(String [] args) {
		List<Edible> menu = new ArrayList<Edible>();
		
		menu.add(new Pizza());
		menu.add(new Burger());
		menu.add(new Salad());
		
		//Iterate through each item in the ArrayList
		//You can be confident that each of these items 
		//implement the Edible interface
		//and all implement the eat method
		
		
		for (Edible food : menu) {
			food.eat();
			
		}
		
	}

}

class Pizza implements Edible{
	
	public void eat() {
		System.out.println("I am eating pizza");
		
	}
}

class Burger implements Edible {
	public void eat() {
		System.out.println("I am eating a burger.");
		
	}
	
}

class Salad implements Edible {
	
	public void eat() {
		System.out.println("I am eating a salad.");
		
	}
	
}