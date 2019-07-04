package javaconcepts2;

public class ReverseString {

	public static void main(String[] args) {

		reverseString("This is Selenium");
		
		
		String str = "This is selenium";
		String rev="";
		int x= str.length();
		
		for(int i=x-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		
		System.out.println("Reverse string is : " + rev);
		

	}

	public static String reverseString(String str1) {
		String str = str1;
		System.out.println("Before reverse : " + str);
		String a[] = str.split(" ");

		int len = a.length;
		// System.out.println(" length of String a : " + len);

		String b[] = new String[len];
		// System.out.println(b.length);

		int count = b.length;

		for (int i = 0; i < b.length; i++) {
			b[i] = a[count - 1];
			count--;
		}

		String rev = "";

		for (String x : b) {
			rev = rev + x + " ";
		}

		System.out.println("After reverse : " + rev);

		return rev;
	}

}
