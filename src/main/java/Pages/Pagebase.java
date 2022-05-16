package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Pagebase {
    WebDriver driver;
    public Actions actions;
    public Pagebase(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void settext(WebElement text, String value){
        text.sendKeys(value);
    }
    public void clickbutton(WebElement button){
        button.click();
    }

}
