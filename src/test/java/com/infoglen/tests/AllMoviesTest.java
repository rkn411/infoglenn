package com.infoglen.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.framework.base.BasePage;
import com.infoglen.allmovies.pages.SearchPage;

public class AllMoviesTest extends BasePage{

	public SearchPage searchPage;

	public AllMoviesTest() {
		searchPage = new SearchPage();
	}

	@Test
	public void searchMovieDetailsTest() throws Exception {
		//Step :1
		searchPage.voidLaunch();
		// Step :2
		searchPage.searchMovie("The Godfather");
		searchPage.clickSearchButton();
		// step :3
		Thread.sleep(9000);
		searchPage.getResultsSize();
		
		// Step :4
		searchPage.verifyGenreType("Crime");
		//Step :5
		searchPage.verifyRating("R");

	}
	@AfterMethod
	public void killSession() {
		BasePage.driver.quit();
	}

}
