import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	}

}
