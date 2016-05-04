import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapTest {

	public static void main(String[] args) {

		// a simple hashMap declaration with default size and load factor
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		// hashMap with multiple values with default size and load factor
        HashMap<String, ArrayList<String>> multiMap = new HashMap<String, ArrayList<String>>();
 
        // Put elements to the hashMap
        hashMap.put("USA", new Integer(1));
        hashMap.put("UK", new Integer(2));
        hashMap.put("China",new Integer(3));

        // take a value of a specific key
        System.out.println("Simple HashMap: Key 'UK' has value = " + hashMap.get("UK"));
        
        // see if a specific value or key is into the hashMap
        System.out.println("Simple HashMap containes value '1' - " + hashMap.containsValue(1));
        System.out.println("Simple HashMap containes key 'Greece' - " + hashMap.containsKey("Greece"));
        
        // create an arrayList to store values
        ArrayList<String> listOne = new ArrayList<String>();
        listOne.add("Blue");
        listOne.add("Black");
        listOne.add("Brown");
 
        // create list two and store values
        ArrayList<String> listTwo = new ArrayList<String>();
        listTwo.add("Pink");
        listTwo.add("Purple");
        
        // put values into map
        multiMap.put("B color", listOne);
        multiMap.put("P color", listTwo);
 
        // Get a set of the entries
        Set<Entry<String, ArrayList<String>>> setMap = multiMap.entrySet();
        // Get an iterator
        Iterator<Entry<String,  ArrayList<String>>> iteratorMap = setMap.iterator();
        
        System.out.println("\nHashMap with Multiple Values");
        // display all the elements
        while(iteratorMap.hasNext()) {
        	Map.Entry<String, ArrayList<String>> entry = 
        			(Map.Entry<String, ArrayList<String>>) iteratorMap.next();
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key = '" + key + "' has values: " + values);
        }
        
	}

}
