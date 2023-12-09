package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.HomeLogged;

public class IsLoginSuccessMessage {

    public static boolean visible(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, HomeLogged.logout_text);
    }

    public static String getTextSuccess(WebDriver webDriver) {
        WebElement element = webDriver.findElement(HomeLogged.logout_text);
        return element.getText();
    }
}
