package minirestwebservice;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GoogleStartPageTest {

	private WebDriver driver;

	@Before
	public void setUp() throws MalformedURLException {
		String serverUrl = System.getProperty("grid.server.url");
		String gridServerUrl = "http://192.168.178.55:4444/wd/hub";
		if (serverUrl != null) {
			gridServerUrl = serverUrl;
		}
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		URL gridUrl = new URL(gridServerUrl);
		driver = new RemoteWebDriver(gridUrl, capability);
//		driver.get("http://192.168.178.55:8080/JaxRsMitMaven/rest/helloworld?name=Joern");
	}

	@After
	public void tearDownWebDriver() {
		driver.quit();
	}

	@Test
	public void pageTitleIsNotNull() throws MalformedURLException {
		driver.get("http://192.168.178.55:8080/JaxRsMitMaven/rest/helloworld?name=Joern");
//		WebElement element = driver.findElement(By.name("q"));
//		element.sendKeys("Cheese!");
//		element.submit();
		assertTrue(driver.getTitle() != null);
	}

	@Test
	public void pageTitleContainsGoogle() throws MalformedURLException {
		driver.get("http://192.168.178.55:8080/JaxRsMitMaven/rest/helloworld?name=Joern");
//		WebElement element = driver.findElement(By.name("q"));
//		element.sendKeys("Cheese!");
//		element.submit();
		assertTrue(driver.getTitle().contains("Joern"));
	}

}