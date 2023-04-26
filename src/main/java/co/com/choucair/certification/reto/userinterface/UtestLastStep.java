package co.com.choucair.certification.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestLastStep extends PageObject {

    public static final Target INPUT_CREATE_PASSWORD = Target.the("where do we write the password").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where do we write the confirm password").located(By.id("confirmPassword"));
    public static final Target CHECKBOX_STAY_INFORMED = Target.the("check to stay informed by mail").located(By.name("newsletterOptIn"));
    public static final Target CHECKBOX_UTEST_TERMS = Target.the("check the terms of condition").located(By.name("termOfUse"));
    public static final Target CHECKBOX_UTEST_POLICY = Target.the("check the privacy & security policy").located(By.name("privacySetting"));
    public static final Target ENTER_BUTTON = Target.the("button to complete setup").located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Complete Setup')]"));

}
