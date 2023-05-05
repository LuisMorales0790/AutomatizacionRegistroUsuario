package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.UtestAddAddress;
import co.com.choucair.certification.reto.userinterface.UtestDevices;
import co.com.choucair.certification.reto.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddAddress implements Task {

    private String strCity;
    private String strPostalCode;
    private String strCountry;


    public AddAddress(String strCity, String strPostalCode, String strCountry) {
        this.strCity = strCity;
        this.strPostalCode = strPostalCode;
        this.strCountry = strCountry;
    }

    public static AddAddress addYourAddress(String strCity, String strPostalCode, String strCountry) {

        return Tasks.instrumented(AddAddress.class, strCity, strPostalCode, strCountry);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestAddAddress.INPUT_CITY),
                Enter.theValue(strCity).into(UtestAddAddress.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(UtestAddAddress.INPUT_CITY),
                Hit.the(Keys.ENTER).into(UtestAddAddress.INPUT_CITY),

                Enter.theValue(strPostalCode).into(UtestAddAddress.INPUT_POSTAL_CODE),

                 Click.on(UtestAddAddress.SELECT_COUNTRY_1),
                 Click.on(UtestAddAddress.SELECT_COUNTRY_2),
                 Enter.theValue(strCountry).into(UtestAddAddress.SELECT_COUNTRY_2),

                Click.on(UtestAddAddress.ENTER_BUTTON)
        );

    }
}
