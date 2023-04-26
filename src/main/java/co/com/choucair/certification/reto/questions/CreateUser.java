package co.com.choucair.certification.reto.questions;

import co.com.choucair.certification.reto.userinterface.UtestCreateUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CreateUser implements Question<Boolean> {
    private String strMessage;

    public CreateUser(String strMessage){
        this.strMessage = strMessage;
    }


    public static CreateUser toThe(String strMessage) {
        return new CreateUser(strMessage);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String responseQuestion = Text.of(UtestCreateUser.RESPONSE_CREATE_USER).viewedBy(actor).asString();
        if (strMessage.equals(responseQuestion)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
