package javaconcepts2;

public class RegularExp {

	public static void main(String[] args) {

		String str = "M#$%#$%@#$@#$y name#$#$#%#$%#@$ is shivam##@$#$%^$&$^#";
		System.out.println(str.replaceAll("[^a-z A-Z 0-9]", ""));

	}

}
