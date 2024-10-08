package demoWebShopProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DWS_TC_015 extends BaseClass {

	@Test
	public void toCheckWhetherGiftCardsPageIsDisplayed() {
		driver.findElement(By.partialLinkText("Gift Cards")).click();
	}
}
