package javaconcepts2;

import java.util.HashMap;

public class JavaGenerics {

	public static void main(String[] args) {
		
		
		

	    HashMap<String, Integer> map = new HashMap<>();
	    
	    map.put("hello", 1);
	    map.put("hello", 2);
	    
	    System.out.println(map.keySet());
	    //System.out.println(map.size());
	    System.out.println(map.get("hello"));
		
	}

}



