package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By mainMenuIcon = By.cssSelector("button.fixed");
    private By aboutUsOption = By.linkText("About Us");

    public HomePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public AboutUsPage browseAboutUsPage () {
        wait.until(ExpectedConditions.elementToBeClickable(mainMenuIcon)).click();
        wait.until(ExpectedConditions.elementToBeClickable(aboutUsOption)).click();
        return new AboutUsPage(driver);
    }
}