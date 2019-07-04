package javaconcepts2;

import java.util.HashMap;
import java.util.Set;

public class DublicateWordInString {

	public static void main(String[] args) {

		String a = "Hi my my name is is is shivam shivam sharma";
		String[] str = a.split(" ");

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (String name : str) {
			if (map.containsKey(name)) {
				map.put(name, map.get(name) + 1);
			} else {
				map.put(name, 1);
			}

		}

		Set<String> list = map.keySet();

		for (String li : list) {
			System.out.print(li + " - occured : ");
			System.out.println(map.get(li) + " times");

		}

	}

}
