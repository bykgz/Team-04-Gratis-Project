package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MagazalarimizPage {

public MagazalarimizPage(){
    PageFactory.initElements(Driver.getDriver(),this);

}
    @FindBy(css= ".stores.ng-star-inserted" )
    public WebElement magazalarimiz;

    @FindBy(xpath= "//*[@class='col-md-12 tab-pane content active']" )
    public WebElement magazalarimizlistesi;

    @FindBy(css= ".links-w-icons.cutter > :first-child > a" )
    public WebElement magazalarimizlistesialt;






}
