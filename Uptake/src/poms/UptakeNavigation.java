package poms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UptakeNavigation {
	private WebDriver driver;
	
	public UptakeNavigation(WebDriver driver){
		this.driver = driver;
	}
	
	public void goToUptakeWebsite(WebDriver driver) throws Exception{
		
		driver.get("https://www.uptake.com");
		Thread.sleep(2000);
	}
	
	public void navigateToApproach(WebDriver driver){
		//Click the Approach link at the top of the page
		driver.findElement(By.id("menu-item-4164")).click();
	}
	
	public void navigateToPlatform(WebDriver driver){
		//Click the Platform link at the top of the page
		driver.findElement(By.id("menu-item-4163")).click();
	}
	
	public void navigateToSolutions(WebDriver driver){
		//Click the Solutions link at the top of the page
		driver.findElement(By.id("menu-item-4172")).click();
	}
	
	public void navigateToPeople(WebDriver driver){
		//Click the People link at the top of the page
		driver.findElement(By.id("menu-item-4162")).click();
	}
	
	public void navigateToJoinUs(WebDriver driver){
		//Click the Join Us link at the top of the page
		driver.findElement(By.id("menu-item-4167")).click();
	}
	
	public void navigateToContactUs(WebDriver driver){
		//Click the Contact Us link at the top of the page
		driver.findElement(By.id("menu-item-4334")).click();
	}
	
	public void navigateToBlog(WebDriver driver){
		//Click the Blog link at the top of the page
		driver.findElement(By.id("menu-item-4166")).click();
	}
	
	public void navigateToHomePage(WebDriver driver){
		//Click the Uptake logo
		driver.findElement(By.className("icon icon--logo")).click();
	}

}
