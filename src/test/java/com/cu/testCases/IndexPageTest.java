package com.cu.testCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cu.base.BaseClass;
import com.cu.pages.IndexPage;

public class IndexPageTest extends BaseClass {

	IndexPage indexPage;

	public IndexPageTest() {
		super();
	}

	@Test(priority = 1)
	public void verifyIndexPageTitle() throws IOException, InterruptedException {
		indexPage = new IndexPage();
		Thread.sleep(5000);
		if (driver.getTitle().equals("Home Page - Contoso University")) {
			Assert.assertTrue(true);
			logger.info("Index Page Title test passed");
		} else {
			captureScreen(driver, "indexPageTitleTest");
			Assert.assertTrue(false);
			logger.info("Index Page Title test failed");
		}

	}

}
