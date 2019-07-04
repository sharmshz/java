package javaconcepts2;

public class ReverseCharacter {

	public static void main(String[] args) {

		String b= reverseCharacter("Selenium");
		System.out.println("After Reverese : " + b);
	}
	
	
	
	public static String reverseCharacter(String str)
	{
		String a = str;
		System.out.println("Before Reverese : " + a);
		int count = a.length();
		System.out.println(count);
		char[] b = a.toCharArray();

		char[] c = new char[count];

		for (int i = 0; i < b.length; i++) {
			c[i] = b[count - 1];
			count -= 1;

		}
		String rev ="";
		for (int j = 0; j < a.length(); j++) {
			rev=rev+c[j];
			
		}

		return rev;
	}
}
