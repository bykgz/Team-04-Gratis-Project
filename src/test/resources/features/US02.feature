Feature: US_02 Kullanıcı search box kutusunda arama yapabilmeli.

  Background: siteye gider
    Given siteye git

  Scenario: TC01 Kullanıcı search box kutusunda arama yapabilmeli.
    And  search edilecek kelimeyi yaz
    And   enter tusuna bas veya search butonuna tikla
    Then   search isleminin gerceklestigini dogrula

  Scenario: TC02 Kullanıcı search box ı boş bıraktığında arama yapamamalı
    And   search kutusunu bos birak
    Then search isleminin gerceklesmedigini dogrula


  Scenario: TC03 Kullanıcı search box a tıklayabilmeli ve veri girebilmeli
    And  sayfanin header bolumundeki search box a tikla
    And  search edilecek kelimeyi yaz
    Then searcbox a tiklanabildigini ve veri girilebildigini dogrula

  Scenario: TC04 Kullanıcı search box a geçersiz karakter veya sembol girip arama yaptığında herhangi bir sonuc bulunamamalı
    And  sayfanin header bolumundeki search box a tikla
    And  search kutusuna gecersiz bir veri gir
    And   enter tusuna bas veya search butonuna tikla
    Then herhangi bir sonuc bulunamadigini dogrula

  @mstf
  Scenario: TC05 Kullanıcı search işlemi yaptığında , aradıgi kelime ile alakalı  sonuclar bulmali
    And  sayfanin header bolumundeki search box a tikla
    And  search edilecek kelimeyi yaz
    And  enter tusuna bas veya search butonuna tikla
    Then search edilen kelime ile alakali sonuclarin bulundugunu dogrula




