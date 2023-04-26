package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.UtestDevices;
import cucumber.api.java.hu.De;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Devices implements Task {
    public static Devices yourDevices() {
        return Tasks.instrumented(Devices.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestDevices.SELECT_COMPUTER_1),
                MoveMouse.to(UtestDevices.SELECT_COMPUTER_2).andThen(actions -> actions.click()),

                Click.on(UtestDevices.SELECT_VERSION_1),
                MoveMouse.to(UtestDevices.SELECT_VERSION_2).andThen(actions -> actions.click()),

                Click.on(UtestDevices.SELECT_LANGUAGE_1),
                MoveMouse.to(UtestDevices.SELECT_LANGUAGE_2).andThen(actions -> actions.click()),

                Click.on(UtestDevices.SELECT_MOBILE_1),
                WaitUntil.the(UtestDevices.SELECT_MOBILE_2, isVisible()),
                MoveMouse.to(UtestDevices.SELECT_MOBILE_2).andThen(actions -> actions.click()),

                Click.on(UtestDevices.SELECT_MODEL_1),
                WaitUntil.the(UtestDevices.SELECT_MODEL_2, isVisible()),
                MoveMouse.to(UtestDevices.SELECT_MODEL_2).andThen(actions -> actions.click()),

                Click.on(UtestDevices.SELECT_OPERATING_SYSTEM_1),
                MoveMouse.to(UtestDevices.SELECT_OPERATING_SYSTEM_2).andThen(actions -> actions.click()),

                Click.on(UtestDevices.ENTER_NEXT_LAST_STEP)
        );
    }
}
