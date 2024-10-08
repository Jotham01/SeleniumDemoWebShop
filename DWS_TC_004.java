package demoWebShopProject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_004 extends BaseClass{

	String expectedData = "Price: High to Low";
	@Test
	public void toCheckWhetherYouCanSort() {
		driver.findElement(By.partialLinkText("Jewelry")).click();
		driver.findElement(By.xpath("//option[text()='Price: High to Low']")).click();
		
		String actualData = driver.findElement(By.id("products-orderby")).getText();
		if(actualData.equals(expectedData)) {
			Reporter.log("Successfully selected High to Low", true);
		} else {
			Reporter.log("Failed to select High to Low", true);
		}
		Assert.assertEquals(actualData, expectedData);
		
	}
}
