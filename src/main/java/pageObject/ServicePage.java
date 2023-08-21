package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ServicePage {

    //Instantiate Webdriver
    public WebDriver driver;

    public ServicePage(WebDriver driver) {this.driver =driver;}

    //locate element
    private By ClickService =By.cssSelector("li[class='menu-item menu-item-type-post_type menu-item-object-page menu-item-527 aux-menu-depth-0 aux-menu-root-3 aux-menu-item'] span[class='aux-menu-label']");

    //Action The element
    public void ServiceClick(){driver.findElement(ClickService).click();}

    public ContactUS clickContact(){driver.findElement(ClickService).click();
    return new ContactUS(driver);

    }


}
