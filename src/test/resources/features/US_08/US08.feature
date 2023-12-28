Feature: US08 Kullanıcı herhangi bir kategoride seçeceği bir ürünün stok kontolünü yapabilmeli
  Background: Siteye git
    And kullanici siteye gider

  Scenario: TC01 secilen bir ürünün stokta kac adet bulunduğu  bilgisi görülmeli
    Given arama kutusuna ruj yazip arat
    And cikan listede ilk urune tikla
    When urun stok adet bilgisini ogrenmek icin max urun adedini sec
    Then urun stok bilgisinin kontrol edildigini dogrula


  Scenario: TC02 stokta olmayan bir ürün seçildiğinde stokta olmadıgı bilgisi görülmeli
    Given arama kutusuna "Xiaomi Watch S1 Active GL (Ocean Blue)" yazip arat
    And cikan listeden urune tikla
    Then urun stokta olmadigi bilgisinin goruldugunu dogrula

  Scenario: TC03 stokta olmayan bir ürün seçildiğinde sepete eklenememeli
    Given arama kutusuna "Xiaomi Watch S1 Active GL (Ocean Blue)" yazip arat
    And cikan listeden urune tikla
    Then urunun sepete eklenemedigini dogrula

