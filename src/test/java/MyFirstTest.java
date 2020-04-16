import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class MyFirstTest {

	private WebDriverConfiguration config = new WebDriverConfiguration();

	@Test
	public void helloWorld() {
		WebDriver driver = config.getDriver();
		driver.get("http://www.google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Hello World!");
		searchBox.submit();
		assert driver.getTitle().equals("Hello World! - Пошук Google");
	}

	@AfterClass
	public void teardown() {
		config.getDriver().quit();
	}

}
