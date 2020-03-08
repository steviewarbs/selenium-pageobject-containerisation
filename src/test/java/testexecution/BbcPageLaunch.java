package testexecution;

import application.BbcApplication;
import org.junit.Test;

public class BbcPageLaunch extends TestRunner {
    //Runs the tests with either mvn-test from the terminal extends the Before/After annotations from TestRunner

    @Test
    public void openPageClickSports() {
        BbcApplication.bbcHomePage.sportClick();

    }

}