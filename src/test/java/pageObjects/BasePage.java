package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver) {this.driver = driver;}

    public void openFullScreen(){
        driver.manage().window().maximize();
    }

    public void navigateUrl(){
        driver.get("https://www.amazon.com/");
    }

    public void waitElementByLocatorByText(String locator, String text, int second){
        WebDriverWait waitInit = new WebDriverWait(driver, second);
        waitInit.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath(locator)), text));
    }

    public void waitElementByLocator(String locator, int second){
        WebDriverWait waitInit = new WebDriverWait(driver, second);
        waitInit.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    public void refreshTab(){
        driver.navigate().refresh();
    }
}
