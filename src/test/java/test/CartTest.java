package test;

import Pages.CartPage;
import Pages.Homepage;
import Pages.Signinpage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends Testbase{
    Homepage homepage;
    CartPage cart;
    Signinpage signinpage;

    @Test(priority = 0)
    public void opensigninpage() throws InterruptedException {
        homepage = new Homepage(driver);
        homepage.movetosignin();
        signinpage = new Signinpage(driver);
        signinpage.emailsign("anterm386@gmail.com");
        Thread.sleep(2000);
        signinpage.passwordsignin("m01205456797");
        Assert.assertEquals(signinpage.successfulmessage.getText(),"Hello, Mahmoud");
    }


    @Test(priority = 1,dependsOnMethods = "opensigninpage")
    public void usercanupdatecart() throws InterruptedException {
        homepage = new Homepage(driver);
        homepage.gotocartpage();
        cart = new CartPage(driver);
        cart.deleteitem();
        Thread.sleep(10000);
    }

}
