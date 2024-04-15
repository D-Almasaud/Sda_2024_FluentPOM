package tests;


import io.cucumber.messages.types.Duration;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ContactListLogInPage;

public class LoginTest {

    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds);
        driver.manage().window().maximize();

        ContactListLogInPage logInPage = new ContactListLogInPage(driver);

        logInPage.enterEmail("sdatest@tester.com");
        logInPage.enterPassword("tester.123");
        logInPage.clickSubmit();

    }

}
