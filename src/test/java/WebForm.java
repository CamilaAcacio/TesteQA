import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject {

    private final String PRODUT = "Boné adidas Performance Ballcot Preto";

    @FindBy(xpath = "//div[@class='search-group']//input[@name='q']")
    private WebElement produt;

    @FindBy(xpath = "//button[@class='search-button icon-magnifier-2']")
    private WebElement search_button;

    @FindBy(xpath = "//div[@class='product-box-detail']//*[contains(text(), 'Boné adidas Performance Ballcot Preto')]")
    private WebElement produtReturn;

    @FindBy(xpath = "//a//img[@class='product-image']")
    private WebElement produtReturnClick;
    @FindBy(xpath = "//button[@class='dft button primary large fluid add-to-cart-form-button buy-pdp']")
    private WebElement buy_button;

    @FindBy(xpath = "//i[@class='cart-preview-icon icon-bag-2']")
    private WebElement shopping_cart;

    @FindBy(xpath = "//p[@class='cart-product-name item-details-name']//*[contains(text(), 'Boné adidas Performance Ballcot Preto')]")
    private  WebElement shopping_bag;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterProdut() {
        this.produt.sendKeys(PRODUT);
    }

    public void pressSearchButton() {
        this.search_button.click();
    }

    public void produtReturn() throws InterruptedException {
        Thread.sleep(2000);
        this.produtReturn.isEnabled();
    }
    public void produtReturnClick() throws InterruptedException {
        Thread.sleep(1500);
        this.produtReturnClick.click();
    }

    public void pressBuyButton() {
        this.buy_button.click();
    }

    public void shoppingCartClick() throws InterruptedException {
        Thread.sleep(2000);
        this.shopping_cart.click();
    }

    public void shoppingBagElement() throws InterruptedException {
        Thread.sleep(2000);
        this.shopping_bag.isEnabled();
    }
}