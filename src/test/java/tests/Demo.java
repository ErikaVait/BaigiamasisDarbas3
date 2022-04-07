package tests;
import org.testng.annotations.Test;
import pages.Common;
import utils.Driver;

public class Demo {
    @Test
    public void testDemo(){
        Driver.initialize();
        Common.openLink("https://www.google.lt/?hl=lt");

        //Driver.quit();
    }
}
