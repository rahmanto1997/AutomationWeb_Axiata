package starter;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

public class goals extends PageObject {
    //Click button text Sign In
    @FindBy(xpath = "/html/body/div[1]/div/div[5]/a[1]")
    WebElement TextButtonSignIn;
    public void clickTextButtonSignIn(){
        TextButtonSignIn.click();
    }
    //Input Username
    @FindBy(id = "login_field")
    WebElement FieldUsername;
    public void InputUsername(){
        FieldUsername.sendKeys("demohiring");
    }
    //Input Password
    @FindBy(id = "password")
    WebElement FieldPassword;
    public void InputPassword(){
        FieldPassword.sendKeys("R@hmant0123");
    }
    //Click Button Sign In
    @FindBy(xpath = "//*[@id=\"login\"]/div[3]/form/div/input[12]")
    WebElement ButtonTextSignIn;
    public void clickButtonTextSignIn(){
        ButtonTextSignIn.click();
    }
    //Click Button +
    @FindBy(xpath = "/html/body/div[1]/div/div[5]")
    WebElement ButtonPlus;
    public void clickButtonPlus(){
        ButtonPlus.click();
    }
    //Input Gists Description
    @FindBy(xpath = "//*[@id=\"gists\"]/input")
    WebElement FieldDescription;
    public void InputDescription(String desc){
        FieldDescription.sendKeys(desc);
    }
    //Input Filename include extension
    @FindBy(xpath = "//*[@id=\"gists\"]/div[2]/file-attachment/div/div[1]/div[1]/input[2]")
    WebElement FieldFilename;
    public void InputFilename(String filename){
        FieldFilename.sendKeys(filename);
    }
    //Input message code
    @FindBy(id = "code-editor")
    WebElement FieldMessage;
    public void InputMessageCode(String message){
        FieldMessage.sendKeys(message);
    }
    //click button create secret gists
    @FindBy(xpath = "//*[@id=\"new_gist\"]/div/div[2]/div/button")
    WebElement ButtonCreate;
    public void clickButtonCreate(){
        ButtonCreate.click();
    }
    //Click Icon Account
    @FindBy(xpath = "//*[@id=\"user-links\"]/details")
    WebElement IconAccount;
    public void clickIconAccount(){
        IconAccount.click();
    }
    //Click Button Your gists
    @FindBy(xpath = "//*[@id=\"user-links\"]/details/details-menu/a[1]")
    WebElement TextButtonYourGist;
    public void clickTextButtonYourGist(){
        TextButtonYourGist.click();
    }
    //Click my gist
    @FindBy(id = "file-maven-xml-LC1")
    WebElement MyGist;
    public void clickMyGist(){
        MyGist.click();
    }
    //Click Button Edit
    @FindBy(xpath = "//*[@id=\"gist-pjax-container\"]/div[1]/div/div[1]/ul/li[1]/a")
    WebElement ButtonEdit;
    public void clickButtonEdit(){
        ButtonEdit.click();
    }
    //Update Description
    @FindBy(xpath = "//*[@id=\"gists\"]/input")
    WebElement UpdateDescription;
    public void InputUpdateDescription(String desc){
        UpdateDescription.clear();
        UpdateDescription.sendKeys(desc);
    }
    //Update message code
    @FindBy(id = "code-editor")
    WebElement UpdateMessage;
    public void InputUpdateMessageCode(String message){
        UpdateMessage.sendKeys(message);
    }
    //CLick Button Update Secret gist
    @FindBy(xpath = "//button[normalize-space()='Update secret gist']")
    WebElement ButtonUpdate;
    public void clickButtonUpdate(){
        ButtonUpdate.click();
    }
    //Click Button Delete
    @FindBy(xpath = "//*[@id=\"gist-pjax-container\"]/div[1]/div/div[1]/ul/li[2]/form/button")
    WebElement ButtonDelete;
    public void clickButtonDelete(){
        ButtonDelete.click();
        //WebDriver driver = new ChromeDriver(); driver.get("https://gist.github.com/demohiring/b4bb9e85d00c1070d0ac1afabd6a171d");
        getDriver().switchTo().alert().accept();
    }
    //Click Button SignOut
    @FindBy(xpath = "//*[@id=\"user-links\"]/details/details-menu/form/button")
    WebElement ButtonSignOut;
    public void clickButtonSignOut(){
        ButtonSignOut.click();
    }
    //Click Text Button SignOut
    @FindBy(xpath = "//*[@id=\"js-pjax-container\"]/div/form/input[2]")
    WebElement TextButtonSignOut;
    public void clickTextButtonSignout(){
        TextButtonSignOut.click();
    }
    @FindBy(xpath = "//a[normalize-space()='Sign in']")
    WebElementFacade Home;
    public void HomePage(){
        Home.shouldBePresent();
    }
}