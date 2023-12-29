package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MagazalarimizPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


import static utilities.Driver.getDriver;


public class Us04 {

    MagazalarimizPage magazalarimizPage= new MagazalarimizPage();

    @Given("Kullanıcı url e gider")
    public void kullanıcı_url_e_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("gratis_Url"));

    }
    @When("Ana sayfada sag üst kösede bulunan Magazalarımız modulune tiklar.")
    public void ana_sayfada_sag_üst_kösede_bulunan_magazalarımız_modulune_tiklar() {

        magazalarimizPage.magazalarimiz.click();

    }
    @Then("Magazalarimiz sayfasinin acildigini dogrular")
    public void magazalarimiz_sayfasinin_acildigini_dogrular() {

        ReusableMethods.bekle(5);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://www.gratis.com/magazalarimiz"));

    }
    @Then("Magazalarimiz sayfasinda mevcut magazalarin bir listesi görüntülenir.")
    public void magazalarimiz_sayfasinda_mevcut_magazalarin_bir_listesi_görüntülenir() {

        ReusableMethods.bekle(5);
        ReusableMethods.scroll(magazalarimizPage.magazalarimizlistesi);
        System.out.println(magazalarimizPage.magazalarimizlistesi.getText());
        Assert.assertTrue(magazalarimizPage.magazalarimizlistesi.isDisplayed());
    }
    @When("Ana sayfada sol alt kösede bulunan Magazalarımız modulune tiklar.")
    public void anaSayfadaSolAltKösedeBulunanMagazalarımızModuluneTiklar() {

        Actions actions=new Actions(Driver.getDriver());
        ReusableMethods.bekle(5);
      actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
              sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
              sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
              sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
       // ReusableMethods.waitForVisibility(magazalarimizPage.magazalarimizlistesialt,15);
        //ReusableMethods.scrollEnd();
        //ReusableMethods.scroll(magazalarimizPage.magazalarimizlistesialt);
        //ReusableMethods.waitForVisibility(magazalarimizPage.magazalarimizlistesialt,15);
        ReusableMethods.bekle(20);
        magazalarimizPage.magazalarimizlistesialt.click();
        ReusableMethods.bekle(20);
        //ReusableMethods.waitForVisibility(magazalarimizPage.magazalarimizlistesialt,15);
        Assert.assertTrue(magazalarimizPage.magazalarimizlistesialt.isDisplayed());


    }

    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}
