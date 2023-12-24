package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FashionAccessoriesPage {


    public FashionAccessoriesPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

}
