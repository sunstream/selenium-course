import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConfiguration {

	public WebDriver getDriver() {
		return DriverHolder.DRIVER;
	}

	private static final class DriverHolder {
		static {
			System.setProperty("webdriver.chrome.driver", WebDriverConfiguration.class.getResource("chromedriver").getPath());
		}
		private static final WebDriver DRIVER = new ChromeDriver();
	}
}
