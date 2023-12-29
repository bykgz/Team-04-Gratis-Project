

Feature: Kullanıcı https://www.gratis.com/ Login olabilmeli

Background: siteye gider
  Given siteye git
  When giris yap butonuna tikla
  And  acilan dropdown menude ki giris yap linkine tikla

  @US01_Smoke
  Scenario: TC01 kullanici login olabilmeli
    And  E-posta-cep telefonu kutusuna eposta girisi yap
    And  sifre kutusuna geçerli bir veri gir
    And  ikinci giris yap butonuna tikla
    Then login isleminin gerceklestigini dogrula


  @US01_Smoke
  Scenario: US01 Kullanıcı cep no ile Login olabilmeli
    And  E-posta-cep telefonu kutusuna cep telefonu girisi yap
    And  sifre kutusuna geçerli bir veri gir
    And  ikinci giris yap butonuna tikla
    Then login isleminin gerceklestigini dogrula

