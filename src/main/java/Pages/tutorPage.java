package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class tutorPage {
    WebDriver driver;

    public tutorPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "inputSubject:input")
    private WebElement Subject;

    @FindBy(id = "inputLevel:input")
    private WebElement Level;


    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement Gender;

    @FindBy(css = ".//*[@id='tutorList']/a[1]/div/div[2]/div/p[1]']")
    private WebElement Tutor;

    @FindBy(xpath = ".//*[@id='allcontent']/div/div/div/div/div[2]/div[2]/div[1]/div/div[3]/h4")
    private WebElement confirmProfile;

    @FindBy(id = "fullcontactform:msg:input")
    private WebElement Message;

    @FindBy(id = "fullcontactform:sendMessageFromTutorProfile")
    private WebElement SendMessage;

    @FindBy(id = "msgdlg_Label")
    private WebElement verifySent;

    public void searchSubject() {
        Select sub = new Select(Subject);
        sub.selectByValue("Subject[9]");
    }

    public void searchLevel() {
        Select lev = new Select(Level);
        lev.selectByValue("TutoringLevelType[1]");
    }

    public void selectGender(){
        if(!driver.findElement(By.id("gender:input:1")).isSelected()){

            driver.findElement(By.id("gender:input:1")).click();
        }


        }
        public void selectTutor(){
        Tutor.click();
        }
        public boolean verifyProfile(){
        return confirmProfile.isDisplayed();
        }
        public void InputMessage(String myMessage) {
            Message.clear();
            Message.sendKeys(myMessage);

        }
        public void MessageSend() {
            SendMessage.click();

        }
        public boolean verifySentMessge(){
        return verifySent.isDisplayed();




        }

        }



