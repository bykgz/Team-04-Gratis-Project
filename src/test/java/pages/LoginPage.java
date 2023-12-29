package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = ".log-box.dropper.ng-star-inserted")
    public WebElement girisYapButton1;

    @FindBy(xpath= "//a[normalize-space() = 'Giriş Yap']")
    public WebElement girisYapLink;

    @FindBy(css= "input[placeholder= 'E-Posta adresinizi veya telefon numaranızı giriniz']")
    public WebElement epostaBox;

    @FindBy(css= "input[placeholder='Şifrenizi giriniz']")
    public WebElement passwordBox;

    @FindBy(css= "button.round-btns")
    public WebElement girisYapButton2;

    @FindBy(xpath= "//a[normalize-space() = 'HESABIM']")
    public WebElement hesabımText;


















    //Mesut
    @FindBy(css = ".log-box.dropper.ng-star-inserted")
    public WebElement loginButtonMe;
    @FindBy(xpath = "(//li[@class=\"highlighted ng-star-inserted\"])[1]")
    public WebElement loginButtonGirisMe;
    @FindBy(xpath = "(//input[@class='ng-untouched ng-pristine ng-invalid'])[1]")
    public WebElement loginEmailMe;
    @FindBy(xpath = "(//input[@class=\"search-input\"])[1]")
    public WebElement searchTabMe;
















    //Mesut
}
