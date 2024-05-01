import cucumber.api.java.en.*;


public class RegistrationFormSteps extends  BaseTest {

    WebDriver driver;
    RegistrationFormPage registrationForm;

    public RegistrationSteps() {
        this.driver = BaseTest.getDriver();
        registrationForm = new RegistrationFormPage(driver);
    }


    @Given("I launch the Chrome browser")
    public void launchChromeBrowser() {
        BaseTest BT= New BaseTest();
        BT.Setup();
    }

    @And("I navigate to the Loqbox website")
    public void navigateToLoqboxWebsite() {
        driver.get("https://app.uk.loqbox.com/signup/create-account");
        BT.waitForElement();
    }

    @When("^I fill registration details for \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", and \"([^\"]*)\"$")
    public void fillRegistrationDetails(String firstName, String lastName, String email, String password, String birthday, String phone, String buildingName, String postcode, String chooseAddr, String buildingNumber, String addLine1, String addLine2, String city, String country, String nextBtn) {
        registrationForm.firstname.sendKeys(firstName);
        registrationForm.lastname.sendKeys(lastName);
        registrationForm.email.sendKeys(email);
        registrationForm.password.sendKeys(password);
        registrationForm.birthday.sendKeys(birthday);
        registrationForm.phone.sendKeys(phone);
        registrationForm.BuildingName.sendKeys(buildingName);
        registrationForm.postcode.sendKeys(postcode);
        registrationForm.ChooseAddr.sendKeys(chooseAddr);
        registrationForm.BuildingNumber.sendKeys(buildingNumber);
        registrationForm.AddLine1.sendKeys(addLine1);
        registrationForm.AddLine2.sendKeys(addLine2);
        registrationForm.City.sendKeys(city);
        registrationForm.Country.sendKeys(country);

    }

   @And("I click on the Next button")
   public void verifyNextPageNavigationbutton() {
       registrationForm.NextBtn.click();
       BT.waitForElement();
    }

    @Then("the system navigates to the next page")
    public void verifyNextPageNavigation() {
        Assert.assertTrue(paymentpage)
    }

    @And("the user can see the payment details form")
    public void verifyPaymentDetailsForm() {
       // Assert.assertTrue(paymentpage)
    }

    @And("I close the browser")
    public void closeBrowser() {
        driver.quit();
    }

}
