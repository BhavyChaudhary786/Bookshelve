package test_Cases;

import org.testng.Assert;

//import java.time.Duration;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import dev.failsafe.internal.util.Durations;
import pageObjects.Home_Page;
import test_Base.Base_Class;

public class TS_2 extends Base_Class {
	
	
	@Test
	@Parameters({"browser"})
	public void Verify_Collections() throws InterruptedException {
		
	logger.info("***Starting TS_2 Test ***");
		
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
		
		hp.Brand();
		Thread.sleep(2000);
		hp.Home();
		logger.info("Brand by \"The Home Dekor\" is selected.");
		
		int n=hp.no_of_item();
		hp.print_item(n);
		logger.info("All the available options in bookshelf is printed after applying the filters.***");
		
		hp.Trending();
		int size=hp.size_of_collection();
		hp.Collections(size);
		
		logger.info("All the sub-menus under collections is printed.");
		
		}
		catch(Exception e) {
			logger.error("test Failed...");
			Assert.fail();
		}
 
		logger.info("***TS_2 test case passed successfully.....***");
	}

}
