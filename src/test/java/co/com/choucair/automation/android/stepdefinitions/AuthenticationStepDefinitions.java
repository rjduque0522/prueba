package co.com.choucair.automation.android.stepdefinitions;

import co.com.choucair.automation.android.question.VarifyWith;
import co.com.choucair.automation.android.tasks.Login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class AuthenticationStepDefinitions {
    @Given("^en that (.*)wants to enter the Wordpress application$")
    public void enThatBrandonWantsToEnterTheWordpressApplication() {
        OnStage.theActorCalled("brandon").wasAbleTo();
    }

    @When("^I login with the username \"([^\"]*)\" and the password \"([^\"]*)\"$")
    public void iLoginWithTheUsernameAndThePassword(String user, String password) {
        //se llama al actor a la escena para que este atento a iniciar
        //sesión con usuario y contraseña
    OnStage.theActorInTheSpotlight().attemptsTo(Login.with(user,password));
    }

    @Then("^you should see the login in the application with the message Logged in as(.*)$")
    public void youShouldSeeTheLoginInTheApplicationWithTheMessageLoggedInAs(String question) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VarifyWith.the(question)));

    }
}
