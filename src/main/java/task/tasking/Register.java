package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;

public class Register {

    public static void as(WebDriver webDriver, String user, String pass) throws InterruptedException {
        Click.on(webDriver, HomePageUI.signButton);
        //Thread.sleep(5000);
        Enter.text(webDriver, HomePageUI.fullName, user);
        Enter.text(webDriver, HomePageUI.email, user);
        Enter.text(webDriver, HomePageUI.password, pass);
        Click.on(webDriver, HomePageUI.readCheck);
        Click.on(webDriver, HomePageUI.signUpButton);
    }
}
