package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hompage {
    //instantiate Web driver

    public WebDriver driver;

    public Hompage(WebDriver driver) {this.driver = driver;}

    //locate the web Element
    private By HomeClick = By.cssSelector("li[class='menu-item menu-item-type-post_type menu-item-object-page menu-item-home current-menu-item page_item page-item-46 current_page_item menu-item-524 aux-menu-depth-0 aux-menu-root-1 aux-menu-item'] span[class='aux-menu-label']");

    //Action  WebElement
    public void ClickHome (){driver.findElement(HomeClick).click();}


    public aboutPage ClickAbout() {driver.findElement(HomeClick).click();
        return new aboutPage(driver);


}

}
