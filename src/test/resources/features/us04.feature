Feature: US04_Gratis_Task
  @Gratis_US_04
  Scenario: TC01_Magazalarimiz_linki_aktif_bir_sekilde_calismali

    Given Kullanıcı url e gider
    When Ana sayfada sag üst kösede bulunan Magazalarımız modulune tiklar.
    Then Magazalarimiz sayfasinin acildigini dogrular
    Then Magazalarimiz sayfasinda mevcut magazalarin bir listesi görüntülenir.
    And Kullanici sayfayi kapatir

  @Gratis_US_04
  Scenario: TC02_Magazalarimiz_linki_aktif_bir_sekilde_calismali

    Given Kullanıcı url e gider
    When Ana sayfada sol alt kösede bulunan Magazalarımız modulune tiklar.
    Then Magazalarimiz sayfasinin acildigini dogrular
    Then Magazalarimiz sayfasinda mevcut magazalarin bir listesi görüntülenir.