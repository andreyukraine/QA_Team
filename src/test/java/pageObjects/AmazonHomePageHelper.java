package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePageHelper extends AmazonHomePageElements{

    public AmazonHomePageHelper(WebDriver driver) {
        super(driver);
    }

    public AmazonSearchResultHelper searchWord(String word){
        getSearchField().sendKeys(word);
        getSearchBtn().click();
        return new AmazonSearchResultHelper(driver);
    }




}
