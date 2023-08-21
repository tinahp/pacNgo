package testSuites;

import baseClass.baseClassTest;
import com.aventstack.extentreports.ExtentReports;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.ContactUS;
import pageObject.ServicePage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class WebpageTest extends baseClassTest{

    @BeforeTest
    public void innit (){

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @Test(priority = 0 )
    public void FirstCheck() throws InterruptedException {
        Hompage.ClickHome();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

    }
        @Test(priority = 1)
    public void AboutCheck() throws InterruptedException {
            aboutPage.AboutClick();
            Thread.sleep(500);
        }
        @Test(priority = 2)
        public void ServiceCheck() throws InterruptedException{
            Servicepage.ServiceClick();
            Thread.sleep(500);

    }
    @Test(priority = 3)
    public void ContactUscheck() throws InterruptedException {
        ContactUS contactUS = new ContactUS(driver);
        //Select  contact type
        ContactUS.ClickContact();
        Thread.sleep(500);
        ContactUS.fName();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        ContactUS.eAddress();
        Thread.sleep(2000);
        ContactUS.Equestion();
        Thread.sleep(2000);
        ContactUS.Submit();
        System.out.println("Thank you for your message. It has been sent");
        String expectedTitle = "Contact - pacngo";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

    }
        @Test(priority = 4)
        public void applyherecheck() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        applyHere.CCapply();
        Thread.sleep(3000);
        applyHere.ClickTitle();
        Thread.sleep(1000);
        applyHere.Fname();
        Thread.sleep(1000);
        applyHere.MidName();
        Thread.sleep(1000);
        applyHere.lNmae();
        Thread.sleep(500);
        applyHere.Email();
        Thread.sleep(500);
        applyHere.number();
        Thread.sleep(500);
        applyHere.NStreet();
        Thread.sleep(500);
        applyHere.Ccity();
        Thread.sleep(500);
        applyHere.CState();
        Thread.sleep(500);
        applyHere.Zzip();
        Thread.sleep(500);
        applyHere.CSelect();
        Thread.sleep(500);
        applyHere.Ncouzntry();
        Thread.sleep(500);
        applyHere.Dgree();
        Thread.sleep(500);
        applyHere.Ptext();
        Thread.sleep(500);
        applyHere.Ttext();
        Thread.sleep(500);
        applyHere.Ssub();

        driver.close();

    }

}

