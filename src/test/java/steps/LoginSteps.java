package steps;

import PageObjects.LoginPage;
import hooks.StepHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

   private LoginPage loginPage;

   public LoginSteps(){

    loginPage = new LoginPage(StepHooks.getDriver());
   }

    @Given("I am on login page")
    public void i_am_on_login_page() {
      /*  WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);*/
        loginPage.onLoginPage();
    }

    @When("I entered login credentials")
    public void i_entered_login_credentials() {

       // loginPage.enterDetails(userName,password);
    }

    @Then("I click on Login button")
    public void i_click_on_Login_button() {
        loginPage.clickLogin();
    }
}
