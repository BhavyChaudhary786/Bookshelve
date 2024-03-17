package test_Cases;

import org.testng.Assert;
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.Home_Page;
import test_Base.Base_Class;
 

 
 
public class TS_1  extends Base_Class{
//	public WebDriver driver;
//	@BeforeClass
//	@Parameters({"browser"})
//	public void setup(String br)
//	{
////		switch(br.toLowerCase()) {
////		case "chrome":{
////			driver=new ChromeDriver();
////			break;}
////		case "edge":{
////			driver=new EdgeDriver();
////			break;}
////		default:{
////			System.out.println("Not found");
////			break;
////			}
////		}
//		driver=new ChromeDriver();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.urbanladder.com/");
//		driver.manage().window().maximize();
//	}
//	
//	@AfterClass
//	public void tearDown()
//	{
//		driver.quit();
//	}

	@Test
	@Parameters({"browser"})
	public void verify() throws InterruptedException
	{
		logger.info("***Starting TS_1 Test ***");
		
		try {
		Home_Page hp=new Home_Page(driver);
		
		hp.clickBookShelves();
		logger.info("Clicked on Bookshelves.");
		
		Thread.sleep(5000);
		hp.clickPopup();
		logger.info("Clicked on popup.");
		
		hp.Price();
		hp.Slider();
		Thread.sleep(5000);
		logger.info("Price range is Selected By using the slider.");
		
		hp.Hover();
		hp.StorageType();
		logger.info("Storage type open is selected by hovering on Storage type.");
		
		hp.Stock();
		logger.info("Out of stack products are excluded.");

		hp.BookShelveName();
		logger.info("Getting top three Bookshelves info.");
		}
		catch(Exception e) {
			logger.error("test Failed...");
			Assert.fail();
		}
 
		logger.info("***TS_1 test case passed successfully.....***");


		//AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
//		regpage.setFirstName(randomeString().toUpperCase());
//		regpage.setLastName(randomeString().toUpperCase());
//		regpage.setEmail(randomeString()+"@gmail.com");// randomly generated the email
//		regpage.setTelephone(randomeNumber());
//		
//		String password=randomAlphaNumeric();
//		
//		regpage.setPassword(password);
//		regpage.setConfirmPassword(password);
//		
//		regpage.setPrivacyPolicy();
//		regpage.clickContinue();
//		
//		String confmsg=regpage.getConfirmationMsg();
//		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
	}


}
