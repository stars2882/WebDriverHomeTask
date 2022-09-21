package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePage extends BasicPage{
    private final static String IMAGE_TAB ="//a[contains(@href,'image&source=lnms&tbm=is')]";
    private final static String SEARCH = "//input[@class='gLFyf gsfi']";
    private final static String LIST_IMAGE = "//img[@data-deferred='1']";
            //"//div[@id='islmp']//a[@role='button']";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void enterSearchWord(String keyword){
        driver.findElement(By.xpath(SEARCH)).sendKeys(keyword, Keys.ENTER);
    }

    public void clickOnTabImage(){
        waitVisibilityOfElement(2, By.xpath(IMAGE_TAB));
        driver.findElement(By.xpath(IMAGE_TAB)).click();
    }

    public void checkDisplayImage(){
        waitForPageLoadComplete(5);
        List<WebElement> listImage = driver.findElements(By.xpath(LIST_IMAGE));
        for (int i = 0; i < listImage.size(); i++) {
            Assert.assertTrue(listImage.get(i).isDisplayed());
        }
    }
}
