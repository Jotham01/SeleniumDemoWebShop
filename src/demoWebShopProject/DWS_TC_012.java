package demoWebShopProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DWS_TC_012 extends BaseClass{

	
	@Test
	public void toCheckWhetherItDisplaysPerPage() {
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		driver.findElement(By.id("products-pagesize")).click();
	}
}
