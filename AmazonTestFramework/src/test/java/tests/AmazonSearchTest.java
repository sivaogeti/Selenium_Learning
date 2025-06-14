package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.SearchResultsPage;


public class AmazonSearchTest extends BaseTest {

    @Test
    public void testSearchAndClickProduct() {
        HomePage home = new HomePage(driver);
        home.search("Home Furniture");

        SearchResultsPage results = new SearchResultsPage(driver);
        results.clickFirstResult();
    }
}
