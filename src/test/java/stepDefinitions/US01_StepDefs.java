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

}
