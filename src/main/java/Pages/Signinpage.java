package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signinpage extends Pagebase{
    public Signinpage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "ap_email")
    WebElement emailtext;

    @FindBy(id = "continue")
    WebElement continuebtn;

    @FindBy(id = "ap_password")
    WebElement passwerdtxt;

    @FindBy(id = "signInSubmit")
    WebElement signinbtn;

    @FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement successfulmessage;

    public void emailsign(String email){
        settext(emailtext,email);
        clickbutton(continuebtn);
    }
    public void passwordsignin(String password){
        settext(passwerdtxt,password);
        clickbutton(signinbtn);
    }
}
