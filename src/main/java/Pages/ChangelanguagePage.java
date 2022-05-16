package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ChangelanguagePage extends Pagebase{
    public ChangelanguagePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/form/div[1]/div[1]/div[4]/div/label/span/span/span[1]")
    WebElement arabiclanguagebtn;

    @FindBy(css = "input.a-button-input")
    WebElement submitchangesbtn;

    @FindBy(css = "span.a-button-text.a-declarative")
    WebElement currencylist;


    @FindBy(id = "icp-currency-dropdown_40")
    WebElement gyptionpoundbtn;

    public void changecurrency() throws InterruptedException {
        clickbutton(currencylist);
        Thread.sleep(3000);
        clickbutton(gyptionpoundbtn);

    }

    public void changetoarabic(){
        clickbutton(arabiclanguagebtn);
    }

    public void submitchange(){
        clickbutton(submitchangesbtn);
    }
}
