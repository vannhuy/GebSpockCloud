//import spock.lang.Stepwise;
import geb.Browser
import geb.Page
import org.junit.Test
import geb.spock.GebReportingSpec
//@Stepwise
class SignUpSpec extends GebReportingSpec {
    def "SignUp with blank username and password"(){

        given: "I'm at the sign up form"
        to SignUpPage

        when: "I signup as an invalid user"
        submitButton.click(SignUpPage)

        then: "I'm at the sign up page again"
        errorHeading == "Email is invalid"
    }

//	def "login with invalid username and password"(){
//
//		given: "I'm at the sign up form"
//		to SignUpPage
//
//		when: "I signup as an invalid user"
//		nickname = "Nhung Nguyen"
//		username = "nhungNguyen"
//		email    = "hikarushindou01@gmail.com"
//		password = "framgia001"
//		passwordConfirm = "framgia001"
//		submitButton.click()
//
//		then: "I'm at the sign up page again "
//		at DashboardPage
//	}
}
