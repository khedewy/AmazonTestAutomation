package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends Pagebase{
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "add-to-cart-button")
    WebElement addtocartbtn;

    @FindBy(css = "a.a-button-text")
    WebElement cartpagelink;

    @FindBy(css = "input.a-button-input")
    WebElement checkoutpagelinkl;

    public void movetocheckoutpage(){
        clickbutton(checkoutpagelinkl);
    }

    public void movetocartlistpage(){
        clickbutton(cartpagelink);
    }


    public void add_to_cart(){
        clickbutton(addtocartbtn);

    }
}
