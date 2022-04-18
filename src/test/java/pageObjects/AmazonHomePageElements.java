package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePageElements extends BasePage{

    public AmazonHomePageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchBtn(){return driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));}

    public WebElement getMenu(){
        return driver.findElement(By.xpath("//div[@id='nav-xshop']"));
    }

    public WebElement getBlockGaming(){
        return driver.findElement(By.xpath("//div[@class='a-cardui-header']/h2"));
    }

    public WebElement getSearchField(){return driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));}

    public WebElement getCart(){
        return driver.findElement(By.xpath("//div[@id='nav-cart-count-container']"));
    }

}
