package test_Cases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.Gift_page;
import pageObjects.Home_Page;
import test_Base.Base_Class;

public class TS_3 extends Base_Class{
	
	
	@Test
	@Parameters({"browser"})
	public void gift_card() {
		
		logger.info("***Starting TS_3 Test ***");
		
		try {
		Home_Page hp=new Home_Page(driver);
		logger.info("Navigating to homepage.");
	
		hp.click_giftCard();
		logger.info("Navigating to giftCards page.");

		Gift_page gp=new Gift_page(driver);
		gp.click_bNa();
		logger.info("Clicking on Birthday And Anniversary Option.");
		
		gp.Amount();
		logger.info("Amount is Entered.");
		
		gp.SelectMonth();
		gp.SelectDate();
		logger.info("Date is Selected.");
		
		gp.Next();
		logger.info("Next button is Selected.");
		gp.fill_rname();
		gp.fill_rEmail();
		gp.fill_rMobileNum();
		logger.info("All the input boxes of 'To' field is Selected.");

		gp.fill_yname();
		gp.fill_yEmail();
		gp.fill_yMobileNum();
		gp.fill_yAddress();
		gp.fill_pin();
		logger.info("All the input boxes of 'From' field is Selected.");

		gp.click_confirm();
		logger.info("Confirm button is Selected.");

		gp.getErrorMsg();
		logger.info("Error message is printed on console.");
		
		}
		catch(Exception e) {
			logger.error("test failed....");
			Assert.fail();
		}
		
		logger.info("***TS_3 test case passed successfully. ***");

	}

}
