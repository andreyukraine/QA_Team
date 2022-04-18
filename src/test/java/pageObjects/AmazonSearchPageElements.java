package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSearchPageElements extends BasePage{

    public AmazonSearchPageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getReviews(){return  driver.findElement(By.xpath("//div[@id='reviewsRefinements']"));}

    public WebElement getPaginator(){return driver.findElement(By.xpath("//span[@class='s-pagination-strip']"));}

    public WebElement getLogo(){ return driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));}
}
