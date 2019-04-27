//https://www.geeksforgeeks.org/java-util-hashmap-in-java/


import java.util.HashMap; 
import java.util.Map; 

public class GFG 
{ 
	public static void main(String[] args) 
	{ 
	
		HashMap<String, Integer> map = new HashMap<>();  
		map.put("vishal", 10); 
		map.put("sachin", 30); 
		map.put("vaibhav", 20); 
		print(map); 
    
	 	//update value given key
	    	map.put(key, map.get(key) + 1);

	    	//If you're only interested in the keys, you can iterate through the keySet() of the map:
	    	Map<String, Object> map = ...;
		for (String key : map.keySet()) {
		// ...
	    	}

	    	If you only need the values, use values():
	    	for (Object value : map.values()) {
			// ...
	    	}	


	    	Finally, if you want both the key and value, use entrySet():
	    	for (Map.Entry<String, Object> entry : map.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			// ...
	    	}
		
	} 
	
	public static void print(Map<String, Integer> map) 
	{ 
		if (map.isEmpty()) 
		{ 
			System.out.println("map is empty"); 
		} 
		
		else
		{ 
			System.out.println(map); 
		} 
	} 
} 
