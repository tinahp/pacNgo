package baseClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import pageObject.*;


public class baseClassTest {

    public static WebDriver driver;

    public static WebDriver startdriver(String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            driver = new ChromeDriver();
        } else
            return driver;
        return null;
    }

    //ExtentTest test;
    //ExtentReports reports;
    //extentManager ExtentManager = new extentManager();
    // Create a Landing page
    protected Hompage Hompage;
    protected aboutPage aboutPage;
    protected ServicePage Servicepage;
    protected ContactUS ContactUS;
    protected applyHere applyHere;

    @BeforeTest
    public void SetUp() {
       // reports = ExtentManager.getReports();
       // test = reports.createTest("BaseClassTest");
        //Set Chrome Browser
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        // maximize window
        driver.manage().window().maximize();
        //Open the page URL
        driver.get("https://pacngo.ng/");
       // test.log(Status.INFO, "Starting test case Home_button");


        //Instantiate HomePage after launching the browser
        Hompage = new Hompage(driver);
        aboutPage =new aboutPage(driver);
        Servicepage = new ServicePage(driver);
        ContactUS = new ContactUS(driver);
        applyHere =new applyHere(driver);
    }
}
