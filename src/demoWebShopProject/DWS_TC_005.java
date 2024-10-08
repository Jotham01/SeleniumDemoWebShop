package demoWebShopProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DWS_TC_005 extends BaseClass{

	
	@Test
	public void toCheckWhetherSearchTextfieldAcceptsInput() {
		driver.findElement(By.id("small-searchterms")).sendKeys("Laptop");
	}
}
