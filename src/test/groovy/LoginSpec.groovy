/**
 * Created by framgiavn on 7/24/15.
 */
import geb.Browser
import geb.Page
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test
//import org.testng.annotations.Test
//import org.openqa.selenium.InternetExplore.InternetExplorerDriver;
//import geb.spock.GebSpec
import geb.spock.GebReportingSpec

class LoginSpec extends GebReportingSpec {
    //	def setup() {
    //		browser.getDriver()
    //		driver.manage().window().maximize()
    //		browser.config.autoClearCookies = false
    //	}
    def "login with blank username and password"(){

        given: "I'm at the sign up form"
        to LoginPage

        when: "I signup as an invalid user"
        submitButton.click(LoginPage)

        then: "I'm at the sign up page again "
        errorHeading == "email or password is incorrect"
    }
//	@Test(priority= 2)
    def "login with invalid username and password"(){

        given: "I'm at the sign up form"
        to LoginPage

        when: "I signup as an invalid user"
        username = "bakabanri123@gmail.com"
        password = "framgia001"
        submitButton.click(LoginPage)

        then: "I'm at the sign up page again "
        errorHeading == "email or password is incorrect"
    }
//	@Test(priority= 3)
    def "login with valid username and password"(){

        given: "I'm at the sign up form"
        to LoginPage

        when: "I signup as an invalid user"
        username = "nguyen.thanh.dat@framgia.com"
        password = "framgia001"
        submitButton.click()

        then: "I'm at the sign up page again"
        at DashboardPage
    }
}