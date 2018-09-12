package automationpracticeui.objects.navigation;

import automationpracticeui.objects.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends MainPage {

    public ContactUsPage (WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "id_contact")
    private WebElement subjectHeadingInput;

    @FindBy (id = "email")
    private WebElement emailAddressUserInput;

    @FindBy (id = "id_order")
    private WebElement orderReferenceInput;

    @FindBy (id = "fileUpload")
    private WebElement chooseFileButton;

    @FindBy (id = "message")
    private WebElement userMessageInput;

    @FindBy (id = "submitMessage")
    private WebElement submitMessageButton;

    public WebElement getSubjectHeadingInput() {
        return subjectHeadingInput;
    }

    public WebElement getEmailAddressUserInput() {
        return emailAddressUserInput;
    }

    public WebElement getOrderReferenceInput() {
        return orderReferenceInput;
    }

    public WebElement getChooseFileButton() {
        return chooseFileButton;
    }

    public WebElement getUserMessageInput() {
        return userMessageInput;
    }

    public WebElement getSubmitMessageButton() {
        return submitMessageButton;
    }
}
