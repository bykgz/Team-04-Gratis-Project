package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import pages.MyFavouriteProductsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_10_Stepdefs {
    LoginPage loginPage = new LoginPage();
    MyFavouriteProductsPage favourite = new MyFavouriteProductsPage();

    @Given("Kullanici web sitesine gider")
    public void kullaniciWebSitesineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("gratis_Url"));
        ReusableMethods.bekle(1);
    }

    @When("Giris yap butonuna tiklar")
    public void girisYapButonunaTiklar() {
        loginPage.loginButtonMe.click();
        ReusableMethods.bekle(1);
        loginPage.loginButtonGirisMe.click();
        ReusableMethods.bekle(1);
    }

    @Then("Acilan sayfadaki kutucuklara email ve password girer")
    public void acilanSayfadakiKutucuklaraEmailVePasswordGirer() {
        loginPage.loginEmailMe.sendKeys(ConfigReader.getProperty("emailMe"), Keys.TAB, Keys.TAB, ConfigReader.getProperty("passwordMe"), Keys.ENTER);
        ReusableMethods.bekle(2);
    }

    @And("Siteye login oldugunu dogrular")
    public void siteyeLoginOldugunuDogrular() {
        WebElement actualHesabim = Driver.getDriver().findElement(By.xpath("(//span[text() ='Mesut Erdogan'])[2]"));
        boolean mesutMu = actualHesabim.getText().contains("Mesut");
        System.out.println("HesapAdim = " + mesutMu);
        Assert.assertTrue(mesutMu);
        ReusableMethods.bekle(1);
    }

    @And("Arama kutusuna arko yazar ve cikan ilk urundeki whislist ikonuna tiklar ve acilan istek listesi kismina favorilerim yazar ve ekle butonuna tiklar")
    public void aramaKutusunaArkoYazarVeCikanIlkUrundekiWhislistIkonunaTiklarVeAcilanIstekListesiKisminaFavorilerimYazarVeEkleButonunaTiklar() {
        loginPage.searchTabMe.sendKeys(ConfigReader.getProperty("aramaKelimesi"), Keys.ENTER);
        ReusableMethods.bekle(2);
        List<WebElement> wishElements = Driver.getDriver().findElements(By.xpath("//div[@class='product-cards']"));
        wishElements.get(0).click();
        ReusableMethods.click(favourite.whishButtonMe);
        ReusableMethods.bekle(2);
        ReusableMethods.window(0);
        ReusableMethods.bekle(2);
        favourite.whishListNameMe.sendKeys(ConfigReader.getProperty("wishListYazi"), Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER);
        ReusableMethods.bekle(2);
        //ReusableMethods.click(favourite.whishListEkleMe);
    }

    @And("Hesabim butonu yanindaki kalp ikonuna yani favorilerim'e tiklar")
    public void hesabimButonuYanindakiKalpIkonunaYaniFavorilerimETiklar() {
        ReusableMethods.clickElementByJS(favourite.favorilerimMe);
        ReusableMethods.bekle(2);
    }

    @And("Ekledigi urunun listelendigini dogrular")
    public void ekledigiUrununListelendiginiDogrular() {
        String actual = Driver.getDriver().findElement(By.xpath("//div[text()='Favorilerim']")).getText();
        System.out.println(actual);
        String expected = "Favorilerim";
        Assert.assertEquals(actual, expected);
        ReusableMethods.bekle(2);
    }

    @And("Liste adini duzenle'ye tiklar acilan penceredeki liste adini gunceller ve kaydet butonuna tiklar")
    public void listeAdiniDuzenleYeTiklarAcilanPenceredekiListeAdiniGuncellerVeKaydetButonunaTiklar() {
        ReusableMethods.clickElementByJS(favourite.favorilerimGuncelleMe);
        ReusableMethods.bekle(1);
        ReusableMethods.window(0);
        ReusableMethods.bekle(1);
        favourite.whishListNameMe.sendKeys(ConfigReader.getProperty("wishListYazi"), Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER);
        ReusableMethods.bekle(1);
    }

    @And("Liste adinin guncellendigini dogrular")
    public void listeAdininGuncellendiginiDogrular() {
        String actual = Driver.getDriver().findElement(By.xpath("//div[text()='FavorilerimFavorilerim']")).getText();
        System.out.println(actual);
        String expected = "FavorilerimFavorilerim";
        Assert.assertEquals(actual, expected);
        ReusableMethods.bekle(1);
    }

    @And("Acilan Favorilerim sayfasindaki sil ikonuna tiklar sonra yeni acilan penceredeki sil butonuna tiklar")
    public void acilanFavorilerimSayfasindakiSilIkonunaTiklarSonraYeniAcilanPenceredekiSilButonunaTiklar() {
        ReusableMethods.clickElementByJS(favourite.favorilerimDelMe);
        ReusableMethods.window(0);
        ReusableMethods.bekle(1);
        ReusableMethods.clickElementByJS(favourite.favorilerimDelAlertMe);
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.scroll(favourite.favorilerimSilAssertMe);
        ReusableMethods.bekle(2);
    }

    @And("Liste adinin silindigini dogrular")
    public void listeAdininSilindiginiDogrular() {
        WebElement favoriUrunYok = Driver.getDriver().findElement(By.xpath("//p[text()='Favori ürünleriniz henüz yok!']"));
        Assert.assertTrue(favoriUrunYok.isDisplayed());
        ReusableMethods.bekle(2);
    }
}
