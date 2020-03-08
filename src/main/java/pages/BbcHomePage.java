package pages;


import element.Element;
import org.openqa.selenium.By;


public class BbcHomePage {

    public Element sportLink = new Element(By.className("orb-nav-sport"));


    public void sportClick()
    {
        sportLink.click();

    }
}