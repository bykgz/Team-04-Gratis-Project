@US10
Feature: US-10 Kullanici favori Urunlerini Listeleyebilmeli Guncelleyebilmeli Silebilmeli

  Scenario: Kullanici favori Urunlerini Listeleyebilmeli Guncelleyebilmeli Silebilmeli

    Given Kullanici web sitesine gider
    When  Giris yap butonuna tiklar
    Then  Acilan sayfadaki kutucuklara email ve password girer
    And   Siteye login oldugunu dogrular
    And   Arama kutusuna arko yazar ve cikan ilk urundeki whislist ikonuna tiklar ve acilan istek listesi kismina favorilerim yazar ve ekle butonuna tiklar
    And   Hesabim butonu yanindaki kalp ikonuna yani favorilerim'e tiklar
    And   Ekledigi urunun listelendigini dogrular
    Then  Hesabim butonu yanindaki kalp ikonuna yani favorilerim'e tiklar
    And   Liste adini duzenle'ye tiklar acilan penceredeki liste adini gunceller ve kaydet butonuna tiklar
    And   Liste adinin guncellendigini dogrular
    Then  Hesabim butonu yanindaki kalp ikonuna yani favorilerim'e tiklar
    And   Acilan Favorilerim sayfasindaki sil ikonuna tiklar sonra yeni acilan penceredeki sil butonuna tiklar
    And   Liste adinin silindigini dogrular
