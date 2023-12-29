package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyFavouriteProductsPage {

    public MyFavouriteProductsPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }






































 //Mesut
 @FindBy(xpath = "//button[@class='add-btns add-to-fav cx-action-link ng-star-inserted']")
 public WebElement whishButtonMe;
    @FindBy(xpath = "//input[@placeholder='Adı']")
    public WebElement whishListNameMe;
    @FindBy(css = ".favorites")
    public WebElement favorilerimMe;
    @FindBy(css = ".delete")
    public WebElement favorilerimDelMe;
    @FindBy(css = ".btn.cc-button.cc-button-primary")
    public WebElement favorilerimDelAlertMe;
    @FindBy(css = ".edit")
    public WebElement favorilerimGuncelleMe;
    @FindBy(xpath = "//p[text()='Favori ürünleriniz henüz yok!']")
    public WebElement favorilerimSilAssertMe;








//Mesut















}
