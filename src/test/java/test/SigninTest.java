package test;

import Pages.Homepage;
import Pages.Signinpage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SigninTest extends Testbase{
    Homepage homepage;
    Signinpage signinpage;

    @Test
    public void opensigninpage() throws InterruptedException {
        homepage = new Homepage(driver);
        homepage.movetosignin();
        signinpage = new Signinpage(driver);
        signinpage.emailsign("anterm386@gmail.com");
        Thread.sleep(2000);
        signinpage.passwordsignin("m01205456797");
        Assert.assertEquals(signinpage.successfulmessage.getText(),"Hello, Mahmoud");
    }
}
