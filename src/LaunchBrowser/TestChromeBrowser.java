package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeBrowser {

	public static void main(String[] args) {
		
       System.setProperty("webdriver.chrome.driver", "D:\\DXC Selenium Class\\LaunchChromeBrowser\\ChromeBrowserJars\\chromedriver.exe");
    
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.selenium.dev/");
       driver.quit();
	}

}
