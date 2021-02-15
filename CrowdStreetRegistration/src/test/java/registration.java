import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registration extends PageObject{

    public registration(WebDriver driver){super(driver);}
    private final String Email = "tpro3561@gmail.com";
    private final String FIRST_NAME = "Hassan";
    private final String LAST_NAME = "Ismail";
    private final String PASSWORD = "Hassan1234!@";
    private final String REFERRED_BY = "Friend";
    private final String PHONE_NUMBER = "4254445555";
    private final String STREET_ADDRESS = "123456 Madison Way";
    private final String CITY = "Seattle";
    private final String ZIP_CODE = "98031";

    @FindBy(xpath = "//a[contains(text(),'Create An Account']")
    private WebElement create_an_account;

    @FindBy(id="create_account_email")
    private WebElement create_account_email;

    @FindBy(xpath = "//*[@class='component-container width--full-width sc-bdVaJa hgkmdP']//form/div[2]/div[1]/div[1]/input")
    private WebElement first_name;

    @FindBy(xpath = "//*[@class='component-container width--full-width sc-bdVaJa hgkmdP']//form/div[3]/div[1]/div[1]/input")
    private WebElement last_name;

    @FindBy(xpath = "//*[@class='component-container width--full-width sc-bdVaJa hgkmdP']//form/div[3]/div[1]/div[1]/input")
    private WebElement password;

    @FindBy(xpath = "//*[@class='component-container width--full-width sc-bdVaJa hgkmdP']//form/div[3]/div[3]/div[1]/input")
    private WebElement confirm_password;

    @FindBy(xpath = "//*[@class='component-container width--full-width sc-bdVaJa hgkmdP']//form/div[5]/div[1]/input")
    private WebElement referred_by;

    @FindBy(xpath = "//*[@class='component-container width--full-width sc-bdVaJa hgkmdP']//form/div[7]/div[1]/input")
    private WebElement phone_number;

    @FindBy(xpath = "//*[@class='component-container width--full-width sc-bdVaJa hgkmdP']//form/div[9]/div[1]/input")
    private WebElement street_address;

    @FindBy(xpath = "//*[@class='component-container width--full-width sc-bdVaJa hgkmdP']//form/div[10]/div[1]/input")
    private WebElement city;

    @FindBy(xpath = "//*[@class='component-container width--full-width sc-bdVaJa hgkmdP']//form/div[11]/div[1]/div[1]/div/i")
    private WebElement state_drop_down;

    @FindBy(xpath = "//*[@class='component-container width--full-width sc-bdVaJa hgkmdP']//form/div[11]/div[1]/div[1]/div/div[2]/div[48]/span")
    private WebElement washington;

    @FindBy(xpath = " //*[@class='component-container width--full-width sc-bdVaJa hgkmdP']//div[11]/div[2]/div[2]/input")
    private WebElement zip_code;

    @FindBy(xpath = "//*[@class='component-container width--full-width sc-bdVaJa hgkmdP']//form/div[12]/div[1]/div/i")
    private WebElement country_drop_down;

    @FindBy(xpath = "//*[@class='component-container width--full-width sc-bdVaJa hgkmdP']//form/div[12]/div[1]/div/div[2]/div[2]/span")
    private WebElement usa_option_in_country_drop_down;

    @FindBy(xpath = "//*[@class='component-container width--full-width sc-bdVaJa hgkmdP']//div[1]/div[1]/div[2]/div/label[1]/div")
    private WebElement yes_option_in_accredited_investor;

    @FindBy(xpath = "//*[@class='component-container width--full-width sc-bdVaJa hgkmdP']//div[1]/div[1]/div[2]/div/label[1]/div")
    private WebElement agree_check_box;

    @FindBy(xpath = "//*[@class='component-container width--full-width sc-bdVaJa hgkmdP']//div[2]/div[1]/div[2]/label/div")
    private WebElement understand_check_box;

    @FindBy(xpath = "//div[@class='recaptcha-checkbox-spinner']")
    private WebElement not_a_robot_button;

    @FindBy(xpath = "//*[@id=\"content-well\"]/div[1]/div/div/div[1]/div/div/div[2]/button")
    private WebElement complete_your_info;


    public void clickOnCreateAnAccountButton(){this.create_an_account.click();}

    public void enterEmail(){this.create_account_email.sendKeys(Email);}

    public void enterFirstName(){this.first_name.sendKeys(FIRST_NAME);}

    public void enterLastName(){this.last_name.sendKeys(LAST_NAME);}

    public void enterPassword(){this.password.sendKeys(PASSWORD);}

    public void confirmPassword(){this.confirm_password.sendKeys(PASSWORD);}

    public void enterReferredBY(){this.referred_by.sendKeys(REFERRED_BY);}

    public void enterPhoneNumber(){this.phone_number.sendKeys(PHONE_NUMBER);}

    public void enterStreetAddress(){this.street_address.sendKeys(STREET_ADDRESS);}

    public void enterCity(){this.city.sendKeys(CITY);}

    public void tapOnStateDropDown(){this.state_drop_down.click();}

    public void tapOnWashington(){this.washington.click();}

    public void enterZipCode(){this.zip_code.sendKeys(ZIP_CODE);}

    public void tapOnCountryDropDown(){this.country_drop_down.click();}

    public void selectUSAinCountryDropDown(){this.usa_option_in_country_drop_down.click();}

    public void tapOnYesAsAccreditedInvestor(){this.yes_option_in_accredited_investor.click();}

    public void tapOnAgreeCheckBox(){this.agree_check_box.click();}

    public void tapOnUnderstandCheckBox(){this.understand_check_box.click();}

    public void selectNotARobotButton(){this.not_a_robot_button.click();}

    public void ClickOnCompleteYourInfoButton(){this.complete_your_info.click();}



}
