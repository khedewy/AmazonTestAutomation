package test;

import Pages.Homepage;
import Pages.ProductDetailsPage;
import Pages.SearchPage;
import Pages.Signinpage;
import org.testng.annotations.Test;

public class AddtocartTest extends Testbase{
    Homepage homepage;
    SearchPage searchPage;
    Signinpage signinpage;
    ProductDetailsPage details;

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
}
