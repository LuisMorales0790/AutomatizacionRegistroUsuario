package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.UtestAddAddress;
import co.com.choucair.certification.reto.userinterface.UtestDevices;
import cucumber.api.java.hu.De;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Devices implements Task {

    private String strComputer;
    private String strVersion;
    private String strLanguage;
    private String strMobile;
    private String strModel;
    private String strOS;

    public Devices(String strComputer, String strVersion, String strLanguage, String strMobile, String strModel, String strOS){
        this.strComputer = strComputer;
        this.strVersion = strVersion;
        this.strLanguage = strLanguage;
        this.strMobile = strMobile;
        this.strModel = strModel;
        this.strOS = strOS;

    }

    public static Devices yourDevices(String strComputer, String strVersion, String strLanguage, String strMobile, String strModel, String strOS) {
        return Tasks.instrumented(Devices.class, strComputer, strVersion, strLanguage, strMobile, strModel, strOS);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestDevices.SELECT_COMPUTER_1),
                Enter.theValue(strComputer).into(UtestDevices.SELECT_COMPUTER_2),
                Hit.the(Keys.ENTER).into(UtestDevices.SELECT_COMPUTER_2),

                Click.on(UtestDevices.SELECT_VERSION_1),
                Enter.theValue(strVersion).into(UtestDevices.SELECT_VERSION_2),
                Hit.the(Keys.ENTER).into(UtestDevices.SELECT_VERSION_2),

                Click.on(UtestDevices.SELECT_LANGUAGE_1),
                Enter.theValue(strLanguage).into(UtestDevices.SELECT_LANGUAGE_2),
                Hit.the(Keys.ENTER).into(UtestDevices.SELECT_LANGUAGE_2),

                Click.on(UtestDevices.SELECT_MOBILE_1),
                Enter.theValue(strMobile).into(UtestDevices.SELECT_MOBILE_2),
                Hit.the(Keys.ENTER).into(UtestDevices.SELECT_MOBILE_2),

                Click.on(UtestDevices.SELECT_MODEL_1),
                Enter.theValue(strModel).into(UtestDevices.SELECT_MODEL_2),
                Hit.the(Keys.ENTER).into(UtestDevices.SELECT_MODEL_2),

                Click.on(UtestDevices.SELECT_OPERATING_SYSTEM_1),
                Enter.theValue(strOS).into(UtestDevices.SELECT_OPERATING_SYSTEM_2),
                Hit.the(Keys.ENTER).into(UtestDevices.SELECT_OPERATING_SYSTEM_2),


                Click.on(UtestDevices.ENTER_NEXT_LAST_STEP)
        );
    }
}
