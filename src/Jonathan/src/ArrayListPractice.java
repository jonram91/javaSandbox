import java.util.ArrayList;

public class ArrayListPractice {
	
	public static void main (String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		//Adding
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		
		//Getting values
		System.out.println(numbers.get(0));
		
		//Iteration through for loops
		System.out.println("\nIteration#1: ");
		for (int i = 0 ; i < numbers.size(); i++) {
			
			System.out.println(numbers.get(i));
		}
		
		System.out.println("\nIteration #2: ");
		for(Integer value: numbers) {
			System.out.println(value);
			
		}
		
		//Removing items
		
		for (int i = (numbers.size() - 1); i > -1; i-- ) {
			
			numbers.remove(i);
		}
		
		System.out.println("\nIteration #3: ");
		for(Integer value: numbers) {
			System.out.println(value);
			
		}
		
		
	}

}
