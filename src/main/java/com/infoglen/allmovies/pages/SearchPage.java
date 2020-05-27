package com.infoglen.allmovies.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import  static com.framework.supportio.UIWrappers.*;
import com.framework.base.BasePage;

public class SearchPage extends BasePage {
	public SearchPage() {
	
	}

	// searchPage
	@FindBy(xpath="//input[@class='site-search-input']")
	private WebElement searchField;

	@FindBy(xpath="//form[@name='site-search']//input[@name='submit']")
	private WebElement searchButton;
	
	@FindBy(xpath="//*[@class='results']/h1.getAttribute('innerHTML')")
	private WebElement resultsSize;

	@FindBy(xpath="//ul[@class='search-results']")
	private List<WebElement> searchResults;

	// resultpage
	@FindBy(xpath="//span[@class='header-movie-genres']//a[contains(text(),'Crime')]")
	private WebElement genreType;

	@FindBy(xpath="//span[contains(text(),'MPAA Rating -')]")
	private WebElement mpaaRating;

	@FindBy(xpath="//li[@class='tab cast-crew']")
	private WebElement castAndCrew;

	@FindBy(xpath="//*[@class='name artist-name']")
	private WebElement directorName;

	/**
	 * method to search for movie
	 * @throws Exception 
	 * 
	 */
	public void searchMovie(String movieName) throws Exception {
		clickOnElement(searchField);
		inputText(searchField,movieName);
		System.out.println("movie name entered");
	}

	/**
	 * method to click on search button
	 * @throws Exception 
	 * 
	 */
	public void clickSearchButton() throws Exception {
		clickOnElement(searchButton);
	}

	/**
	 * method to get size of search results
	 * @throws InterruptedException 
	 */
	public void getResultsSize() throws InterruptedException {
		waitForElement(resultsSize,6);
		String resultCount = resultsSize.getText();
		String str = new String(resultCount);
		
		System.out.println(str.replaceAll("[^a-z A-Z]", ""));
		System.out.println(resultCount);
		
	}
	

	/**
	 * method to verify genre type
	 * 
	 */
	public void verifyGenreType(String type) {
		String genreName = genreType.getText();
		Assert.assertEquals(genreName, type);
	}

	/**
	 * method to verify mmpaa rating
	 * 
	 */
	public void verifyRating(String ratingType) {
		String rating = mpaaRating.getText();
		Assert.assertEquals(rating, ratingType);
	}
	public void verifyDirectorDetails(String name) {
		String directordetails = directorName.getText();
		Assert.assertEquals(directordetails, name);
		
		
	}

}
