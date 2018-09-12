package automationpracticeui.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    protected WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy (id = "search_query_top")
    private WebElement searchInput;

    @FindBy (name = "submit_search")
    private WebElement searchSubmitButton;

    @FindBy (className = "login")
    private WebElement signInButton;

    @FindBy (css = "[src = 'http://automationpractice.com/img/p/1/2/12-home_default.jpg']")
    private WebElement coolDress;

    @FindBy (id = "contact-link")
    private WebElement contactUsButton;

    @FindBy (css = "[src = 'http://automationpractice.com/img/p/2/0/20-home_default.jpg']")
    private WebElement goToProductContainer;

    public WebElement getCoolDress() {
        return coolDress;
    }

    public WebElement getSearchInput() {
        return searchInput;
    }

    public WebElement getSearchSubmitButton() {
        return searchSubmitButton;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

    public WebElement getContactUsButton() {
        return contactUsButton;
    }

    public WebElement getGoToProductContainer() { return goToProductContainer; }
}
