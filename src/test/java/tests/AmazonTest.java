package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.AmazonHomePageHelper;
import pageObjects.AmazonSearchResultHelper;

public class AmazonTest{


    public WebDriver driver;

    @BeforeTest
    public void beforeRun(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterTest
    public void afterRun(){
        driver.quit();
    }

    @Test
    public void checkSearchDog(){
        AmazonHomePageHelper homePage = new AmazonHomePageHelper(driver);
        homePage.navigateUrl();
        homePage.openFullScreen();

        AmazonSearchResultHelper resutSearch = homePage.searchWord("dog");
        Assert.assertTrue(resutSearch.getSearchResult().isDisplayed());
    }
    @Test
    public void menuDisplay(){
        AmazonHomePageHelper homePage = new AmazonHomePageHelper(driver);
        homePage.navigateUrl();
        homePage.openFullScreen();

        Assert.assertTrue(homePage.getMenu().isDisplayed());
    }

    @Test
    public void gamingBlock(){
        AmazonHomePageHelper homePage = new AmazonHomePageHelper(driver);
        homePage.navigateUrl();
        homePage.openFullScreen();

        Assert.assertTrue(homePage.getBlockGaming().isDisplayed());
    }

    @Test
    public void reviewsSearchBlock(){
        AmazonSearchResultHelper searchPage = new AmazonSearchResultHelper(driver);
        searchPage.navigateUrl();
        searchPage.openFullScreen();

        Assert.assertTrue(searchPage.getSearchReviews().isDisplayed());
    }

    @Test
    public void homeWorkTest(){
        AmazonHomePageHelper homePage = new AmazonHomePageHelper(driver);
        homePage.navigateUrl();

        AmazonSearchResultHelper searchPage = homePage.searchWord("test");
        searchPage.getSearchLogo().click();

        Assert.assertTrue(homePage.getBlockGaming().isDisplayed());
    }


}
