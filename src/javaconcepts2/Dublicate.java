package javaconcepts2;

import java.util.HashMap;
import java.util.Set;

public class Dublicate {

	public static void main(String[] args) {

		String str1 = "This is java java program for for for testing in java";

		String str[] = str1.split(" ");

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (String val : str) {
			if (map.containsKey(val)) {
				map.put(val, map.get(val)+1);
			} else {
				map.put(val, 1);
			}

		}
		
		
		Set<String> list = map.keySet();
		
		for(String a:list)
		{
			System.out.print(a);
			System.out.println(" occured >> " + map.get(a) + " times");
		}

	}

}
