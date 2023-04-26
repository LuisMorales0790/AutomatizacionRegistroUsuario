package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.UtestLastStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LastSep implements Task {

    private String strPassword;
    private String strConfirmPassword;

    public LastSep(String strPassword, String strConfirmPassword) {
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }


    public static LastSep theLastStep(String strPassword, String strConfirmPassword) {

        return Tasks.instrumented(LastSep.class,strPassword,strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestLastStep.INPUT_CREATE_PASSWORD),
                Enter.theValue(strPassword).into(UtestLastStep.INPUT_CREATE_PASSWORD),
                Enter.theValue(strConfirmPassword).into(UtestLastStep.INPUT_CONFIRM_PASSWORD),
                Click.on(UtestLastStep.CHECKBOX_STAY_INFORMED),
                Click.on(UtestLastStep.CHECKBOX_UTEST_TERMS),
                Click.on(UtestLastStep.CHECKBOX_UTEST_POLICY),
                Click.on(UtestLastStep.ENTER_BUTTON)
        );
    }
}
