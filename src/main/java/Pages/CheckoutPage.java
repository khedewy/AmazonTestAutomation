package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckoutPage extends Pagebase{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "address-ui-widgets-enterAddressLine1")
    WebElement staddresstxt;

    @FindBy(id = "address-ui-widgets-enterAddressLine2")
    WebElement buildingaddresstxt;


    @FindBy(id = "address-ui-widgets-enterAddressCity")
    WebElement citytxt;

    @FindBy(id = "address-ui-widgets-enterAddressStateOrRegion")
    List<WebElement> citieslist;

    @FindBy(id = "address-ui-widgets-enterAddressPostalCode")
    WebElement zipcodetxt;

    @FindBy(id = "address-ui-widgets-use-as-my-default")
    WebElement defaultaddress;

    @FindBy(css = "input.a-button-input")
    WebElement useaddrssbtn;

    public void completecheckout(String street, String building, String city, String zipcode) throws InterruptedException {

        settext(staddresstxt,street);
        settext(buildingaddresstxt,building);
        settext(citytxt,city);
        settext(zipcodetxt,zipcode);
        citieslist.get(0).click();
        //clickbutton(defaultaddress);
        Thread.sleep(10000);
        clickbutton(useaddrssbtn);
    }
}
