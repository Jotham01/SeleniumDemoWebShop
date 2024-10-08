package demoWebShopProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DWS_TC_010 extends BaseClass{

	
	@Test
	public void toCheckElectronicsPage() {
		driver.findElement(By.partialLinkText("Electronics")).click();
	}
}
