package tests.navigation;

import automationpracticeui.steps.navigation.ContactUsPageSteps;
import automationpracticeui.steps.navigation.SendAMessagePageSteps;
import org.testng.annotations.Test;
import tests.BaseTest;

public class TestSendAMessage extends BaseTest {

    @Test
    void testSendAMessage () {
        ContactUsPageSteps contactUsPageSteps = mainPageSteps.clickContactUsButton();
        SendAMessagePageSteps sendAMessagePageSteps =
                contactUsPageSteps.performSendingAMessage
                        ("Customer service", "test@gmail.com", "QWERTY123", "D:\\QA1818\\12-home_default.jpg", "Let me get my order, at least.");
    }
}
