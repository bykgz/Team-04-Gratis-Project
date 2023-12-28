Feature: US07 Kullanıcı Elektronik Ürünler kategorisinde stokta olan tüm ürünleri listeyebilmeli
  Background: Siteye git
  And kullanici siteye gider
    And elektirikli urunler sekmesine tikla

  Scenario: TC01 elektronik ürünler listelenebilmeli
    Then ilgili urunlerin listelendigini dogrula

  Scenario: TC02 stoktaki ürünler listelenebilmeli
    And stokta var tickbox ina tikla
    Then stokta olan urunlerin listelendigini dogrula

  Scenario: TC03 stoktaki ürünlerin bilgilerine erisebilmeli
    And stokta var tickbox ina tikla
    And listeden bir urunu sec ve tikla
    Then urun detaylarinin goruntulendigini dogrula








