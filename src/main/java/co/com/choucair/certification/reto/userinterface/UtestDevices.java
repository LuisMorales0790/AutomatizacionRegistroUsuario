package co.com.choucair.certification.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestDevices extends PageObject {

    public static final Target SELECT_COMPUTER_1 = Target.the("select your computer").located(By.xpath("//*[@id='web-device']//div[@class='form-group col-xs-12 col-sm-4 col-md-4 col-lg-4 select2-theme-form']//div[@class='ui-select-box']//div[@name='osId']"));
    public static final Target SELECT_COMPUTER_2 = Target.the("select your computer").located(By.xpath("//*[@id='web-device']//div[@class='form-group col-xs-12 col-sm-4 col-md-4 col-lg-4 select2-theme-form']//div[@class='ui-select-box']//div[@name='osId']//input[@placeholder='Select OS']"));

    public static final Target SELECT_VERSION_1 = Target.the("select version").located(By.xpath("//div[@placeholder='Select a Version']"));
    public static final Target SELECT_VERSION_2 = Target.the("select version").located(By.xpath("//div[@name='osVersionId']//input[@placeholder='Select a Version']"));

    public static final Target SELECT_LANGUAGE_1 = Target.the("select language").located(By.xpath("//div[@class='ui-select-box']//div[@name='osLanguageId']"));
    public static final Target SELECT_LANGUAGE_2 = Target.the("select language").located(By.xpath("//input[@placeholder='Select OS language']"));

    public static final Target SELECT_MOBILE_1 = Target.the("select your moblie device").located(By.xpath("//div[@class='ui-select-box']//div[@name='handsetMakerId']"));
    public static final Target SELECT_MOBILE_2 = Target.the("select your moblie device").located(By.xpath("//input[@placeholder='Select Brand']"));

    public static final Target SELECT_MODEL_1 = Target.the("select model").located(By.xpath("//div[@placeholder='Select a Model']"));
    public static final Target SELECT_MODEL_2 = Target.the("select model").located(By.xpath("//div[@name='handsetModelId']//input[@placeholder='Select a Model']"));

    public static final Target SELECT_OPERATING_SYSTEM_1 = Target.the("select operating system").located(By.xpath("//*[@id='mobile-device']//div[@name='handsetOSId']"));
    public static final Target SELECT_OPERATING_SYSTEM_2 = Target.the("select operating system").located(By.xpath("//*[@id='mobile-device']//div[@name='handsetOSId']//input[@placeholder='Select OS']"));

    public static final Target ENTER_NEXT_LAST_STEP = Target.the("button to continue with the last registration").located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Next: Last Step')]"));


}
