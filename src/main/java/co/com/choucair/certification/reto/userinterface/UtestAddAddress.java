package co.com.choucair.certification.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestAddAddress extends PageObject {

    public static final Target INPUT_CITY = Target.the("where do we write the City").located(By.id("city"));

    public static final Target INPUT_POSTAL_CODE = Target.the("where do we write the City").located(By.id("zip"));

    public static final Target SELECT_COUNTRY_1 = Target.the("select to choose a country").located(By.xpath("//div[@aria-label='Select a country']"));
    public static final Target SELECT_COUNTRY_2 = Target.the("select to choose a country").located(By.xpath("//div[contains(text(),'Panama')]"));

    public static final Target ENTER_BUTTON = Target.the("button to continue with the registration").located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Next: Devices')]"));

}
