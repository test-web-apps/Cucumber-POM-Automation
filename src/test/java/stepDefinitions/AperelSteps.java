package stepDefinitions;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pageObject.ApperelPage;

public class AperelSteps {

	WebDriver driver;
	ApperelPage apperelPage;
	
	@Given ("User is on the Apperel Page")
	public void user_is_on_apperal_accessories() {
		
		driver.get("https://automationteststore.com/index.php?rt=product/category&path=68");
		apperelPage = new ApperelPage(driver);
		apperelPage.verifyPageTitile("Apparel & accessories");
	}
	
	@When("User applies {string} filter")
	public void user_applies_filter(String filterType) {
		apperelPage.selectFilter(filterType);
	}
	
	@Then("Products title should be visible")
	public void user_titles_should_Be_visible() {
		apperelPage.verifyProductTitleVisible();
	}
	
	@When("User adds a Product to the cart")
	public void user_adds_a_product_to_the_cart() {
		apperelPage.addToCart();
	}
	
	@Then("Product {string} should be added to the cart")
	public void product_should_be_added_to_the_cart(String productname) {
		apperelPage.verifyProductInCart(productname);
	}
	
	
}
