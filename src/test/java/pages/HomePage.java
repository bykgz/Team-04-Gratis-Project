package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage {
    public HomePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


















































    @FindBy(css= ".right-content input[class='search-input'][placeholder='Ürün adı veya SKU girin']")
    public WebElement searchBox;
    @FindBy(xpath= "//span[contains(text(),'ürün listeleniyor')]")
    public WebElement urunListText;

    @FindBy(xpath= "//p[contains(text(),'sonuç bulunamamıştır.')]")
    public WebElement sonucBulunamadiText;

    @FindBy(xpath = "//h5")
    public List<WebElement> urunIsim;
}
