package poms;

import org.openqa.selenium.WebDriver;

public class UptakeHomepage {
	WebDriver driver;
	
	public UptakeHomepage(WebDriver driver){
		this.driver = driver;
	}
	
	public boolean validateAtMainPage(WebDriver driver){
		//Check that we are at the main page
		boolean success = false;
		
		if(driver.getTitle().contains("Analytics for the Industrial Internet")){
			success = true;
		}
		
		return success;
	}

}
