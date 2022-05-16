package test;

import Pages.ChangelanguagePage;
import Pages.Homepage;
import org.testng.annotations.Test;

public class ChangelanguageTest extends Testbase{
    Homepage homepage;
    ChangelanguagePage language;

    @Test
    public void usercanchangelanguage() throws InterruptedException {
        homepage = new Homepage(driver);
        homepage.movetolanguagesPage();
        Thread.sleep(3000);
        language = new ChangelanguagePage(driver);
        language.changetoarabic();
        Thread.sleep(3000);
        language.submitchange();
        Thread.sleep(30000);
    }
    @Test
    public void usercanchangecurrency() throws InterruptedException {
        homepage = new Homepage(driver);
        homepage.movetolanguagesPage();
        language = new ChangelanguagePage(driver);
        language.changecurrency();
        Thread.sleep(10000);
        language.submitchange();
        Thread.sleep(3000);


    }

}
