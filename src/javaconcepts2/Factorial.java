package javaconcepts2;

public class Factorial {

	public static void main(String[] args) {

		factorial(5);
	}

	public static void factorial(int n) {
		int fact = 1;
		for (int i = 1; i < n; i++) {

			fact = fact * i;

		}
		System.out.println(fact);

	}

}
