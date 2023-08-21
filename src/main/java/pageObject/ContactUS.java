package pageObject;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUS {

    //Instantiate Webdriver
    public WebDriver driver;

    public ContactUS(WebDriver driver) {this.driver =driver;}

    //locate web Element
    private By Contactclick = By.cssSelector("body > div:nth-child(9) > header:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > section:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > nav:nth-child(2) > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1) > span:nth-child(1)");

    //Ask FAQ
    private By First= By.cssSelector("input[placeholder='Your Name*']");
    private By Email =By.cssSelector("input[placeholder='Your Email*']");
    private By Question = By.cssSelector("textarea[placeholder='Question*']");
    private By Sub =By.cssSelector("input[value='Send A Message']");

    //Click Apply
    private By  ClickApply = By.xpath("//a[@role='button']");

    //Action Web Element
    public void ClickContact(){driver.findElement(Contactclick).click();}
    public void fName(){driver.findElement(First).sendKeys("jude");}
    public void eAddress(){driver.findElement(Email).sendKeys("Juddy@yahoo.com");}
    public void Equestion(){driver.findElement(Question).sendKeys("Do you process visas aswell?");}
    //String expectedTitle = "Thank you for your message. It has been sent";
    public void Submit(){driver.findElement(Sub).click();}
    //String actualTitle = driver.getTitle();
    //Assert.assert


    ///Step2
    public void ApplyClick(){driver.findElement(ClickApply).click();}


    public applyHere Apply(){driver.findElement(ClickApply).click();
    return  new applyHere(driver);
    }


}
