import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {
	
	public static void main(String[] args) {
		
		//Set<String> set1 = new HashSet<String>();
		
		//LinkedHashSet remembers order
		//Set<String> set1 = new LinkedHashSet<String>();
		
		//TreeSet Sorts in Natural Order
		Set <String> set1 = new TreeSet<String>();
		
		if (set1.isEmpty()) {
			System.out.println("Set is empty");
			
		}
		
		//HashSet does not retain order
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");
		
		
		//Adding duplicate items does nothing
		
		set1.add("mouse");
		
		System.out.println(set1);
		
		//// Iteration\\\\\\\
		
		for (String element : set1) {
			System.out.println(element);
			
		}
		
		/////// Does set contain a given item? \\\\\\
		
		if (set1.contains("aardvark")) {
			
			System.out.println("Contains aardvark");
		}
		
		if (set1.contains("cat")) {
			System.out.println("Contains cat");
			
		}
		
		if (set1.isEmpty()) {
			System.out.println("Set is empty");
			
		}
		
		///Intersection\\\\
		
		
		Set<String> set2 = new TreeSet<String>();

		// HashSet does not retain order
		set2.add("dog");
		set2.add("cat");
		set2.add("giraffe");
		set2.add("monkey");
		set2.add("ant");
		
		Set<String> intersection = new HashSet<String>(set1);
		
		System.out.println(set1);
		System.out.println(intersection);
		
		intersection.retainAll(set2);
		
		System.out.println(intersection);
		
		/////// Difference ///////////
		
		Set<String> difference = new HashSet<String>(set2);
		
		difference.removeAll(set1);
		
		System.out.println(difference);
		
		
		
		
	}

}
