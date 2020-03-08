package testexecution;

import org.junit.After;
import org.junit.Before;
import utility.WebDriverHelper;

import java.net.MalformedURLException;

public class TestRunner {

    //Defines the common Before/After annotations that


    @Before
    public void testSetup() throws MalformedURLException {

        WebDriverHelper.setupDriver("Chrome");
        WebDriverHelper.locateUrl("https://www.bbc.co.uk/");

    }

    @After
    public void testTeardown() {

       WebDriverHelper.closeDriver();
    }



}
