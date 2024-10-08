package demoWebShopProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DWS_TC_007 extends BaseClass{

	
	@Test
	public void toCheckWishlist() {
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
	}
}
