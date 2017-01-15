package poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

public class UptakeApproach {
	
	WebDriver driver;
	
	public UptakeApproach(WebDriver driver){
		this.driver = driver;
	}
	
	public boolean validateAtApproach(WebDriver driver){
		//Make sure we are at the Approach page
		boolean success = false;
		
		//We're going to verify the 'Five key differentiators' section is there to validate we're on the approach page
		if (driver.findElement(By.className("section-title")).getText().contains("Five key differentiators define our approach.")){
			success = true;
		}
		
		return success;
	}
	
	public void clickOurPlatform(WebDriver driver){
		driver.findElement(By.className("ghost-btn")).click();
	}
	
	public void clickAndVerifyPartnerships(WebDriver driver) throws Exception{
		//Verify that when we click on 'Partnerships with Industry Leaders' the correct text displays
		driver.findElement(By.xpath("//*[contains(text(), 'Partnerships with Industry Leaders')]")).click();
		
		Thread.sleep(500);
		
		//Validate the text
		String leadersText = "We work with iconic companies to tackle hard problems combining our proprietary technology with their industry-leading knowledge and wealth of data. Our partners give us direct access to deep, rich data collected from sensored equipment and machines throughout operations.";
		if (!driver.findElement(By.xpath("//*[contains(text(), 'We work with iconic companies')]")).getText().contains(leadersText)){
			Assert.fail("The leaders text was different");
		}
	}
	
	public void clickAndVerifyResearch(WebDriver driver) throws Exception{
		//Verify that when we click on 'On-the-Ground Research' the correct text displays
		driver.findElement(By.xpath("//*[contains(text(), 'On-The-Ground Research')]")).click();
		
		Thread.sleep(500);
		
		//Validate the text
		String researchText = "We work from the ground up, starting in the field—whether that's a rail yard, a triage unit, or a power plant—to understand real-world constraints and context of use. We see firsthand the problems our partners are trying to solve, and ones they've yet to identify.";
		if(!driver.findElement(By.xpath("//*[contains(text(), 'We work from the ground up')]")).getText().contains(researchText)){
			Assert.fail("The research text was different");
		}
	}
	
	public void clickAndVerifyPlatform(WebDriver driver) throws Exception{
		//Verify that when we click on 'A Platform Approach' the correct text displays
		driver.findElement(By.xpath("//*[contains(text(), 'A Platform Approach')]")).click();
		
		Thread.sleep(500);
		
		//Validate the text
		String platformText = "Unbound by the structure of one specific industry, we look at data across seemingly disparate businesses through one scope for a truly massive big picture. Our platform creates ever more accurate predictions as we integrate findings discovered from patterns in data across a wide array of industries.";
		if(!driver.findElement(By.xpath("//*[contains(text(), 'Unbound by the structure')]")).getText().contains(platformText)){
			Assert.fail("The platform text was different");
		}
	}
	
	public void clickAndVerifyWorkflow(WebDriver driver) throws Exception{
		//Verify the text that displays when 'Integration into Workflow' is clicked
		driver.findElement(By.xpath("//*[contains(text(), 'Integration into Workflow')]")).click();
		
		String workflowText = "We don't stop at the analytics—we deliver answers into workflow, to exactly the right person at the right time. Our integrated solutions provide real-time insights and allow for seamless action to be taken on a recommendation, producing immediate results.";
		if(!driver.findElement(By.xpath("//*[contains(text(), 'we deliver answers')]")).getText().contains(workflowText)){
			Assert.fail("The workflow text was different");
		}
	}
	
	public void clickAndVerifyEntrepreneur(WebDriver driver) throws Exception{
		//Verify the text that displays when 'A multidisciplinary team of Entrepreneurs' is clicked
		driver.findElement(By.xpath("//*[contains(text(), 'A Multidisciplinary Team of Entrepreneurs')]")).click();
		
		String entrepreneurText = "We've instituted a new way of building software. We're driving transformational change, not incremental. Using speed and agility, we're knocking down silos to build on knowledge and data to make everyone better.";
		if(!driver.findElement(By.xpath("//*[contains(text(), 'a new way of building')]")).getText().contains(entrepreneurText)){
			Assert.fail("The entrepreneur text was different");
		}
	}

}
