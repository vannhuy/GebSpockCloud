/**
 * Created by framgiavn on 7/24/15.
 */
import geb.Page

class DashboardPage extends Page {

    static at = { $(".definition-title").text() == "Definition of test noun from the Oxford Advanced Learner's Dictionary" }

/*    static content = {

        header { $(".definition-title")}


    }*/

}
