package Pages;

import org.junit.Assert;
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

    @FindBy(xpath = ".//*[@id='vTF']/div[1]/h1")
    private WebElement OnlineTutorsRecommended;

    @FindBy(id = "inputSubject:input")
    private WebElement Subject;

    @FindBy(id = "inputLevel:input")
    private WebElement Level;


    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement Gender;



    public void AssertTutorPage() {
        System.out.println(OnlineTutorsRecommended.getText());
        String expectedResult = "Here are 7 online tutors we recommend working with";
        String actualResult = OnlineTutorsRecommended.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    public void searchSubject() {
        Select sub = new Select(Subject);
        sub.selectByValue("Subject[9]");
    }

    public void searchLevel() {
        Select lev = new Select(Level);
        lev.selectByValue("TutoringLevelType[1]");
    }

    public void selectGender() {
        if (!driver.findElement(By.id("gender:input:1")).isSelected()) {

            driver.findElement(By.id("gender:input:1")).click();
        }


    }
}

