@negative
Feature: US01 Kullanıcı https://www.gratis.com/ Login olabilmeli

  Background: gratis.com
    Given siteye git
    When giris yap butonuna tikla
    And acilan dropdown menude ki giris yap linkine tikla


  Scenario Outline: TC01
    And    Kullanici "<Eposta-Cep>" eposta-Cep kutusunu boş bırakır
    And     Kullanici "<Sifre>" sifre kutusunu boş bırakır
    And     Kullanici giris yap butonuna tiklar
    Then    login isleminin gerceklesmedigini dogrular

    Examples:
      | Eposta-Cep | Sifre |
      |            |       |

  Scenario Outline: TC02
    And     Kullanici "<Eposta-Cep>" eposta-Cep kutusunu boş bırakır
    And     Kullanici "<Sifre>"  kutusuna sifre girisi yapar
    And     Kullanici giris yap butonuna tiklar
    Then    login isleminin gerceklesmedigini dogrular

    Examples:
      | Eposta-Cep | Sifre     |
      |            | 654321gG* |

  Scenario Outline: TC03
    And     Kullanici "<Eposta-Cep>" kutusuna  eposta-Cep girisi yapar
    And     Kullanici "<Sifre>" kutusunu bos birakir
    And     Kullanici giris yap butonuna tiklar
    Then    login isleminin gerceklesmedigini dogrular

    Examples:
      | Eposta-Cep              | Sifre |
      | mustafa.bykgz@gmail.com |       |


  Scenario Outline: TC04
    And     Kullanici "<Eposta-Cep>" kutusuna  hatalı eposta-Cep girisi yapar
    And     Kullanici "<Sifre>"  kutusuna sifre girisi yapar
    And     Kullanici giris yap butonuna tiklar
    Then    login isleminin gerceklesmedigini dogrular

    Examples:
      | Eposta-Cep              | Sifre     |
      | mustafa.bykgz@xmail.com | 654321gG* |

  Scenario Outline: TC05
    And     Kullanici "<Eposta-Cep>" kutusuna  hatalı eposta-Cep girisi yapar
    And     Kullanici "<Sifre>"  kutusuna sifre girisi yapar
    And     Kullanici giris yap butonuna tiklar
    Then    login isleminin gerceklesmedigini dogrular

    Examples:
      | Eposta-Cep    | Sifre     |
      | 555 555 55 55 | 654321gG* |

  Scenario Outline: TC06
    And     Kullanici "<Eposta-Cep>" kutusuna  @ olmadan eposta-Cep girisi yapar
    And     Kullanici "<Sifre>"  kutusuna sifre girisi yapar
    And     Kullanici giris yap butonuna tiklar
    Then    login isleminin gerceklesmedigini dogrular

    Examples:
      | Eposta-Cep             | Sifre     |
      | mustafa.bykgzgmail.com | 654321gG* |

  Scenario Outline: TC07
    And     Kullanici "<Eposta-Cep>" kutusuna  eposta-Cep girisi yapar
    And     Kullanici "<Sifre>" kutusuna hatali sifre girisi yapar
    And     Kullanici giris yap butonuna tiklar
    Then    login isleminin gerceklesmedigini dogrular

    Examples:
      | Eposta-Cep              | Sifre       |
      | mustafa.bykgz@gmail.com | 654321gGGG* |





