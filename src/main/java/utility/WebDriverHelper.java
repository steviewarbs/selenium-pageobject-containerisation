package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverHelper {

    public static final String CHROME_DRIVER = System.getProperty("user.dir") + "/drivers/chromedriver";


    public static WebDriver driver;

                /*Below code allows this to run as a Selenium project with external docker containers.
            To start the selenium-hub run the following commands:

            sudo docker run -d -p 4545:4444 --name selenium-hub selenium/hub (Starts selenium hu on localhost:4545
            sudo docker run -d -P --link  selenium-hub:hub selenium/node-chrome-debug (Starts Chrome node with port)
            Run VNC.deb file to view application running locally.
            Point RemoteWebDriver at http://localhost:4545/wd/hub */

    public static void setupDriver(String browser) throws MalformedURLException {


        if(browser.equalsIgnoreCase("Chrome")) {

            System.setProperty("webdriver.chrome.driver", CHROME_DRIVER);

            DesiredCapabilities cap = new DesiredCapabilities();
           cap.setBrowserName(BrowserType.CHROME);
           driver = new RemoteWebDriver(new URL("http://localhost:4545/wd/hub"),cap);

        }

        driver.manage().window().maximize();

    }

    public static void locateUrl(String url) {

        driver.get(url);

    }

    public static void closeDriver() {

        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();

    }

}
