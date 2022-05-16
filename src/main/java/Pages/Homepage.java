package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Pagebase{
    public Homepage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "nav-link-accountList-nav-line-1")
    WebElement signinpagelink;

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchbox;

    @FindBy(id = "nav-search-submit-button")
    WebElement searchbtn;

    @FindBy(css = "span.icp-nav-link-inner")
    WebElement changelanguagelink;

    @FindBy(css = "span.nav-cart-icon.nav-sprite")
    WebElement cartpage;

    public void gotocartpage(){
        clickbutton(cartpage);
    }

    public void movetolanguagesPage(){
        clickbutton(changelanguagelink);
    }

    public void searchproduct(String productName){
        settext(searchbox,productName);
        //clickbutton(searchbtn);
    }

    public void movetosignin(){
        clickbutton(signinpagelink);
    }
}
