package demoWebShopProject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_002 extends BaseClass{

	String expectedData = "Computers";
	@Test
	public void toCheckComputerPage() {
		driver.findElement(By.partialLinkText("Computers")).click();
		String actualData = driver.findElement(By.xpath("//h1[text()='Computers']")).getText();
		
		if(actualData.equals(expectedData)) {
			Reporter.log("Navigated successfully to Computers page successfully.", true);
		} else {
			Reporter.log("Failed to navigate to Computers page", true);
		}
		Assert.assertEquals(actualData, expectedData);
	}
}
