import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TestJira{
        public static LoginPage loginPage = new LoginPage();
       // public static LoadProperties prop  = new LoadProperties();

    @BeforeTest
        public void setup(){
            Configuration.browser = "chrome";
            open(LoadProperties.getPropValue("urlJira"));
            loginPage.enterLogin(LoadProperties.getPropValue("login"));
            loginPage.enterPassword(LoadProperties.getPropValue("password"));
            loginPage.submitButton();
        }

        @Test
        public void testMainPage(){
            $(".aui-page-header-main").shouldHave(visible, text("System Dashboard"));
        }
}
