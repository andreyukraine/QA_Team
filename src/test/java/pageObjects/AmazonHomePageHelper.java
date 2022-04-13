package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePageHelper extends AmazonHomePageElements{

    public AmazonHomePageHelper(WebDriver driver) {
        super(driver);
    }

    public void navigateUrl(){
        driver.get("https://www.amazon.com/");
    }

    public AmazonSearchResultPage searchWord(String word){
        getSearchField().sendKeys(word);
        getSearchBtn().click();
        return new AmazonSearchResultPage(driver);
    }

    public WebElement getMenu(){
        return driver.findElement(By.xpath("//div[@id='nav-xshop']"));
    }

    public WebElement getBlockGaming(){
        return driver.findElement(By.xpath("//div[@class='a-cardui-header']/h2"));
    }
}
