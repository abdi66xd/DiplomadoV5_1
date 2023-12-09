import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Register;
import task.validations.IsLoginSuccessMessage;

import static task.validations.IsLoginSuccessMessage.getTextSuccess;

public class RegisterTest extends BaseTest {

    @Test
    public void authenticationSuccessfullTest() throws InterruptedException {
        Register.as(webDriver, "userrandomefowmefowefwefewfewf+2@gmail.com", "pass");
        Thread.sleep(5000);
        Assert.assertTrue(true, getTextSuccess(webDriver));
    }
}
