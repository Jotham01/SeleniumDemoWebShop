package demoWebShopProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DWS_TC_008 extends BaseClass{

	
	@Test
	public void toCheckWhetherWeCanCheckOurOrders() {
		driver.findElement(By.linkText("Orders")).click();
	}
}
