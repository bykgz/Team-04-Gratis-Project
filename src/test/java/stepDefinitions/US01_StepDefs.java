package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.GratisMethods;
import utilities.ReusableMethods;

public class US01_StepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("siteye git")
    public void siteyeGit() {
        Driver.getDriver().get(ConfigReader.getProperty("gratis_Url"));
        ReusableMethods.bekle(2);
    }

    @When("giris yap butonuna tikla")
    public void girisYapButonunaTikla() {
        loginPage.girisYapButton1.click();
        ReusableMethods.bekle(1);
    }

    @And("acilan dropdown menude ki giris yap linkine tikla")
    public void acilanDropdownMenudeKiGirisYapLinkineTikla() {
        loginPage.girisYapLink.click();
        ReusableMethods.bekle(1);
    }

    @And("E-posta-cep telefonu kutusuna eposta girisi yap")
    public void ePostaCepTelefonuKutusunaEpostaGirisiYap() {
        loginPage.epostaBox.sendKeys("mustafa.bykgz@gmail.com");
        ReusableMethods.bekle(1);
    }

    @And("sifre kutusuna geçerli bir veri gir")
    public void sifreKutusunaGeçerliBirVeriGir() {
        loginPage.passwordBox.sendKeys("654321gG*");
        ReusableMethods.bekle(1);
    }

    @And("ikinci giris yap butonuna tikla")
    public void ikinciGirisYapButonunaTikla() {
        ReusableMethods.clickElementByJS(loginPage.girisYapButton2);
        ReusableMethods.bekle(2);
    }

    @And("E-posta-cep telefonu kutusuna cep telefonu girisi yap")
    public void ePostaCepTelefonuKutusunaCepTelefonuGirisiYap() {
        loginPage.epostaBox.sendKeys("5523418029");
        ReusableMethods.bekle(1);
    }

    @Then("login isleminin gerceklestigini dogrula")
    public void loginIslemininGerceklestiginiDogrula() {
        loginPage.girisYapButton1.click();
        ReusableMethods.bekle(1);
        Assert.assertTrue(loginPage.hesabımText.isDisplayed());

    }

    @And("sayfayi kapat")
    public void sayfayiKapat() {
       Driver.closeDriver();
    }


    @When("Kullanici {string} eposta-Cep kutusunu boş bırakır")
    public void kullaniciEpostaCepKutusunuBoşBırakır(String eposta) {
        loginPage.epostaBox.sendKeys(eposta);
        ReusableMethods.bekle(1);
    }

    @And("Kullanici {string} sifre kutusunu boş bırakır")
    public void kullaniciSifreKutusunuBoşBırakır(String sifre) {
        loginPage.passwordBox.sendKeys(sifre);
        ReusableMethods.bekle(2);
    }



    @And("Kullanici {string}  kutusuna sifre girisi yapar")
    public void kullaniciKutusunaSifreGirisiYapar(String sifre) {
        loginPage.passwordBox.sendKeys(sifre);
        ReusableMethods.bekle(1);
    }

    @And("Kullanici {string} kutusuna  eposta-Cep girisi yapar")
    public void kullaniciKutusunaEpostaCepGirisiYapar(String eposta) {
        loginPage.epostaBox.sendKeys(eposta);
        ReusableMethods.bekle(1);
    }

    @Then("login isleminin gerceklesmedigini dogrular")
    public void loginIslemininGerceklesmediginiDogrular() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));
    }

    @And("Kullanici {string} kutusunu bos birakir")
    public void kullaniciKutusunuBosBirakir(String sifre) {
        loginPage.passwordBox.sendKeys(sifre);
        ReusableMethods.bekle(1);
    }

    @And("Kullanici {string} kutusuna  hatalı eposta-Cep girisi yapar")
    public void kullaniciKutusunaHatalıEpostaCepGirisiYapar(String eposta) {
        loginPage.epostaBox.sendKeys(eposta);
        ReusableMethods.bekle(2);
    }

    @And("Kullanici {string}  kutusuna hatalı sifre girisi yapar")
    public void kullaniciKutusunaHatalıSifreGirisiYapar(String sifre) {
        loginPage.passwordBox.sendKeys(sifre);
        ReusableMethods.bekle(1);
    }

    @And("Kullanici {string} kutusuna  @ olmadan eposta-Cep girisi yapar")
    public void kullaniciKutusunaOlmadanEpostaCepGirisiYapar(String eposta) {
        loginPage.epostaBox.sendKeys(eposta);
        ReusableMethods.bekle(1);
    }

    @And("Kullanici {string} kutusuna hatali sifre girisi yapar")
    public void kullaniciKutusunaHataliSifreGirisiYapar(String sifre) {
        loginPage.passwordBox.sendKeys(sifre);
        ReusableMethods.bekle(1);
    }

    @And("Kullanici giris yap butonuna tiklar")
    public void kullaniciGirisYapButonunaTiklar() {
        ReusableMethods.bekle(2);
        ReusableMethods.clickElementByJS(loginPage.girisYapButton2);

    }
}
