package test;

import Pages.Homepage;
import Pages.SearchPage;
import Pages.Signinpage;
import org.testng.annotations.Test;

public class Searchproductest extends Testbase{
    Homepage homepage;
    SearchPage searchPage;
    Signinpage signinpage;

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

}
