package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.AmazonHomePageHelper;
import pageObjects.AmazonSearchResultPage;

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

        AmazonSearchResultPage resutSearch = homePage.searchWord("dog");
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

}
