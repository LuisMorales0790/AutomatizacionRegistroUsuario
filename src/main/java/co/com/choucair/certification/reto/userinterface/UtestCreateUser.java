package co.com.choucair.certification.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

public class UtestCreateUser extends PageObject {

    public static final Target RESPONSE_CREATE_USER = Target.the("gets successful user creation response").located(By.xpath("//p[@class='welcome-lead']/b[contains(text(),'First, please check your email inbox')]"));
}
