package co.com.choucair.certification.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestDevices extends PageObject {

    public static final Target SELECT_COMPUTER_1 = Target.the("select your computer").located(By.xpath("//div[@placeholder='Select OS']"));
    public static final Target SELECT_COMPUTER_2 = Target.the("select your computer").located(By.xpath("//div[contains(text(),'Windows')]"));

    public static final Target SELECT_VERSION_1 = Target.the("select version").located(By.xpath("//div[@placeholder='Select a Version']"));
    public static final Target SELECT_VERSION_2 = Target.the("select version").located(By.xpath("//div[contains(text(),'Windows 10')]"));

    public static final Target SELECT_LANGUAGE_1 = Target.the("select language").located(By.xpath("//div[@placeholder='Select OS language']"));
    public static final Target SELECT_LANGUAGE_2 = Target.the("select language").located(By.xpath("//div[contains(text(),'Spanish')]"));

    public static final Target SELECT_MOBILE_1 = Target.the("select your moblie device").located(By.xpath("//div[@placeholder='Select Brand']"));
    public static final Target SELECT_MOBILE_2 = Target.the("select your moblie device").located(By.xpath("//div[contains(text(),'Xiaomi')]"));

    public static final Target SELECT_MODEL_1 = Target.the("select model").located(By.xpath("//div[@placeholder='Select a Model']"));
    public static final Target SELECT_MODEL_2 = Target.the("select model").located(By.xpath("//div[contains(text(),'Mi5')]"));

    public static final Target SELECT_OPERATING_SYSTEM_1 = Target.the("select operating system").located(By.xpath("/descendant::div[@placeholder='Select OS'][2]"));
    public static final Target SELECT_OPERATING_SYSTEM_2 = Target.the("select operating system").located(By.xpath("//div[contains(text(),'Android 6')]"));

    public static final Target ENTER_NEXT_LAST_STEP = Target.the("button to continue with the last registration").located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Next: Last Step')]"));


}
