package co.com.choucair.certification.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterPage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("button that shows the form to register").located(By.xpath("//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//a[contains(text(),'Join Today')]"));

    public static final Target INPUT_FIRST_NAME = Target.the("where do we write the First name").located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME = Target.the("where do we write the Last name").located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("where do we write the Email").located(By.id("email"));

    public static final Target SELECT_BIRTH_MONTH = Target.the("where do we write the Birth Month").located(By.cssSelector("select#birthMonth"));

    public static final Target SELECT_BIRTH_DAY = Target.the("where do we write the Birth Day").located(By.cssSelector("select#birthDay"));

    public static final Target SELECT_BIRTH_YEAR = Target.the("where do we write the Birth Year").located(By.cssSelector("select#birthYear"));

    public static final Target SELECT_LANGUAGE_1 = Target.the("select a language").located(By.id("languages"));
    public static final Target SELECT_LANGUAGE_2 = Target.the("select a language").located(By.xpath("//div[contains(text(),'Italian')]"));

    public static final Target ENTER_BUTTON = Target.the("button to confirm register").located(By.xpath("//*[@class='btn btn-blue']"));

}
