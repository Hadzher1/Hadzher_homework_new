package homework.page.factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    public static final String PAGE_URL = "http://training.skillo-bg.com:4300/posts/all";
    private final WebDriver driver;

    @FindBy(id = "homeIcon")
    private WebElement homeIcon;

   public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isUrlLoaded() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.urlToBe(HomePage.PAGE_URL));
    }

    public boolean isElementDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement homeIcon = driver.findElement(By.id("homeIcon"));
        Boolean isSearchBoxDisplayed = homeIcon.isDisplayed();
        return isSearchBoxDisplayed;
    }

    public void navigateTo() {
        this.driver.get(PAGE_URL);
    }
}
