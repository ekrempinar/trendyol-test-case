package pageSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.AddBasket;

public class AddBasketSteps {

    private static AddBasket addBasket = AddBasket.getInstance();

    @When("^Go to a random product detail$")
    public void openMainPageForListBoutiques() {
        addBasket.navigateToProductDetail();
    }

    @And("^Click to add basket button$")
    public void clickAddBasket(){
        addBasket.clickToAddBasket();
    }

    @Then("^Check product is added to basket$")
    public void checkBasket() {
        addBasket.checkAddBasket();
    }
}
