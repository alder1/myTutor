package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingPage {
    WebDriver driver;

    public landingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = ".//*[@id='header']/nav/div[1]/div[3]/div/a[2]")
    private WebElement LoginButton;

    public void clickLoginButton(){
        LoginButton.click();
    }
}
