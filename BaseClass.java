package demoWebShopProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	String expectedHomePageTitle = "Demo Web Shop";
	
	@Parameters("browser")
    @BeforeClass
	public void toLaunch(String bNAme) {
		
		if(bNAme.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(bNAme.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else if(bNAme.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		
		driver = new ChromeDriver();
		Reporter.log("Browser got launched succesfully", true);
		driver.manage().window().maximize();
		Reporter.log("Browser got maximized succesfully", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@BeforeMethod
	public void toLogin() {
		driver.get("https://demowebshop.tricentis.com/");
		String actualHomePageTitle = driver.getTitle();
		if (actualHomePageTitle.equals(expectedHomePageTitle)) {
			Reporter.log("Navigated succesfully to demo web shop", true);
		} else {
			Reporter.log("Failed to navigate to demo web shop", true);
		}
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("seleniumA2@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("selenium@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("Logged In successfully", true);
	}

	@AfterMethod
	public void toLogout() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("Logged out succesfully", true);
	}

	@AfterClass
	public void toClass() {
		Reporter.log("Browser got closed successfully", true);
		driver.quit();
	}

}
