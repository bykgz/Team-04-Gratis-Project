package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ElectronicProductsPage {
    public ElectronicProductsPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
}
