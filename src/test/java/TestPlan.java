import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Realizar a busca de um produto")

    /*Cenário 7 – Validar adição de produto no Carrinho:
    Dado que Acesso ao site Dafiti
    Quando preencho o filtro de busca com o produto específico com estoque
    E realizo a busca
    E é me retornado um produto
    Então seleciono o produto desejado
    E clico no botão de adicionar no carrinho
    Então acesso o carrinho
    E o produto é adicionado.
*/
    public static void submitForm() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.enterProdut();
        webForm.pressSearchButton();
        webForm.produtReturn();
        webForm.produtReturnClick();
        webForm.pressBuyButton();
        webForm.shoppingCartClick();
        webForm.shoppingBagElement();

    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
