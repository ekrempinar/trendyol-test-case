package pageSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;

public class LoginPageSteps {

    private static LoginPage loginPage = LoginPage.getInstance();

    @Given("^Start driver and browsers$")
    public void startDriver() throws Exception {
        loginPage.startDriver();
    }

    @When("^Navigate to login url$")
    public void navigateToUrl() {
        loginPage.navigateToUrl();
    }

    @And("^Enter a valid Email$")
    public void enterEmail(){
        loginPage.enterEmail();
    }

    @And("^Enter a valid Password$")
    public void enterPassword( ){
        loginPage.enterPassword();
    }

    @And("^Click to Sign in Button$")
    public void clickSignIn() {
        loginPage.clickToSignIn();
    }

    @Then("^Open the logged in page$")
    public void checkLoggedInPage() {
        loginPage.checkLoggedInPage();
    }

    @Given("^Open the main page$")
    public void openMainPage() {
        loginPage.openMainPage();
    }

    @When("^Click to the woman tab$")
    public void clickToWomanTab(){
        loginPage.clickToWomanTab();
    }

    @When("^Click to the man tab$")
    public void clickToManTab(){
        loginPage.clickToManTab();
    }

    @When("^Click to the kid tab$")
    public void clickToKidTab(){
        loginPage.clickToKidTab();
    }
    @When("^Click to the home&life tab$")
    public void clickToHomeAndLifeTab(){
        loginPage.clickToHomeAndLifeTab();
    }

    @When("^Click to the supermarket tab$")
    public void clickToSupermarketTab(){
        loginPage.clickToSupermarketTab();
    }
    @When("^Click to the cosmetic tab$")
    public void clickToCosmeticTab(){
        loginPage.clickToCosmeticTab();
    }

    @When("^Click to the shoe&bag tab$")
    public void clickToShoeAndBagTab(){
        loginPage.clickToShoeAndBagTab();
    }

    @When("^Click to the watch&accessory tab$")
    public void clickToWatchAndAccessoryTab(){
        loginPage.clickToWatchAndAccessoryTab();
    }
    @When("^Click to the electronic tab$")
    public void clickToElectronicTab(){
        loginPage.clickToElectronicTab();
    }


    @Then("^Log the upload information of woman tab photos$")
    public void logTheWomanTabPhotoInfo() {
        loginPage.logTheWomanTabPhotoInfo();
    }
    @Then("^Log the upload information of man tab photos$")
    public void logTheManTabPhotoInfo() {
        loginPage.logTheManTabPhotoInfo();
    }
    @Then("^Log the upload information of kid tab photos$")
    public void logTheKidTabPhotoInfo() {
        loginPage.logTheKidTabPhotoInfo();
    }
    @Then("^Log the upload information of home&life tab photos$")
    public void logTheHomeAndLifeTabPhotoInfo() {
        loginPage.logTheHomeAndLifeTabPhotoInfo();
    }@Then("^Log the upload information of supermarket tab photos$")
    public void logTheSupermarketTabPhotoInfo() {
        loginPage.logTheSupermarketTabPhotoInfo();
    }@Then("^Log the upload information of cosmetic tab photos$")
    public void logTheCosmeticTabPhotoInfo() {
        loginPage.clickToCosmeticTab();
    }
    @Then("^Log the upload information of shoe&bag tab photos$")
    public void logTheShoeAndBagTabPhotoInfo() {
        loginPage.logTheShoeAndBagTabPhotoInfo();
    }
    @Then("^Log the upload information of watch&accessory tab photos$")
    public void logTheWatchAndAccessoryTabPhotoInfo() {
        loginPage.logTheWatchAndAccessoryTabPhotoInfo();
    }
    @Then("^Log the upload information of electronic tab photos$")
    public void logTheElectronicTabPhotoInfo() {
        loginPage.logTheElectronicTabPhotoInfo();
    }




}
