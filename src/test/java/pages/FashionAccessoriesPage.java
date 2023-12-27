package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FashionAccessoriesPage {
    public FashionAccessoriesPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='category-509 mega-menu-drop ng-star-inserted']")
    public WebElement modaveaksesuar;

    @FindBy(xpath = "//*[@class='guide-title ng-star-inserted']")
    public WebElement modaveaksesuarsayfa;
    @FindBy(xpath = "(//*[@class='value facet-value-link facet-value-link-for-single-select ng-star-inserted'])[1]")
    public WebElement BijuteriveTakilar;
    @FindBy(xpath = "//*[@class='filter-container mobile-hidden ng-star-inserted']")
    public WebElement BijuteriveTakilarfiltre;
    @FindBy(xpath = "//*[@class='sorting-header ng-star-inserted']")
    public WebElement listenen;
    @FindBy(xpath = "//div[@class$='sorting-header ng-star-inserted']")
    public WebElement listenen1;



}
