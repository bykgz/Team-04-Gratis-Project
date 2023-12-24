package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyFavouriteProductsPage {

    public MyFavouriteProductsPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
}
