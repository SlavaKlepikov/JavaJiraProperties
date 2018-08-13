import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public void enterLogin(String login){
        $("#login-form-username").shouldBe(visible).setValue(login);
    }

    public void enterPassword(String password){
        $("#login-form-password").setValue(password);
    }


    public void submitButton(){
        $("#login-form-submit").click();

    }
}
