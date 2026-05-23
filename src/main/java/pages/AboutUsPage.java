package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AboutUsPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By jesusQuestion = By.className("font-serif");
    private By answerYesJesusQuest = By.xpath("//button[contains(normalize-space(), 'Yes')]");
    private By myStorysName = By.id("firstName");
    private By myStorysLastname = By.id("lastName");
    private By myStorysEmail = By.id("email");
    private By myStorysMsg = By.id("message");
    private By consentCheckbox = By.className("w-6");
    private By submitBtn = By.xpath("//form//button[@type='submit']");
    private By confirmMsg = By.className("text-gray-400");

    public AboutUsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void answerJesusQuestion () {
        wait.until(ExpectedConditions.presenceOfElementLocated(jesusQuestion));
        driver.findElement(answerYesJesusQuest).click();
    }
    public void fillForm () {
        wait.until(ExpectedConditions.presenceOfElementLocated(myStorysName)).sendKeys("MyName");
        driver.findElement(myStorysLastname).sendKeys("MyLastname");
        driver.findElement(myStorysEmail).sendKeys("d@g.c");
        driver.findElement(myStorysMsg).sendKeys("The message of the story.");
    }
    public String submitStory () {
        driver.findElement(consentCheckbox).click();
        driver.findElement(submitBtn).click();
        String msg = wait.until(ExpectedConditions.visibilityOfElementLocated(confirmMsg)).getText();
        return msg;
    }
}
