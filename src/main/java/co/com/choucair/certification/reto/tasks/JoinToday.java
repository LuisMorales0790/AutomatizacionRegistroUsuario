package co.com.choucair.certification.reto.tasks;

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

public class JoinToday implements Task {

    private String strFirstName;
    private String strLastName;
    private String strEmailAddress;
    private String strMonthBirth;
    private int intDayBirth;
    private int intYearBirth;
    private String strLangSpoken;

    public JoinToday(String strFirstName, String strLastName, String strEmailAddress, String strMonthBirth, int intDayBirth, int intYearBirth, String strLangSpoken) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmailAddress = strEmailAddress;
        this.strMonthBirth = strMonthBirth;
        this.intDayBirth = intDayBirth;
        this.intYearBirth = intYearBirth;
        this.strLangSpoken = strLangSpoken;
    }

    public static JoinToday onThePage(String strFirstName, String strLastName, String strEmailAddress, String strMonthBirth, int intDayBirth, int intYearBirth, String strLangSpoken){

        return Tasks.instrumented(JoinToday.class,strFirstName, strLastName, strEmailAddress, strMonthBirth, intDayBirth, intYearBirth, strLangSpoken);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegisterPage.JOIN_BUTTON),
                Enter.theValue(strFirstName).into(UtestRegisterPage.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(UtestRegisterPage.INPUT_LAST_NAME),
                Enter.theValue(strEmailAddress).into(UtestRegisterPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strMonthBirth).from(UtestRegisterPage.SELECT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText(String.valueOf(intDayBirth)).from(UtestRegisterPage.SELECT_BIRTH_DAY),
                SelectFromOptions.byVisibleText(String.valueOf(intYearBirth)).from(UtestRegisterPage.SELECT_BIRTH_YEAR),
                Scroll.to(UtestRegisterPage.ENTER_BUTTON),

                Click.on(UtestRegisterPage.SELECT_LANGUAGE_SPOKEN_1),
                Enter.theValue(strLangSpoken).into(UtestRegisterPage.SELECT_LANGUAGE_SPOKEN_2),
                Hit.the(Keys.ENTER).into(UtestRegisterPage.SELECT_LANGUAGE_SPOKEN_2),

                Click.on(UtestRegisterPage.ENTER_BUTTON)
        );
    }
}
