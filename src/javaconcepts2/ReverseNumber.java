package javaconcepts2;

public class ReverseNumber {

	public static void main(String[] args) {

		int a = 12345;
		System.out.println("Integer before reverse : " + a);
		int rev = 0;

		while (!(a == 0)) {
			rev = rev * 10 + a % 10;
			a = a / 10;
		}

		System.out.println("Integer after reverse  : " + rev);

	}

}
