package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String mainpageGET(Model model) {
        return "login";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String mainpagePOST(Model model) {

    }

}
