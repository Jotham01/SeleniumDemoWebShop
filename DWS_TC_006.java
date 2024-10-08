package demoWebShopProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DWS_TC_006 extends BaseClass{
	@Test
	public void toCheckWhetherSearchButtonIsGettingClicked() {
		driver.findElement(By.id("small-searchterms")).sendKeys("Laptop");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
