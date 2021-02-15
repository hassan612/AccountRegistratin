import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private static final WebDriver driver = new ChromeDriver();

   @BeforeSuite
    public static void main(String[] args){
        System.setProperty("webdriver.chromedriver", Utils.CHROME_DRIVER_LOCATION);
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test(testName = "Create new account")
    public static void createAccount(){
       driver.get(Utils.URL);
       registration reg = new registration(driver);
       reg.clickOnCreateAnAccountButton();
       reg.enterEmail();
       reg.enterFirstName();
       reg.enterLastName();
       reg.enterPassword();
       reg.confirmPassword();
       reg.enterReferredBY();
       reg.enterPhoneNumber();
       reg.enterStreetAddress();
       reg.enterCity();
       reg.tapOnStateDropDown();
       reg.tapOnWashington();
       reg.enterZipCode();
       reg.tapOnCountryDropDown();
       reg.selectUSAinCountryDropDown();
       reg.tapOnYesAsAccreditedInvestor();
       reg.tapOnAgreeCheckBox();
       reg.tapOnUnderstandCheckBox();
       reg.selectNotARobotButton();
       reg.ClickOnCompleteYourInfoButton();
    }

    @AfterSuite
    public static void tearDown(){
       driver.close();
    }
}
