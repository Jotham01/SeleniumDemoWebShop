package demoWebShopProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DWS_TC_014 extends BaseClass {
	@Test
	public void toCheckWhetherPageIsViewedAsGrid() {
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		driver.findElement(By.xpath("//option[text()='List']")).click();
	}
}
