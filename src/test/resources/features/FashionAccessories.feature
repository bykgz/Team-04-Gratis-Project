Feature: US_005 Moda/Aksesuar modülu gorulebilmeli ve Alt kategoriler filtresi secilebilmeli.
  @all
  Scenario: Moda/Aksesuar modulu gorulebilmeli ve Alt kategoriler filtresi secilebilmeli.
  Given Kullanıcı Web Sitesine Gider
  When Moda ve Aksesuar sayfasi tıklanır.
  Then Mause yukarı hareket ettirilir.
  Then Moda ve Aksesuar sayfasinin gorunurlugu dogrulanir.
  Then Alt Kategoriler filtresinden "Bijuteri & Takılar" secilir.
  Then Filtrenin uglunandigi dogrulanir.
  Then Filtre sonucu cikan urun listesi dogrulanir.
  And Sayfa Kapatılır.










