package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends Pagebase{
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "div.s-suggestion-container")
    List<WebElement> searchrresults;

    @FindBy(css = "span.a-size-medium.a-color-base.a-text-normal")
    WebElement productlink;

    public void movetoproductpage(){
        clickbutton(productlink);
    }

    public void usersearchbyautocomplete(){
        searchrresults.get(1).click();
    }
}
