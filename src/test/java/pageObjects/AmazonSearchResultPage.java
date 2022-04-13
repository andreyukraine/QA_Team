package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSearchResultPage extends BasePage{

    public AmazonSearchResultPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchResult(){
        return driver.findElement(By.xpath("//span[@class='s-pagination-strip']"));
    }



}
