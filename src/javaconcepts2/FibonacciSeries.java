package javaconcepts2;

public class FibonacciSeries {

	public static void main(String[] args) {

		fibonacciSeries(5);

	}

	public static void fibonacciSeries(int count) {
		int a = 1;
		int b = 1;
		int c;

		System.out.print(a + " ");
		System.out.print(b + " ");

		for (int i = 0; i < count; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;

		}

	}
}
