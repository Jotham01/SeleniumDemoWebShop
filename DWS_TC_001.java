package demoWebShopProject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_001 extends BaseClass{

	String expectedData = "Books";
	@Test
	public void toCheckBooksPage() {
		driver.findElement(By.partialLinkText("Books")).click();
		String actualData = driver.findElement(By.xpath("//h1[text()='Books']")).getText();
		
		if(actualData.equals(expectedData)) {
			Reporter.log("Navigated successfully to Books page successfully.", true);
		} else {
			Reporter.log("Failed to navigate to Books page", true);
		}
		Assert.assertEquals(actualData, expectedData);
	}
}
