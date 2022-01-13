package starter.Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.BaseTest.BaseTest;

public class goalSteps extends BaseTest {
    @Given("I am logged as user")
    public void iAmLoggedAsUser() {
        goals.open();
        goals.clickTextButtonSignIn();
        goals.InputUsername();
        goals.InputPassword();
    }

    @When("I am click button text Sign In")
    public void iAmClickButtonTextSignIn() {
        goals.clickButtonTextSignIn();
    }

    @And("I am click button +")
    public void iAmClickButton() {
        goals.clickButtonPlus();
    }

    @And("I am input Gist description {string}")
    public void iAmInputGistDescription(String desc) {
        goals.InputDescription(desc);
    }

    @And("I am input Filename {string}")
    public void iAmInputFilename(String filename) {
        goals.InputFilename(filename);
    }

    @And("I am input code {string}")
    public void iAmInputCode(String message) {
        goals.InputMessageCode(message);
    }

    @And("I am click button text Create secret gist")
    public void iAmClickButtonTextCreateSecretGist() {
        goals.clickButtonCreate();
    }

    @And("I am click menu dropdown icon profile")
    public void iAmClickMenuDropdownIconProfile() {
        goals.clickIconAccount();
    }

    @And("I am click button text your gists")
    public void iAmClickButtonTextYourGists() {
        goals.clickTextButtonYourGist();
    }

    @And("I am click my gists")
    public void iAmClickMyGists() {
        goals.clickMyGist();
    }

    @And("I am click button edit")
    public void iAmClickButtonEdit() {
        goals.clickButtonEdit();
    }

    @And("I am update data in gist description {string}")
    public void iAmUpdateDataInGistDescription(String desc) {
        goals.InputUpdateDescription(desc);
    }

    @And("I am update data in code {string}")
    public void iAmUpdateDataInCode(String message) {
        goals.InputUpdateMessageCode(message);
    }

    @And("I am click button Update Data")
    public void iAmClickButtonUpdateData() {
        goals.clickButtonUpdate();
    }

    @And("I am click button delete")
    public void iAmClickButtonDelete() {
        goals.clickButtonDelete();
    }

    @And("I am click button text Sign Out")
    public void iAmClickButtonTextSignOut() {
        goals.clickButtonSignOut();
        goals.clickTextButtonSignout();
    }

    @Then("I am success logout")
    public void iAmSuccessLogout() {
        goals.HomePage();
    }
}