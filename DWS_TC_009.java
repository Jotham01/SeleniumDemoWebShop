package demoWebShopProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DWS_TC_009 extends BaseClass{

	
	@Test
	public void toCheckWhetherCopyrightMessageIsDisplayedOrNot() {
		WebElement copyrighttxt = driver.findElement(By.xpath("//div[contains(text(),'Copyright')]"));
		System.out.println(copyrighttxt);
	}
}
