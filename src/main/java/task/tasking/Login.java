package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;

public class Login {
    public static void as(WebDriver webDriver, String userLogin, String pass) throws InterruptedException {
        Click.on(webDriver, HomePageUI.loginButton);
        //Thread.sleep(5000);
        Enter.text(webDriver, HomePageUI.login_user, userLogin);
        Enter.text(webDriver, HomePageUI.pass_user, pass);
        Click.on(webDriver, HomePageUI.login_button);
    }
}
