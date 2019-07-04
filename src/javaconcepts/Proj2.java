package javaconcepts;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Proj2 {

	@Test(dataProvider = "dp", dataProviderClass = Proj2.class)
	public static void checkData(Hashtable<String, String> t) {

		System.out.println("Value of a is :" + t.get("UserID") + "--Value of b is : " + t.get("Pssword"));

	}

	@DataProvider(name = "dp")
	public Object[][] getData() {

		Object data[][] = new Object[4][1];

		data[0][0] = "UserID";
		data[1][0] = "Password";
		data[2][0] = "String2";
		data[3][0] = 40;

	
		
		
		return data;

	}

}
