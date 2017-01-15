import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import poms.UptakeNavigation;
import poms.UptakeHomepage;
import poms.UptakeApproach;
import poms.UptakePlatform;

public class webtest {
	private WebDriver driver;
		
	@Before
	public void setUp() throws Exception{
		driver = new ChromeDriver();
	}
	
	private UptakeHomepage uptakeHomepage = new UptakeHomepage(driver);
	private UptakeNavigation uptakeNavigation = new UptakeNavigation(driver);
	private UptakeApproach uptakeApproach = new UptakeApproach(driver);
	private UptakePlatform uptakePlatform = new UptakePlatform(driver);
	
	@Test
	public void openUptake() throws Exception{
		//Open the main page
		boolean atMainPage = false;
		
		uptakeNavigation.goToUptakeWebsite(driver);
		atMainPage = uptakeHomepage.validateAtMainPage(driver);
		
		if(atMainPage == false){
			//We are not at the main page or the title has been changed
			Assert.fail("The current webpage's title does not match expected");
		}
		
	}
	
	@Test
	public void navigateToApproach() throws Exception{
		//Go to the Uptake website
		uptakeNavigation.goToUptakeWebsite(driver);
		
		//Click on the Approach link
		uptakeNavigation.navigateToApproach(driver);
		
		//Validate we're on the Approach page
		if(uptakeApproach.validateAtApproach(driver) == false){
			//Something went wrong, fail the test
			Assert.fail("We did not navigate to the Approach page");
		}
		
	}

		
	@Test
	public void navigateToPlatform() throws Exception{
		//Go to the Uptake website
		uptakeNavigation.goToUptakeWebsite(driver);
		
		//Click on the Platform link
		uptakeNavigation.navigateToPlatform(driver);
		
		if(uptakePlatform.validateAtPlatform(driver) == false){
			//We didn't make it to the Platform page
			Assert.fail("We did not navigate to the Platform page");
		}
	}
	
	@Test
	public void navigateFromApproachToPlatform() throws Exception{
		//Go to the Uptake website
		uptakeNavigation.goToUptakeWebsite(driver);
		
		//Navigate to the Approach page
		uptakeNavigation.navigateToApproach(driver);
		
		//On the Approach page, click the Our Platform button near the bottom
		uptakeApproach.clickOurPlatform(driver);
		
		//Verify we're on the Platform page
		if(uptakePlatform.validateAtPlatform(driver) == false){
			//We're not at the Platform page. Fail
			Assert.fail("Clicking on Our Platform didn't take us to the Platform page");
		}
	}
	
	@Test
	public void validateDifferentiators() throws Exception{
		//Go to the Uptake website
		uptakeNavigation.goToUptakeWebsite(driver);
		
		//Navigate to the Approach page
		uptakeNavigation.navigateToApproach(driver);
		
		//Check the Partnerships differentiator
		uptakeApproach.clickAndVerifyPartnerships(driver);
		
		//Check the Research differentiator
		uptakeApproach.clickAndVerifyResearch(driver);
		
		//Check the Platform differentiator
		uptakeApproach.clickAndVerifyPlatform(driver);
		
		//Check the Workflow differentiator
		uptakeApproach.clickAndVerifyWorkflow(driver);
		
		//Check the Entrepreneurs differentiator
		
	}
	
	@After
	public void tearDown() throws Exception{
		driver.quit();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
