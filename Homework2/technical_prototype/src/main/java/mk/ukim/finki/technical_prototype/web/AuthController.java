package mk.ukim.finki.technical_prototype.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/*
The login and register logic will be implemented in the next assignments.
Since this is just a technical prototype, it is not needed yet.
 */

@Controller
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/login")
    public String getLoginPage(Model model) {
        model.addAttribute("bodyContent", "login_page");
        return "master_template.html";
    }

    @GetMapping("/register")
    public String getRegisterPage(Model model) {
        model.addAttribute("bodyContent", "register_page");
        return "master_template.html";
    }
}
