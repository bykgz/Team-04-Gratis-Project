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
    @FindBy(css = ".col-md-3 [_ngcontent-gratis-c177]>a")  //cold-md-3 clasına sahip elementin içindeki(torunlarıyla birlikte)(space) ,_ngcontent-gratis-c177 artibüte değerine sahip elementin cocuğu(>) olan a taglı element
    public WebElement stoktaVar;


    @FindBy(css =".sorting-header.ng-star-inserted")
    public WebElement urunListeleniyorTexti;

    @FindBy(css =".filter-name.inStock")
    public WebElement stokUrunleriListeleFilter;
    @FindBy(css ="div.swiper-wrapper>:first-child img[_ngcontent-gratis-c191]")
    public WebElement ilkurun;

    @FindBy(xpath ="//li//a[normalize-space() ='Ürün Özellikleri']")
    public WebElement urunozellikleri;


   /////stokController locates/////

    @FindBy(xpath = "(//input[@class='search-input'])[1]")
    public WebElement searchBox;


}

