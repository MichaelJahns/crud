package michaelj.crud.crud.account;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping("/home")
    public String farts() { return "home"; }
}
