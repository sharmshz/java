package javaconcepts;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Proj1 {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {

		String path = "D:\\VimalProject\\ApplicationTest\\src\\test\\resources\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		closeOpenBrowsers();
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		
	ArrayList li = new ArrayList();

		driver.get("https://www.google.com");
		WebElement a = driver.findElement(By.xpath("//a[@title='Google apps']"));
		driver.manage().window().maximize();
		Thread.sleep(1000);
		action.moveToElement(a).click().build().perform();
		System.out.println("Script is done!!");

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File d = new File("D:\\TestFolder\\test_" + getDate() + ".png");
		FileUtils.copyFile(f, d);

	}

	public static String getDate() {
		Calendar c = Calendar.getInstance();
		return c.getTime().toString().replace(":", "_").replace(" ", "_");

	}

	public static void closeOpenBrowsers() throws IOException {
		Runtime.getRuntime().exec("taskkill /f /t /im chromedriver.exe");

	}




}
