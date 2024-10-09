package demoWebShopProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DWS_TC_013 extends BaseClass{

	
	@Test
	public void toCheckWhetherPageIsViewedAsGrid() {
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		driver.findElement(By.xpath("//option[text()='Grid']")).click();
	}
}
