package Pages;

import BaseTest.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationFormPage extends BaseTest {

    @FindBy(xpath = "//input[@id='signup/create-account/first-name']")
    public WebElement firstname;

    @FindBy(xpath = "//input[@id='signup/create-account/last-name']")
    public WebElement lastname;

    @FindBy(xpath = "//input[@id='signup/create-account/email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='signup/create-account/password']")
    public WebElement password;

    @FindBy(xpath = "//body/div[@id='app']/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    public WebElement birthday;

    @FindBy(xpath = "//input[@id='signup/create-account/phone']")
    public WebElement phone;

    @FindBy(xpath = "//input[@id='signup/create-account/building-name']")
    public WebElement BuildingName;

    @FindBy(xpath = "//input[@id='signup/create-account/post-code']")
    public WebElement postcode;

    @FindBy(xpath = "//p[contains(text(),'Look up')]")
    public WebElement LookupBtn;

    @FindBy(xpath = "//body/div[@id='app']/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1]")
    public WebElement ChooseAddr;

    @FindBy(xpath = "//input[@id='signup/create-account/building-number']")
    public WebElement BuildingNumber;

    @FindBy(xpath = "//input[@id='signup/create-account/address-line-1']")
    public WebElement AddLine1;

    @FindBy(xpath = "//input[@id='signup/create-account/address-line-2']")
    public WebElement AddLine2;

    @FindBy(xpath = "//input[@id='signup/create-account/town-city']")
    public WebElement City;


    @FindBy(xpath = "//body/div[@id='app']/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[3]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/input[1]")
    public WebElement Country;

    @FindBy(xpath = "//body/div[@id='app']/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]")
    public WebElement NextBtn;

    @FindBy(xpath = "//p[contains(text(),'Every point matters')]")
    public  WebElement paymentpage

    public SelectbookPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }





}
