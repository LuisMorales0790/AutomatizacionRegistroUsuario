package co.com.choucair.certification.reto.stepdefinitions;

import co.com.choucair.certification.reto.model.UtestData;
import co.com.choucair.certification.reto.questions.CreateUser;
import co.com.choucair.certification.reto.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than luis wants to register on the utest page$")
    public void thanLuisWantsToRegisterOnTheUtestPage() {
        OnStage.theActorCalled("luis").wasAbleTo(OpenUp.thePage());

    }

    @When("^you access the utest page$")
    public void youAccessTheUtestPage(List<UtestData> utestData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(JoinToday.onThePage(utestData.get(0).getStrFirstName(), utestData.get(0).getStrLastName(), utestData.get(0).getStrEmailAddress(), utestData.get(0).getStrMonthBirth(), utestData.get(0).getIntDayBirth(), utestData.get(0).getIntYearBirth()),
              AddAddress.addYourAddress(utestData.get(0).getStrCity(), utestData.get(0).getStrPostalCode()),
                Devices.yourDevices(),
                LastSep.theLastStep(utestData.get(0).getStrPassword(), utestData.get(0).getStrConfirmPassword())
        );

    }

    @Then("^create a new user on the utest page$")
    public void createANewUserOnTheUtestPage(List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CreateUser.toThe(utestData.get(0).getStrMessage()))
        );
    }

} //strMessage
