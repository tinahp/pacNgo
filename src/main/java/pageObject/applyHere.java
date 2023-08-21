package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class applyHere<drpCountry, list> {

    public WebDriver driver;

    public applyHere(WebDriver driver) {
        this.driver = driver;
    }

    //locate Webelement on Webpage
    private By ApplyC =By.xpath("//span[@class='aux-text-before']");
    //private By Title = By.cssSelector("span[aria-labelledby*=select2-forminator-form-581__field--name-1_642c6f633f46b-container] ");
    //private By Ntitle = By.cssSelector("#select2-forminator-form-581__field--name-1_642b31a43989c-container");
    // private By ClickMr = By.cssSelector("span[class='select2 select2-container forminator-select forminator-select-dropdown-container--below select2-container--focus'] span[class='forminator-icon-chevron-down']");
    //private  By FirstName = By.xpath("//input[@id='forminator-field-first-name-1_642b31a43989c']");
    private By FirstName = By.cssSelector("input[name*=name-1-first-name] ");
    private By MiddName = By.cssSelector("input[placeholder='E.g. Smith']");
    private By LastName = By.xpath("//input[@placeholder='E.g. Doe']");
    private By EmailAddress = By.cssSelector("input[placeholder='E.g. john@doe.com']");
    private By PhoneNo = By.cssSelector("input[placeholder='E.g. +1 300 400 5000']");
    private By Street = By.xpath("//input[@placeholder='E.g. 42 Wallaby Way']");
    private By City = By.xpath("//input[@placeholder='E.g. Sydney']");
    private By State = By.cssSelector("input[placeholder='E.g. New South Wales']");
    private By Zip = By.cssSelector("input[placeholder='E.g. 2000']");
    private By Ctitle = By.xpath("//span[@title='Select country']");
    private By Country = By.xpath("//span[@class='select2-selection__placeholder']");
    private By Degree = By.xpath("//span[@title='Foundation']");
    private By PrefeCourse = By.xpath("//input[@placeholder='E.g. The course you want']");
    private By Text = By.cssSelector("textarea[placeholder='E.g. text placeholder You can add new line']");
    private By Sub = By.xpath("//button[@class='forminator-button forminator-button-submit']");

    //  By.xpath("//span[@title='Mr.']");

    //Action  Webelement
    public void CCapply() throws InterruptedException{
       driver.findElement(ApplyC).click();
    }
    public void ClickTitle() throws InterruptedException {
        WebElement dpdown = driver.findElement(By.name("name-1-prefix"));
        Select select = new Select(dpdown);
        select.selectByValue("Mrs.");
        Thread.sleep(1000);
        select.selectByVisibleText("select2-data-25-gdk5");
        Thread.sleep(2000);
        select.selectByIndex(3);
    }
    public void Fname(){ driver.findElement(FirstName).sendKeys("John");}
    public void MidName(){ driver.findElement(MiddName).sendKeys("James");}
    public void lNmae(){ driver.findElement(LastName).sendKeys("Jerry");}
    public void Email(){ driver.findElement(EmailAddress).sendKeys("John02@gmail.com");}
    public void number(){ driver.findElement(PhoneNo).sendKeys("07785248956");}
    public void NStreet(){ driver.findElement(Street).sendKeys("8 Gbagada street old GRA");}
    public void Ccity(){ driver.findElement(City).sendKeys("Lagos");}
    public void CState(){ driver.findElement(State).sendKeys("lagos State");}
    public void Zzip(){ driver.findElement(Zip).sendKeys("40170");}
    public void CSelect(){driver.findElement(Ctitle).click();}
    public void Ncouzntry(){ driver.findElement(Country).click();}
    public void Dgree(){driver.findElement(Degree).click();}
    public void Ptext(){driver.findElement(PrefeCourse).sendKeys("Biology");}
    public void Ttext(){driver.findElement(Text).sendKeys("i would like to make an enquiry");}
    public void Ssub(){driver.findElement(Sub).click();}}



