import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Login;
import task.tasking.Register;
import task.validations.IsLoginSuccessMessage;

import static task.validations.IsLoginSuccessMessage.getTextSuccess;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() throws InterruptedException {
        Login.as(webDriver, "abdiasalpire12@gmail.com", "123");

        Assert.assertTrue(true, getTextSuccess(webDriver));
    }
}
