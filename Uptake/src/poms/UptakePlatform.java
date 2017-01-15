package poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UptakePlatform {
	
	WebDriver driver;
	
	public UptakePlatform(WebDriver driver){
		this.driver = driver;
	}
	
	public boolean validateAtPlatform(WebDriver driver){
		//Validate we're currently at the Platform page
		boolean success = false;
		
		//I'm going to validate that the 'minimize downtime' text displays
		if(driver.findElement(By.className("callout__heading")).getText().contains("Minimize downtime. Optimize performance. Enhance safety.")){
			success = true;
		}
		
		return success;
	}
	
	public void clickOurSolutions(WebDriver driver){
		driver.findElement(By.className("ghost-btn")).click();
	}

}
