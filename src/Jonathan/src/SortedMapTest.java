import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapTest {
	
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		testMap(treeMap);		
	}
	
	public static void testMap (Map<Integer, String> map) {
		
		map.put(9, "Fox");
		map.put(4, "Cat");
		map.put(8, "Dog");
		map.put(1, "Giraffe");
		map.put(0, "Swan");
		map.put(15, "Bear");
		map.put(6, "Snake");
		
		for (Integer key : map.keySet()) {
			String value = map.get(key);
			
			System.out.println(key + ": " + value);
			
		}
	}

}
