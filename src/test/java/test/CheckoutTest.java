package test;

import Pages.*;
import org.testng.annotations.Test;

public class CheckoutTest extends Testbase{

    Homepage homepage;
    SearchPage searchPage;
    Signinpage signinpage;
    ProductDetailsPage details;
    CheckoutPage checkout;

    @Test(priority = 0)
    public void signin(){
        homepage = new Homepage(driver);
        homepage.movetosignin();
        signinpage = new Signinpage(driver);
        signinpage.emailsign("anterm386@gmail.com");
        signinpage.passwordsignin("m01205456797");
    }
    @Test(priority = 1)
    public void search_products() throws InterruptedException {
        searchPage = new SearchPage(driver);
        homepage = new Homepage(driver);
        homepage.searchproduct("apple watch");
        Thread.sleep(3000);
        searchPage.usersearchbyautocomplete();
        Thread.sleep(3000);
        searchPage.movetoproductpage();
        Thread.sleep(3000);
    }
    @Test(priority = 2)
    public void addingtocart() throws InterruptedException {
        details = new ProductDetailsPage(driver);
        details.add_to_cart();
        Thread.sleep(3000);
        details.movetocartlistpage();
        Thread.sleep(3000);
        details.movetocheckoutpage();
    }
    @Test(priority = 3)
    public void usercancompletecheckout() throws InterruptedException {
        checkout = new CheckoutPage(driver);
        checkout.completecheckout("22/ss/33","122","new mexico","1222");
        Thread.sleep(3000);


    }

}
