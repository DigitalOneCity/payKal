package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {

	@FindBy(css = "")
	private WebElement checkoutBtn;


	public ProductsPage(WebDriver driver) {
		super(driver);
	}

	public void openCheckOutPage() {
		click(checkoutBtn);

	}
}
