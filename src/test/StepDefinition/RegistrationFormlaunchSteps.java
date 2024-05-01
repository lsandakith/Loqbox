import cucumber.api.java.en.*;


public class RegistrationFormSteps extends BaseTest{


    @Given("I launch the Chrome browser")
    public void i_launch_the_chrome_browser() {
        BaseTest BT= New BaseTest();
        BT.Setup();
    }

    @When("I navigate to the Loqbox website")
    public void i_navigate_to_the_loqbox_website() {
        driver.get("https://app.uk.loqbox.com/signup/create-account");
        BT.waitForElement();
    }

    @Then("I verify that the registration form is present on the webpage")
    public void i_verify_that_the_registration_form_is_present_on_the_webpage() {
        String expectedResult ="Loqbox"
        String ActulaResult = driver.get.title();
        Assert.assertEquals(ActulaResult,expectedResult)
    }

    @And("I close the browser")
    public void i_close_the_browser() {
        driver.quit();
    }

}
