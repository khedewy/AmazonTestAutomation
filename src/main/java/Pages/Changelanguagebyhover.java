package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Changelanguagebyhover extends Pagebase{
    public Changelanguagebyhover(WebDriver driver) {
        super(driver);
        actions = new Actions(driver);


    }
    @FindBy(css = "span.icp-nav-flag.icp-nav-flag-us")
    WebElement languageslist;

    @FindBy(css = "div.nav-template.nav-flyout-content.nav-tpl-itemList")
    WebElement Arabic_language;

    public void movetoarbiclanguage() throws InterruptedException {
        actions.moveToElement(languageslist).moveToElement(Arabic_language).click().build().perform();

    }

}
