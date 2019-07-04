package javaconcepts2;

public class LargestSmallestNumber {
	public static void main(String[] args) {

		int[] a = { 3, 6, 1, 8, 66, 45, 3456, 76, 98732, -87, -67 };

		int largest = a[0];
		int smallest = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > largest) {
				largest = a[i];
			} else if (a[i] < smallest) {
				smallest = a[i];
			}

		}

		System.out.println("Largest number is :: " + largest);
		System.out.println("Smallest number is :: " + smallest);

	}
}
