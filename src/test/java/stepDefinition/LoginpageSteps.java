package stepDefinition;

//import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.*;

public class LoginpageSteps {
	
	private LoginPage lp = new LoginPage(DriverFactory.getDriver());
	

@Given("user is on login page")
public void user_is_on_login_page() {
	 DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com");
}

  @When("user clicks get button")
    public void user_clicks_get_button() {
   lp.button();

System.out.println("hi");
  }
  
   @When("user clicks on signin button")
   public void user_clicks_on_sign_in_button() {
      lp.signin(); ///ttttttttttttttttttt
   }
   
   @When("user enters username and password")
   public void user_enters_username_and_password() {
      lp.username();
      lp.lastname();
      }
  
   @Then("user clicks on login button")
   public void user_clicks_on_login_button() {
      lp.login();
   }
   
   @Then("user launches home page")
   public void user_launches_home_page() {
       
   }

}

