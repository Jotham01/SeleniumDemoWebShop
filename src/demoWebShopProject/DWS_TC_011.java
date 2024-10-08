package demoWebShopProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DWS_TC_011 extends BaseClass{

	
	@Test
	public void toCheckApparelsAndShoesPage() {
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
	}
}
