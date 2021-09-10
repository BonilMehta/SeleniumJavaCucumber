package StepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

		@Given("Twitter login page is open in browser")
		public void LoginPage() {System.out.println("Loginpage");}
		@When("User Enters username and pwd")
		public void UsernamePassword() {System.out.println("Uname and password added");}
		@And("User Click on Login button")
		public void LoginButton() {System.out.println("Login button clicked");}
		@Then("User can see home page of twitter")
		public void HomePage() {System.out.println("Home page displayed");}
				
	}

