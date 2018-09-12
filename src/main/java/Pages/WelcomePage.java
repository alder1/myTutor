package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WelcomePage {
    WebDriver driver;

    public WelcomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = ".//*[@id='allcontent']/div/div/div/div/div/div/div[1]/h1")
    private WebElement WelcomeMessage;

    @FindBy(xpath = ".//*[@id='header']/nav/div/div[3]/ul/li[2]/a")
    private WebElement FindATutor;

    public void AssertWelcomeMessage(){
        System.out.println(WelcomeMessage.getText());
        String expectedResult = "Welcome Alder";
        String actualResult = WelcomeMessage.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    public void selectFindTutor(){
        FindATutor.click();
    }
}
