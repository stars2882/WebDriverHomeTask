package page;

import org.testng.annotations.Test;

public class TestPage extends ConfigPage{
    private final static String KEYWORD = "image";

    @Test(priority = 1)
    public void searchAndCheckTabImages(){
        getHomePage().enterSearchWord(KEYWORD);
        getHomePage().clickOnTabImage();
        getHomePage().checkDisplayImage();
    }
}
