package steps;

import PageObjects.FactoryClass;
import PageObjects.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class LoginSteps {

    private LoginPage loginPage;
    WebDriver driver;

    public LoginSteps() {
        driver = FactoryClass.getDriver();
        loginPage = new LoginPage(driver);
    }

    @Given("I am on login page")
    public void i_am_on_login_page() {
        loginPage.onLoginPage();
    }

    @When("I entered login credentials")
    public void i_entered_login_credentials(DataTable dataTable) {
        List<Map<String, String>> userData = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> data : userData) {
            String userName = data.get("username");
            String password = data.get("password");
            loginPage.enterDetails(userName, password);
        }
    }

    @Then("I click on Login button")
    public void i_click_on_Login_button() {
        loginPage.clickLogin();
    }
}
