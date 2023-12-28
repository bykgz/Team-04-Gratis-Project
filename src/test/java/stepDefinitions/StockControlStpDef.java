package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.ElectronicProductsPage;
import utilities.ReusableMethods;

public class StockControlStpDef {
    ElectronicProductsPage page=new ElectronicProductsPage();
    @Given("arama kutusuna ruj yazip arat")
    public void aramaKutusunaRujYazipArat() {
        page.searchBox.sendKeys("ruj", Keys.ENTER);
        ReusableMethods.bekle(2);
    }

    @And("cikan listede ilk urune tikla")
    public void cikanListedeIlkUruneTikla() {
    }

    @When("urun stok adet bilgisini ogrenmek icin max urun adedini sec")
    public void urunStokAdetBilgisiniOgrenmekIcinMaxUrunAdediniSec() {
    }

    @Then("urun stok bilgisinin kontrol edildigini dogrula")
    public void urunStokBilgisininKontrolEdildiginiDogrula() {
    }

    @Given("arama kutusuna {string} yazip arat")
    public void aramaKutusunaYazipArat(String arg0) {
    }

    @And("cikan listeden urune tikla")
    public void cikanListedenUruneTikla() {
    }

    @Then("urun stokta olmadigi bilgisinin goruldugunu dogrula")
    public void urunStoktaOlmadigiBilgisininGoruldugunuDogrula() {
    }

    @Then("urunun sepete eklenemedigini dogrula")
    public void urununSepeteEklenemediginiDogrula() {
    }
}
