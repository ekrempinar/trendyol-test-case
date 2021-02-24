package pageSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.CheckBoutiqueImage;

public class CheckBoutiqueImageSteps {

    private static CheckBoutiqueImage checkBoutiqueImage = CheckBoutiqueImage.getInstance();

    @When("^Go to a random boutique detail page$")
    public void openMainPageForListBoutiques() {
        checkBoutiqueImage.navigateToBoutiqueUrl();
    }

    @Then("^Log the upload information of related boutique photos$")
    public void logTheRelatedBoutiqueImageInfo() {
        checkBoutiqueImage.logTheBoutiqueImageInfo();
    }
}
