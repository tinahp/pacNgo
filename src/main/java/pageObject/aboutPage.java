package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class aboutPage {

    public WebDriver driver;

    public aboutPage(WebDriver driver) {this.driver = driver;}

    //locate the element
    private By ClickAbout = By.cssSelector("li[id='menu-item-525'] span[class='aux-menu-label']");

    //Action the Element
    public void AboutClick() {
        driver.findElement(ClickAbout).click();
    }

    public ServicePage Clickservice() {
        driver.findElement(ClickAbout).click();
        return new ServicePage(driver);


    }
}