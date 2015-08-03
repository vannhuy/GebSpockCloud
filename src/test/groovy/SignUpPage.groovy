import geb.Page

class SignUpPage extends Page {
    static url = "/users/new"
    static content = {
        // Get err tag when login fail
        errorHeading { $(".alert.fade.in.alert-danger").text().substring($(".alert.fade.in.alert-danger .close").text().length()+1) }
        // Get login form
        loginForm { $("form") }
        nickname { $("input[id=user_name") }
        username { $("input[id=user_username") }
        email { $("input[id=user_email") }
        password { $("input[id=user_password") }
        passwordConfirm { $("input[id=user_password_confirmation") }
        submitButton{ loginForm.find("input", name: "commit") }

    }
}
