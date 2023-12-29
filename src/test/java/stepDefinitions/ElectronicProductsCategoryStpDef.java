package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.ElectronicProductsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class ElectronicProductsCategoryStpDef {
    ElectronicProductsPage page=new ElectronicProductsPage();
    @And("kullanici siteye gider")
    public void kullaniciSiteyeGider() {
        Driver.getDriver().get(ConfigReader.getProperty("gratis_Url"));
    }

    @And("elektirikli urunler sekmesine tikla")
    public void elektirikliUrunlerSekmesineTikla() {
        page.elektrikliUrunlerSekmesi.click();
        ReusableMethods.bekle(2);

    }
   ///////////////   TC01    /////////////////
    @Then("ilgili urunlerin listelendigini dogrula")
    public void ilgiliUrunlerinListelendiginiDogrula() {
        Assert.assertTrue(page.urunListeleniyorTexti.isDisplayed());

    }
   ///////////////   TC02    /////////////////
   Actions actions=new Actions(Driver.getDriver());
    @And("stokta var tickbox ina tikla")
    public void stoktaVarTickboxInaTikla() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.click(page.stoktaVar);
    }

    @Then("stokta olan urunlerin listelendigini dogrula")
    public void stoktaOlanUrunlerinListelendiginiDogrula() {
    Assert.assertTrue(page.stokUrunleriListeleFilter.isDisplayed());
    }
     ///////////////   TC03    /////////////////
    @And("listeden bir urunu sec ve tikla")
    public void listedenBirUrunuSecVeTikla() {
       ReusableMethods.click(page.ilkurun);
    }

    @Then("urun detaylarinin goruntulendigini dogrula")
    public void urunDetaylarininGoruntulendiginiDogrula() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(page.urunozellikleri.isDisplayed());
    }


}
