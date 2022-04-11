import org.openqa.selenium.By;
import org.testng.Assert;

public class Test extends WebDriverClass{

    private String siteUrl = "https://qa2.eatstreet.com";

    @org.testng.annotations.Test
    public void openRegister(){
        driver.get(siteUrl + "/create-account");

        String genName = System.currentTimeMillis() + "_andrey@gmail.com";
        String passTest = "Zaqxsw123qaz";

        setTextByLocator("//input[@id='email']",genName);
        setTextByLocator("//input[@id='password']",passTest);
        setTextByLocator("//input[@id='passwordAgain']",passTest);

        clickByLocator("//button[@id='signup']");

        waitElementByLocator("//a[@id='menu-my-account']", 10);

        Assert.assertNotNull(driver.findElement(By.xpath("//a[@id='menu-my-account']")));
    }
}

