package in.arjun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/public")
public class PublicController {

    @GetMapping("/info")
    public String publicInfo() {
        return "arjun";
    }
}
