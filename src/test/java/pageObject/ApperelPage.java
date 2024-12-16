package pageObject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class ApperelPage {

	WebDriver driver;
	WebDriverWait wait;
	
	private By filterdropdown = By.id("sort");
	private By productTitle = By.cssSelector("a[title='New Ladies High Wedge Heel Toe Thong Diamante Flip Flop Sandals']");
	private By addToCartBtn = By.cssSelector("[class =\"productcart\"]");
	private By cartIcon = By.cssSelector("div[class='block_3'] li:nth-child(3)");
	
	public ApperelPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	}
	
	public void verifyPageTitile(final String expectedTitle) {
		Assert.assertEquals("Page title: ", expectedTitle, driver.getTitle());
	}
	
	public void selectFilter(String filterType) {
		driver.findElement(filterdropdown).sendKeys(filterType);
	}
	
	public void verifyProductTitleVisible() {
		Assert.assertEquals("Product title is not visible", driver.findElement(productTitle));
	}
	
	public void addToCart() {
		driver.findElement(addToCartBtn).click();
	}
	
	public void verifyProductInCart(String productname) {
		driver.findElement(cartIcon).click();
		boolean productInCart = driver.getPageSource().contains(productname);
		Assert.assertTrue(productInCart, "Product is not added to the cart");
	}
	
}

