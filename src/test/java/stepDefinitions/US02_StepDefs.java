package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US02_StepDefs {


    HomePage page = new HomePage();

    @And("sayfanin header bolumundeki search box a tikla")
    public void sayfaninHeaderBolumundekiSearchBoxaTikla() {
        page.searchBox.click();
        ReusableMethods.bekle(1);
    }


    @Given("search edilecek kelimeyi yaz")
    public void searchEdilecekKelimeyiYaz() {
        page.searchBox.sendKeys("erkek parfüm");
        ReusableMethods.bekle(1);
    }

    @When("enter tusuna bas veya search butonuna tikla")
    public void enterTusunaBasVeyaSearchButonunaTikla() {
        page.searchBox.sendKeys(Keys.ENTER);
        ReusableMethods.bekle(1);
    }

    @Then("search isleminin gerceklestigini dogrula")
    public void searchIslemininGerceklestiginiDogrula() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(page.urunListText.isDisplayed());

    }

    @And("search kutusunu bos birak")
    public void searchKutusunuBosBirak() {
        page.searchBox.sendKeys("");
    }

    @Then("search isleminin gerceklesmedigini dogrula")
    public void searchIslemininGerceklesmediginiDogrula() {
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.gratis.com/");
    }

    @Then("searcbox a tiklanabildigini ve veri girilebildigini dogrula")
    public void searcboxATiklanabildiginiVeVeriGirilebildiginiDogrula() {

        ReusableMethods.bekle(1);
        // JavaScript Executor kullanarak inputa bir değer girin ve alın
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String deger = (String) js.executeScript("return document.querySelector('.right-content [class='search-input']').value;");


        System.out.println("Input değeri: " + deger);
        Assert.assertEquals(deger, "erkek parfüm");

    }


    @Then("herhangi bir sonuc bulunamadigini dogrula")
    public void herhangiBirSonucBulunamadiginiDogrula() {
        Assert.assertTrue(page.sonucBulunamadiText.getText().contains("sonuç bulunamamıştır."));
        ReusableMethods.bekle(1);
    }

    @And("search kutusuna gecersiz bir veri gir")
    public void searchKutusunaGecersizBirVeriGir() {
        ReusableMethods.bekle(1);
        page.searchBox.sendKeys("$$??%+");
    }

    @Then("search edilen kelime ile alakali sonuclarin bulundugunu dogrula")
    public void searchEdilenKelimeIleAlakaliSonuclarinBulundugunuDogrula() {
        ReusableMethods.bekle(1);
        for (WebElement w:page.urunIsim){
            Assert.assertTrue(w.getText().contains("Parfüm"));
        }



    }
}
