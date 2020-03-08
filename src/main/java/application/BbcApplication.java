package application;
import pages.BbcHomePage;

public class BbcApplication
{
    public static BbcHomePage bbcHomePage;

    static
    {
        bbcHome();
    }
    public static void bbcHome()
    {
        bbcHomePage = new BbcHomePage();
    }
}