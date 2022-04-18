package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSearchResultHelper extends AmazonSearchPageElements{

    public AmazonSearchResultHelper(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchReviews() {return getReviews();}

    public WebElement getSearchResult(){return getPaginator();}

    public WebElement getSearchLogo(){return  getLogo();}
}
