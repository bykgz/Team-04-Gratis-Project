package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ElectronicProductsPage { public ElectronicProductsPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(css = ".category-511.mega-menu-drop.ng-star-inserted")
    public WebElement elektrikliUrunlerSekmesi;
    @FindBy(xpath = "//span[text()='Stokta Var']") //UNİC DEĞİL
    public WebElement stoktaVar;







}

