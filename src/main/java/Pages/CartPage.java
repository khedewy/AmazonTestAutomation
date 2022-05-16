package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends Pagebase{
    public CartPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(name = "submit.delete.C61990b74-a67f-48ba-88fe-2fedc93cc59c")
    WebElement deletebtn;

    @FindBy(name = "submit.save-for-later.C3178292a-ed64-4dae-a6c6-bca1b793a460")
    WebElement saveforlater;

    @FindBy(name = "submit.compare.C3178292a-ed64-4dae-a6c6-bca1b793a460")
    WebElement comparprouducts;

    public void deleteitem(){
        clickbutton(deletebtn);
    }

    public void saveitemsforlater(){
        clickbutton(saveforlater);
    }

    public void Comparingprouduct(){
        clickbutton(comparprouducts);
    }
}
