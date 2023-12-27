package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigReader;
import utilities.Driver;

public class FashionAccessories {
    pages.FashionAccessoriesPage gratis = new pages.FashionAccessoriesPage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("Kullanıcı Web Sitesine Gider")
    public void kullanıcıWebSitesineGider() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("gratis_Url"));
        Thread.sleep(5);
    }

    @When("Moda ve Aksesuar sayfasi tıklanır.")
    public void modaVeAksesuarSayfasiTıklanır() {
        gratis.modaveaksesuar.click();


    }

    @Then("Mause yukarı hareket ettirilir.")
    public void mauseYukarıHareketEttirilir() throws InterruptedException {
        actions.moveByOffset(0, 0).perform();
        Thread.sleep(3000);
    }

    @Then("Moda ve Aksesuar sayfasinin gorunurlugu dogrulanir.")
    public void modaVeAksesuarSayfasininGorunurluguDogrulanir() throws InterruptedException {

        Assert.assertTrue(gratis.modaveaksesuarsayfa.isDisplayed());
        Thread.sleep(3000);
    }

    @Then("Alt Kategoriler filtresinden {string} secilir.")
    public void altKategorilerFiltresindenSecilir(String arg0) throws InterruptedException {

        gratis.BijuteriveTakilar.click();
        Thread.sleep(5000);
    }

    @Then("Filtrenin uglunandigi dogrulanir.")
    public void filtreninUglunandigiDogrulanir() {
        Assert.assertTrue(gratis.BijuteriveTakilarfiltre.isDisplayed());

    }

    @Then("Filtre sonucu cikan urun listesi dogrulanir.")
    public void filtreSonucuCikanUrunListesiDogrulanir() {
       String liste=gratis.listenen.getText();
        //String actualbeklenenyazi="kkkkkkkkk";
       String actualbeklenenyazi="ürün listeleniyor";
        Assert.assertTrue(liste.contains(actualbeklenenyazi));

        System.out.println(liste);
    }

    @And("Sayfa Kapatılır.")
    public void sayfaKapatılır() {

        Driver.closeDriver();
    }


}
