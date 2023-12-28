package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
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
  /*  ///////////////   TC01    /////////////////
    @Then("ilgili urunlerin listelendigini dogrula")
    public void ilgiliUrunlerinListelendiginiDogrula() {

    }
    ///////////////   TC02    /////////////////
    @And("stokta var tickbox ina tikla")
    public void stoktaVarTickboxInaTikla() {
    }

    @Then("stokta olan urunlerin listelendigini dogrula")
    public void stoktaOlanUrunlerinListelendiginiDogrula() {
    }
    ///////////////   TC03    /////////////////
    @And("listeden bir urunu sec ve tikla")
    public void listedenBirUrunuSecVeTikla() {
    }

    @Then("urun detaylarinin goruntulendigini dogrula")
    public void urunDetaylarininGoruntulendiginiDogrula() {
    }

   */
}
