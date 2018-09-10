package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    WebDriver driver;

    public loginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = ".//*[@id='dismisscookieform:setDismissedCookieWarning']/img")
    private WebElement okCookie;

    @FindBy(xpath = ".//*[@id='allcontent']/div/div[2]/div/a[1]")
    private WebElement Parent;

    @FindBy(id = "loginform:username:input")
    private WebElement Email;

    @FindBy(id = "loginform:passwordinput")
    private WebElement Password;

    @FindBy(id = "loginform:rememberMe:label")
    private WebElement RemenberMe;

    @FindBy(id = "loginform:login")
    private WebElement Login2;

    public void Continue() {
        okCookie.click();

    }

    public void selectParent() {
        Parent.click();

    }

    public void enterEmail(String myEmail) {
        Email.sendKeys(myEmail);
    }

    public void enterPassword(String myPassword) {
        Password.sendKeys(myPassword);
    }


    public void clickRememberMe() {
        RemenberMe.click();
    }

    public void selectLogin2() {
        Login2.click();
    }

}

