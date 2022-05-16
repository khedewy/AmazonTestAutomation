package test;

import Pages.Changelanguagebyhover;
import org.testng.annotations.Test;

public class ChangelanguagehoverTest extends Testbase{
    Changelanguagebyhover hover;

    @Test
    public void usercanchangelanguage() throws InterruptedException {
        hover = new Changelanguagebyhover(driver);
        hover.movetoarbiclanguage();
    }
}
