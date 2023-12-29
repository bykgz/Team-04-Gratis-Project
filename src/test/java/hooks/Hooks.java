package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
     /*
   Cucumber'da step definitions package'i içinde @Before @After gibi bir notasyon varsa
   extends testbase dememize gerek olmadan her senaryodan once ve/veya sonra bu methodlar calısacaktır.

   Bu da bizim isteyeceğimiz bir durum degildir.

   Cucumber'da @Before @After gibi bir notasyonları kullanma ihtiyacımız olursa
   bunu step definitions package'i içinde olusturacagımız Hooks clasına koyarız.


    Biz her senaryodan sonra test soucunu kontrol edip failed olan senaryolar icin
    screenshoot alması amacıyla @After methodunu kullanacagız
     */


//    @Before
//    public void setup() {
//        Driver.getDriver();
//    }
//
//    @After
//    public void tearDown() {
//        Driver.quitDriver();
//    }



    @After
    public void tearDown(Scenario scenario) {  // scenario fail olursa diyebilmemiz için Scenario parametresi yazmamız gerek
        if (scenario.isFailed()) {  //eğer scenario fail olursa
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES) , "image/png" , "scenario_" + scenario.getName());
            // burda OutputType.BYTES olması gerek  ve mediaType (medyanın tipini)  ve name parametrelerini yazıyoruz  -->hangi seneryoda hata aldıysa "scenario_" yazsın ve seneryonun adını yazsın
            //attach --> eklemek demek fail olma durumunda, attach metodu ekran görüntüsünü test raporuna ekler.
            Driver.closeDriver();  //hata aldıkdan sonra browseri kapat
        }

       // Driver.closeDriver();


    }

}

