package demo.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/* Demo test class created to demonstrate working with different GIT commands */
public class DemoTest {

	@Test()
	public void TestMethod() {

		String filepath = System.getProperty("user.dir") + "/src/test/java/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", filepath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twitter.com/");
		driver.quit();
	}

}
