package demoWebShopProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DWS_TC_003 extends BaseClass {
	@Test
	public void toCheckComputerAddToCartButtonIsWorking() {
		driver.findElement(By.partialLinkText("Computers")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		
}
}
